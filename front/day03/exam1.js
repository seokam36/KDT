console.log("JS")
 
//[1] 숫자타입
// 1.정수
console.log(10)
console.log(typeof 10)

// 2. 실수
console.log(3.14)
console.log(typeof 3.14)

// [2]문자열 타입
// 1. ' '
console.log('안녕')
console.log("안녕")
console.log(`안녕`)

// 2. 문자열 연결
console.log("안녕"+"하세요")
console.log("안녕","하세요")
console.log(`안녕 ${ 3 }`) // 문자열 템플릿 : 문자열내 다른 타입 코드 표현
console.log(`안녕` + 3) // 문자열 + 숫자 -> 문자열
let a = 10
console.log('안녕' + a)
console.log(`안녕 ${a}`) // `백틱으로 감싼 자료 안에 ${} 이용하여 코드 포함
