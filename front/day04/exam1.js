// 1. if문 if(조건식)
if(10>3)
    console.log("10은 3보다 크다")
if(10>30)
    console.log("10은 30보다 크다") // 실행 X

// 2. 실행문 2개 이상이면 중괄호로 묶음
if(10>3){
    console.log("10은 3보다 크다")
    console.log("3")
}

// 3. if else문 true랑 false 분기처리
if(10 > 3){
    console.log("10은 3보다 크다");
} else {
    console.log("10보다 작다");
}

// 4. if ~ else if ~ else if ~ else 다수 조건에 따른 결과를 1개만 처리
if(10>3){
    console.log("10은 3보다 크다")
} else if(10>2){
    console.log("10은 2보다 크다")
} else if(10>1){
    console.log("10은 1보다 크다")
} else {
    console.log("거짓")
}

// vs if if if 다수 조건 에 따른 다수 결과를 처리
if(10>3){
    console.log("10은 3보다 크다")
} if(10>2){
    console.log("10은 2보다 크다")
} if(10>1){
    console.log("10은 1보다 크다")
} else {
    console.log("거짓")
}

// 5. 중첩 if
let 성별 = "남"
let 점수 = 90
if (성별=="여"){
    if(점수>=90){
        console.log("여학생 우수")
    } else {
        console.log("여학생")
    }
} else {
    if(점수>=80){
        console.log("남학생 우수")
    } else {
        console.log("남학생")
    }
}