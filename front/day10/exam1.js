/*
    함수 : 미리 정의된 코드
*/

// 1. 미리 만들어진 함수 : 라이브러리, 각 프로그래밍 회사에서 제공
console.log("함수1")
// document.querySelector('body').innerHTML = '함수2'

// 2. 내가 만드는 함수 : 정의함수, 개발자가 직접 정의, * 함수도 자료의 타입 *
function func1(param1){
    // 실행코드
    console.log(param1)
}

// 함수 호출
func1(3)


// 예시 : 믹서기함수는 과일을 매개변수로 받아서 과일주스를 반환
function mixer(fruit){
     return fruit+"juice" // 반환값
}

let cup1 = mixer('apple')  // 믹서기함수에 사과를 인자값으로 전달하여 ?? 반환
let cup2 = mixer('grape')  // 믹서기함수에 포도를 인자값으로 전달하여 ?? 반환

// 예시2 : 
function mathFunc(x, y){
    a = x + y
    return a
}

let result1 = mathFunc(3, 5)
let result2 = mathFunc(-3, -2)

// 1. 매개변수x, 반환값x
function func2(){
    y = 3 + 2
    console.log("func2 exe")
}
func2()

// 2. 매개변수o, 반환값x
function func3(x){
    console.log("func3 exe")
    y = x + 2
}
func3(10)

// 3. 매개변수o, 반환값o
function func4(x){
    console.log("func4 exe")
    y = x + 2
    return y
}
let result4 = func4(5)

// 4. 매개변수x, 반환값o
function func5(){
    console.log("func5 exe")
    y = 3 + 2
    return y
}
let result5 = func5()



// 지역변수 : if, for, function 문법 { } 에서 선언 된 변수
let 전역변수 = '대한민국'
if(true){
    let 지역변수1 = "경기도" 
    console.log(전역변수) // { } 밖으로 나가는 불가능 하지만 { } 안으로 들어가는건 가능
    for(let i = 0; i < 1; i++){
        let 지역변수2 = "안양시"
        console.log(지역변수1) 
        console.log(지역변수2) 
    }
    //console.log(지역변수2) // 오류 : { } 밖으로 나가는건 불가능
    if(true){
        let 지역변수3 = "성남시"
        //console.log(지역변수2) // 오류
    }
}

console.log(전역변수) // 오류 X
// console.log(지역변수1) // 오류 : 지역변수1은 if에서 선언했으므로 그안에서만 사용가능


// 지역변수2 : if, for과 다르게 function은 return 반환 키워드
function func6(){
    let 지역변수4 = "수원시"
    return 지역변수4
}
let 전역변수2 = func6


// HTML에서 함수 호출
function func7(){
    console.log("func7 exe")
}
// 1. JS에서 함수 호출 방법
func7()

// 2. HTML 에서 함수 호출 방법 : <마크업 onClick="JS함수명()"/>