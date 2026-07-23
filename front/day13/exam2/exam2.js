/* 
    QueryString : URL 웹 주소 상에 매개변수 사용
        - 페이지 이동 간에 매개변수 값 전달
        - URL ? 매개변수명=값 & 매개변수=값

        - new URLSearchParams(location.search) : 현재 주소상 위치 반환
*/
//[1] JS 에서 URL 정보 객체 호출
let url = new URLSearchParams(location.search)
console.log(url)
// http://127.0.0.1:5500/front/day13/exam2/exam2.html?name=유재석
let name = url.get('name')
console.log(name)

//[2] 페이지 이동하는 방법
//1. <a herf="URL?매개변수=값">
let pcode = url.get('pcode')
let page = url.get('page')
console.log(pcode, page)

//2. location.href = "URL?매개변수=값"
function link(){
    location.href = "exam2.html?name=강호동"
}

/* 
    인터벌 : 특저한 주기에 따라 코드를 반복 실행
    - 사용법
        setInterval(함수명, 밀리초)
            -> 함수명에 () 소괄호 넣지 말자!
            -> 1000밀리초 : 1초
*/
let value = 0
function 증가함수(){
    value++
    document.querySelector('#box1').innerHTML = value
}
setInterval(증가함수,1000)

function clock(){
    let today = new Date()
    let hour = today.getHours()
    let min = today.getMinutes()
    let sec = today.getSeconds()
    let time = `${hour} : ${min} : ${sec < 10 ? "0"+sec : sec}`
    document.querySelector('#box2').innerHTML = time
}
setInterval(clock, 1000)

// 인터벌 시작, 종료
let time = 0        // 초 저장
let timeInter       // 인터벌 저장

function timerStart(){
    timeInter = setInterval(timer, 1000)
}

function timer(){
    time++
    document.querySelector('#box3').innerHTML = time
}

function timerStop(){
    clearInterval(timeInter)
}