// 문제1

/* let fruitList = ['사과', '바나나']
let fruit = prompt("과일 이름 입력")

if(fruitList.indexOf(fruit) >= 0){
    console.log("이미 존재하는 과일입니다.")
} else {
    fruitList.push(fruit)
    console.log(fruitList)
} */

// 문제2

/* let num = prompt("주민번호 13자리 입력")
if (num[6] == "1" || num[6] == "3"){
    console.log("blue")
} else {
    console.log("red")
} */

// 문제3

/* let price = Number(prompt("총 구매 금액 입력"))
if (price >= 50000) {
    console.log(`할인된 가격 : ${price - price * 0.1}원`)
} else if (price >= 30000){
    console.log(`할인된 가격 : ${price - price * 0.05}원`)
} else if (price >= 10000){
    console.log(`할인된 가격 : ${price - price * 0.01}원`)
} else {
    console.log(`할인 X ${price}원`)
} */

// 문제4

/* let month = Number(prompt("월(Month)를 입력"))
if (month==3 || month==4 || month==5){
    console.log("봄")
} else if(month==6 || month==7 || month==8){
    console.log("여름")
} else if(month==9 || month==10 || month==11){
    console.log("가을")
} else if(month==12 || month==1 || month==2){
    console.log("겨울")
} else {
    console.log("잘못된 월입니다.")
} */

// 문제5

/* let num1 = Number(prompt("서로 다른 세개의 정수 입력"))
let num2 = Number(prompt("서로 다른 세개의 정수 입력"))
let num3 = Number(prompt("서로 다른 세개의 정수 입력"))

if(num1 > num2){
    if (num1 > num3){
        console.log(`가장 큰수 : ${num1}`)
    } else {
        console.log(`가장 큰수 : ${num3}`)
    }
} else {
    if (num2 > num3){
        console.log(`가장 큰수 : ${num2}`)
    } else {
        console.log(`가장 큰수 : ${num3}`)
    }
} */

// 문제6

/* let year = Number(prompt("연도(year) 입력"))
if((year%4==0 && year%100!=0) || year%400==0){
    console.log(`${year}은 윤년입니다.`)
} else{
    console.log(`${year}은 평년입니다`)
} */

// 문제7

/* let num1 = Number(prompt("서로 다른 세 개의 정수 입력"))
let num2 = Number(prompt("서로 다른 세 개의 정수 입력"))
let num3 = Number(prompt("서로 다른 세 개의 정수 입력"))
let changeNum

if (num1 > num2){
    changeNum = num2
    num2 = num1
    num1 = changeNum
}
if (num2 > num3){
    changeNum = num3
    num3 = num2
    num2 = changeNum
}
if (num1 > num2){
    changeNum = num2
    num2 = num1
    num1 = changeNum
}
console.log(`오름차순 정렬 : ${num1}, ${num2}, ${num3} `) */

// 문제8
/* let play1 = Number(prompt("0(가위), 1(바위), 2(보) 중 하나 입력"))
let play2 = Number(prompt("0(가위), 1(바위), 2(보) 중 하나 입력"))

if (play1 == 0){
    if(play2 == 2){
        console.log("플레이어1 승리")
    } else if(play2 == 1){
        console.log("플레이어2 승리")
    } else {
        console.log("무승부")
    }
} else if(play1 == 1){
    if(play2 == 0){
        console.log("플레이어1 승리")
    } else if(play2 == 2){
        console.log("플레이어2 승리")
    } else {
        console.log("무승부")
    }
} else {
    if(play2 == 1){
        console.log("플레이어1 승리")
    } else if(play2 == 0){
        console.log("플레이어2 승리")
    } else {
        console.log("무승부")
    }
} */

// 문제9
