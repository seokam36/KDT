
/*
10
"유재석"
true
{}
[]
function
undefined
null
*/

// 콘솔(결과물이 표현되는 구역) 에 출력
// 콘솔에 10 출력
console.log(10) // JS 문법

// 변수란? 하나의 자료 저장하는 메모리(컴퓨터 저장 단위) 공간
// 같은 파일내에 변수명은 중복 X
let 이름상자1 // "이름상자" 변수 상자 선언 초기화 X
let 이름상자2 = 10 // 서로 다른 변수명으로 변수 선언, 10으로 초기화

// 변수의 값 호출
이름상자2               // 변수명 작성하여 변수값 호출
console.log(이름상자2)  // 변수명 작성해서 변수값 호출, console에 출력

// 변수의 값 수정
이름상자2 = 100
console.log(이름상자2)

// 상수란? 하나의 자료를 저장하는 메모리 공간, 수정 X
const 이름상자3 = 300
이름상자3

// 생각해보기
let point1 = 50
let point2 = 50
let point3 = 100
let point4 = point1 + point2

// 변수는 4개 리터럴은 2개
// 변수의 특징 : 저장, 동일한 자료를 서로 다른 곳에 저장

// 출력함수
// 함수 : 자주 사용되는 코드들을 정의해서 재사용
// 1. console.log()
console.log("안녕하세요")

// 2. alert()
alert("안녕하세요")

// 3. document.querySelector("선택지").innerHTML
document.querySelector("h3").innerHTML = "JS에서 대입한값"

// 입력함수
// 1. confirm( 출력할 메시지 ) : 브라우저 [확인=true] [취소=false] 알림창
let 결과1 = confirm()
console.log(결과1)

// 2. prompt(출력할 메시지) : 브라우저에 입력가능한 알림창, 입력한 자료 반환
let 결과2 = prompt()
console.log(결과2)