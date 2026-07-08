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

// 3. 이스케이프(제어) 문자, \ 백슬래시
console.log("\\안녕") // "\" 출력
console.log("\n안녕") // 줄바꿈
console.log("\'안녕") // 문자열 감싼 기호 와 그자체 기호 구분
console.log("\t안녕") // 들여쓰기

// [3] 불리언 타입
console.log(true)  // 참 = 1
console.log(false) // 거짓 = 0
console.log( 10 > 3) // 비교 연산자의 반환값

// [4] undefined
let 과일상자
console.log(과일상자)   // 변수 선언했지만 초기화 하지않아서 undefined
let 채소상자 = null     // 변수 선언후 null 초기화
console.log(채소상자)   // null

// [5] 배열
let 배열변수 = ['봄', '여름', '가을', '겨울',['1학기', '2학기']]
console.log(배열변수) 
console.log(배열변수[0]) 
console.log(배열변수[4]) 
console.log(배열변수[4][1])

// 배열 수정 
// 변수명 = 새로운 배열         *변수(자료저장소) vs 배열(자료)*
배열변수 = ['a','b']
console.log(배열변수)
배열변수[0] = 'c'
console.log(배열변수)

// 배열 요소 추가
배열변수.push('d')      // 마지막 자료 뒤에 새로운 자료 추가
console.log(배열변수)

// 배열 요소 삭제
배열변수.splice(0,1) // 0번 인덱스에 요소 1개를 삭제
console.log(배열변수)

// 배열 요소 찾기
// indexof(찾을값) = 찾을값이 존재하면 인덱스 반환 없으면 -1
배열변수.indexOf('a')
console.log(배열변수.indexOf('b'))

// includes(찾을값) = 찾을값 존재하면 true 아니면 false
console.log(배열변수.includes('b'))

// [6] 타입 변환
// 자동 타입 변환
console.log(3 + 3.14) // 정수 + 실수  => 실수
console.log('a' + 30) // 문자 + 숫자 => 문자
console.log(3 + true) // 정수 + 논리 => 정수

// 직접 타입 변환
console.log(Number("10"))   // 문자열 10 -> 숫자형 10으로 변환
console.log(Number("10a"))  // NaN (not a number)
console.log(parseInt("10")) // 문자열 10 -> 정수 10으로 변환
console.log(parseFloat("3.14"))
console.log(String(10))     // 숫자형 10 -> 문자열 10 변환
console.log(10 + "")

// 추후에 JAVA/PYTHON/API 들을 통신할 경우
// JSON.parse( 통신결과물 )

// [7] 연산자
// 산술 연산자 : +, -, *, /, %
// 연결 연산자 : +
// 비교 연산자 : >, <, >=, <=, ==(값)같다, !=, ===(값/타입)같다, !==
// 논리연산자 : &&, ||
// 대입연산자 : =
// 복합대입연산자 : +=, -=, *=, /=, %= 오른쪽항의 값을 왼쪽항에 연산후 대입
// 증감연산자 : ++, --
// 삼항연산자 : 조건 ? 참 : 거짓

// [지문1] prompt 함수로 국어 , 영어 , 수학 점수를 각 입력받아서 (각 변수에 저장하고) 총점 과 평균을 계산하여 console탭에 출력하시오.
/* 
let 국어점수 = prompt("국어 점수")
let 영어점수 = prompt("영어 점수")
let 수학점수 = prompt("수학 점수")
let 총점 = Number(국어점수) + Number(영어점수) + Number(수학점수)
let 평균 = 총점/3
console.log(`총점 : ${총점} 평균 : ${평균}`) 
*/
 
// [지문2] prompt 함수로 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
/* 
let 반지름 = Number(prompt("반지름"))
console.log(`원의 넓이 = ${반지름*반지름*3.14}`) 
*/

// [지문3] prompt 함수로 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여console탭에 출력하시오

/* 
let 실수1 = Number(prompt("실수1 입력"))
let 실수2 = Number(prompt("실수2 입력"))
console.log(`앞 실수의 값이 뒤실수의 값의 비율 : ${실수1 / 실수2 * 100}%`)
 */

// [지문4] prompt 함수로 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로console탭에 출력하시오

/* let 정수 = Number(prompt("정수 입력"))
let 홀짝 = 정수%2 ? "true" : "false"
console.log(`입력받은 값 : ${홀짝}`)
 */

// [지문5] prompt 함수로 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로console탭에 출력하시오.

/* 
let 정수 = Number(prompt("정수 입력"))
let result = 정수%7 ? "false" : "true"
console.log(`${result}`)
 */

// [지문6] prompt 함수로 아이디 와 비밀번호를 입력받아서 (입력받은)아이디가 'admin' 이고 (입력받은)비밀번호가 1234 와 일치하면 true / 아니면 false 출력하시오.

/* 
let id = prompt("아이디 입력")
let password = Number(prompt("비밀번호 입력"))
let result = id == "admin" && password == 1234
console.log(`결과 : ${result}`)
 */

// [지문7] prompt 함수로 정수를 입력받아 입력받은 값이 홀수 이거나 7배수 이면 true / 아니면false 로 console탭에 출력하시오.

/* 
let i = Number(prompt("정수 입력"))
let result = i%7==0 || i%2==1
console.log(`입력받은 값 홀수이거나 7의 배수 : ${result}`)
 */

// [지문8] 1차점수 와 2차점수 prompt함수로 각 입력받아서 총점이 150점이상이면 '합격' 아니면'불합격' HTML의 <h3> 에 출력하시오.

/* 
let score1 = Number(prompt("1차 점수 입력"))
let score2 = Number(prompt("2차 점수 입력"))
let result = score1 + score2 >= 150 ? "합격" : "불합격"
document.querySelector("h3").innerHTML = `결과 : ${result}`
 */

// [지문9] 두 사람의 이름을 prompt함수로 각 입력받아서 만일 이름이 '유재석' 이면 뒤에 (방장) 이라고 이름 뒤에 붙이고 아니면 생략한다.  HTML의 <ol> 에 결과를 출력하시오.

/* 
let name1 = prompt("이름1 입력")
let name2 = prompt("이름2 입력")
let result1 = name1=="유재석" ? name1+"(방장)" : name1
let result2 = name2=="유재석" ? name2+"(방장)" : name2
document.querySelector("ol").innerHTML = `<li>${result1}</li> <li>${result2}</li>`
 */

// 증감연산자
let age = 30
console.log(age++) // console에 30 출력후 증가 -> 후위증가
console.log(++age) // console에 32 출력, 출력전에 증가 -> 선위증가
