/*
1. 기획서/요구사항 따른 프로토타입 

2. 메모리 설계
    1) 저장해야할 것들을 찾아보기, 카테고리/제품명/가격/이미지/등록일
    2) 속성들 간의 종속관계 파악
    3) 쪼개진 테이블 간 연관 만들기, 관계형데이터베이스
        3-1) 테이블당 식별자(PK) 1개 이상 권장
        3-2) 상하관계 파악해서 식별자 하위요소 저장 (FK 외래키)
    4) JS로 표현, 표 = 배열 / 객체 = 행 / 열 = 속성

3. 기능 설계 : CRUD , RESTAPI
    등록(CREATE) : 게시물쓰기, 회원가입 등
    조회(READ) : 게시물전체조회, 마이페이지 등
    수정
    삭제
 */


// 메모리 설계
let categoryList = [
    {'ccode':1, 'cname':'음료'},
    {'ccode':2, 'cname':'과자'}
]

let productList = [
    {'pcode':1, 'pname':'콜라', 'pprice':1000, 'pimg':'https://placehold.co/100x100', 'pdate':'2026-07-22', 'ccode':1},
    {'pcode':2, 'pname':'사이다', 'pprice':1500, 'pimg':'https://placehold.co/100x100', 'pdate':'2026-07-23', 'ccode':1}
]

//[1] 전체조회 함수
productPrint() // JS가 열릴때 최초 1번 실행
function productPrint(){
    //1. 어디에
    let tbody = document.querySelector('#main table tbody')
    //2. 무엇을 , 배열내 모든 객체들을 HTML형식 구성
    let html = ""
    for(let i=0; i<productList.length; i++){
        let product = productList[i]

        // 현재 i번째 제품의 카테고리번호에 해당하는 카테고리명 찾기
        for(let j=0; i<categoryList.length; j++){
            if(categoryList[j].ccode == productList[i].ccode){
                cname = categoryList[j].cname
                break
            }
        }
        // 샘플 HTML 존재하면 복사해서 `백틱 사이 붙
        html += `<tr>                                       
                    <td> <img src="${product.pimg}"/> </td>
                    <td> ${cname} </td> 
                    <td> ${product.pname} </td>
                    <td> ${product.pprice} </td> 
                    <td> ${product.pdate} </td> 
                    <td> 
                        <button class="deleteBtn" onclick="productDelete( ${product.pcode} )">삭제</button> 
                        <button class="updateBtn" onclick="productUpdate( ${product.pcode} )">수정</button> 
                    </td>
                </tr>`
    }
    //3. 출력
    tbody.innerHTML = html
}

//[2] 삭제 함수, 삭제할 제품 코드 매개변수로
function productDelete(pcode){
    for(let i=0; i<productList.length; i++){
        if(productList[i].pcode == pcode){
            productList.splice(i,1)             // 배열요소 삭제 splice(인덱스, 개수)
            alert('삭제 성공')
            productPrint()                      //화면 최신화 (전체조회 새로고침 == 재랜더링)
            return 
        }
    }
}

//[3] 수정 함수
function productUpdate(pcode){
    for(let i=0; i<productList.length; i++){
        if(productList[i].pcode == pcode){
            let newPname = prompt("수정할 제품명 입력하세요")
            let newPprice = prompt("수정할 가격 입력하세요")
            productList[i].pname = newPname
            productList[i].pprice = newPprice
            productPrint()
            return
        }
    }
}

//[4] 등록 함수
let finalPcode = 2
function productAdd(){
    //1. 입력받은 값 가져오기
    let category = document.querySelector('.category').value
    let name = document.querySelector('.name').value
    let price = document.querySelector('.price').value
    let image = document.querySelector('.image').files[0]  //.files[0] , 첨부파일 중 첫번째 파일 가져오기
    
    // 카테고리 유효성 검사
    if(category == 'disabled'){
        alert('카테고리를 선택하세요')
        return                          // return -> 아래코드 실행하지않고 함수 종료
    }

    //2. 입력받은 값 객체화
        //pcode : 제품식별번호로 사용자가 지정하지 않고 자동번호 부여 , 마지막 사용된 제품코드에 + 1
        //pdate : 현재날짜/시간 함수 , new Date()
    let pdate = `${new Date().getFullYear()}-${new Date().getMonth()}-${new Date().getDate()}`
    let object = {ccode:category, pname:name, pprice:price,
                // 첨부파일 선택안하면 undefined 
                pimg:image == undefined ? 'https://placehold.co/100x100' : URL.createObjectURL(image),  //
                pcode:finalPcode+1,pdate:pdate}
    console.log(object)

    //3. 배열 저장
    productList.push(object)
    finalPcode++

    //4. 성공 , 화면최신화
    alert("성공")
    productPrint()
}

