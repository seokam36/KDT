// 반복문 : for문
//[1]
console.log("안녕")
console.log("안녕")
console.log("안녕")

// 어디부터(초기값) 어디까지(조건식) 증감하면서 무엇을(실행문) 반복
for(let 반복수 = 1; 반복수 <= 3; 반복수++){
    console.log("안녕")
}

// [2] 1~5까지 출력
for(let num = 1; num <= 5; num++){
    console.log(num)
}

// [3] 1~5까지 총합계
let total = 1
for(let a=2; a<=5; a++){
    total += a;
}
console.log(total)

// [4] 구구단
for(let dan=2; dan<=9; dan++){
    for(let gu=1; gu<=9; gu++){
        console.log(`${dan} * ${gu} = ${dan*gu}`)
    }
}

// [5] 3개의 문자열을 입력받아 배열에 저장
let array = []
for(let i=0; i<3; i++){
    let sc = prompt("세개의 문자열 입력")
    array.push(sc)
}
console.log(array)