//문제1
/* 
let a = Number(prompt("삼각형 밑변 입력"))
let b = Number(prompt("삼각형 높이 입력"))
console.log(`삼각형의 넓이 : ${a*b/2}`)
 */

//문제2
/* 
let temp = Number(prompt("섭씨 온도 입력"))
console.log(`화씨 온도 : ${temp*9/5+35}`)
 */

//문제3
/* 
let age = Number(prompt("태어난 연도 입력"))
console.log(`2025년 기준 나이 : ${2025-age}살`)
 */

//문제4
/* 
let height = Number(prompt("키 입력"))
let weight = Number(prompt("몸무게 입력"))
console.log(`BMI 지수 : ${weight/((height/100)*(height/100))}`)
 */

//문제5
/* 
let id = prompt("아이디 입력")
let email = prompt("이메일 입력")
let result = id=="admin" || email=="admin@test.com" ? "관리자" : "일반 사용자"
console.log(`결과 : ${result}`)
 */

//문제6
/* 
let score = Number(prompt("점수 입력"))
let result = score>=90 ? "A" : score>=80 ? "B" : "C"
document.querySelector("h2").innerHTML = `${result}`
 */

//문제7
/* 
let age = Number(prompt("나이 입력"))
let result = age>=20 && age<=29 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다."
console.log(`${result}`)
 */

//문제8
/* 
let likeCount = 3
console.log(`좋아요: [${++likeCount}]`)
 */

//문제9

let todoList = ["장보기", "과제하기"]
console.log(todoList)
let todo = prompt("할일을 추가하세요")
let todoList2 = todoList.push(todo)
console.log(todoList2)


//문제10
/* 
let waitingList = ['김민준', '이서연', '박도윤', '최지우']
let last = waitingList.pop()
console.log(`마지막 대기자 : ${last}`)
 */