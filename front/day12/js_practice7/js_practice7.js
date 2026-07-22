//미니 가계부 : 날짜, 항목, 금액 입력받아 테이블 출력
let list = [{date:"2025-06-19", todo:"점심식사", price:9000},
    {date:"2025-06-19", todo:"교통비", price:1500}]

//기능설계 : 등록, 출력
//  등록함수 : 등록버튼 클릭하면, 3개의 입력받은 값들을 가져와서 가계부목록에 객체로 저장
//  출력함수 : 페이지가 열리면, 등록성공하면, 현재 가게부목록에 저장된 객체들을 테이블에 출력

function create(){
    //1. 특정한 마크어베 입력받은 값 가져오기
    let date = document.querySelector(".date").value
    let todo = document.querySelector(".todo").value
    let price = document.querySelector(".price").value  //입력받은 값은 문자열

    //2. 객체 구성
    let obj = {date, todo, price}                       //객체생성시 속성값의 변수명 같으면 생략

    //3. 배열 저장
    list.push(obj)

    //4. 성공 안내
    alert("등록성공")

    //5. 등록한 값 초기화
    document.querySelector(".date").value = ""
    document.querySelector(".todo").value = ""
    document.querySelector(".price").value = ""

    //6. 출력
    printResult()
}

function printResult(){
    //1. 어디에
    let table = document.querySelector("table > tbody")
    //2. 무엇을 , 배열내 모든 객체들을 HTML 형식으로
    let html = ""
    for(let i=0; i < list.length; i++){
        let a = list[i]
        html += `<tr>
                    <td>${a.date}</td>
                    <td>${a.todo}</td>
                    <td>${a.price.toLocaleString()}원</td>
                </tr>`
    }
    //3. 출력
    table.innerHTML = html
}

printResult()