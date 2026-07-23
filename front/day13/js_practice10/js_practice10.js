
function signup(){
    // 1. 입력받은 값 가져오기
    let id = document.querySelector("#signId").value
    let pw = document.querySelector("#signPw").value

    //[*] localStorage에 memberList 배열 가져오기 *JSON 파싱*
    let memberList = JSON.parse(localStorage.getItem('memberList'))
    console.log(memberList)
    if(memberList == null){      //최초 등록이면 배열선언
        memberList = []
    }
    // 마지막 인덱스 회원번호 + 1
    let no = memberList.length == 0 ? 1 : memberList[memberList.length-1].no + 1

    // 2. 객체화
    let obj = {no, id, pw}
    console.log(obj)

    // 3. 배열 저장
    memberList.push(obj)
    console.log(memberList)

    // 4. 성공처리
    alert('회원가입 성공')

    // [*] localStorage 에 memberList 배열 저장하기
    localStorage.setItem('memberList', JSON.stringify(memberList))
}


function login(){
    let id = document.querySelector('#loginId').value
    let pw = document.querySelector('#loginPw').value

    // 입력받은 값 배열내 정보 와 비교
    // [*] localStorage 기존 배열 가져옴
    let memberList = JSON.parse(localStorage.getItem('memberList'))

    // 가져온 배열 비어있지않으면 배열전체 조회하면서 비교
    if(memberList != null){
    for(let i=0; i<memberList.length; i++){
        if(memberList[i].id == id && memberList[i].pw == pw){
            alert('로그인 성공')
            return
            }   
        }
    }

    alert('아이디 비밀번호를 확인하세요')
}