function write(){
    //입력받은값 가져오기
    let title = document.querySelector("#title").value
    let content = document.querySelector("#content").value
    let pw = document.querySelector("#pw").value

    console.log(title)
    //스토리지에서 값 가져오고 처음이면 새로운 배열 생성
    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }
    //가져온 값 객체화 시키고 고유번호 추가
    let obj = {title, content, pw}
    obj.no = boardList.length == 0 ? 1 : boardList[boardList.length-1].no + 1
    console.log(obj)
    boardList.push(obj)
    console.log(boardList)

    //객체화 시킨 값 다시 스토리지에 저장
    localStorage.setItem('boardList',JSON.stringify(boardList))

    //성공메시지
    alert("글쓰기 성공")
    location.href = "list.html"
}