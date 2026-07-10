// [1] 배열의 데이터를 하나씩 출력
let fruitList = ['사과', '포도', '딸기']

// length -> 배열내 요소 개수를 반환
for(let i =0; i <= fruitList.length-1; i++){
    console.log(fruitList[i])
}

// [2] 3개의 이름을 입력받아 배열에 저장하고 배열에 저장된 이름들을 HTML 출력
let array = []
for(let n = 0; n<3; n++){
    let name = prompt("이름을 입력")
    array.push(name)
}
// 반복문 이용한 HTML 구상
let html = ``
for(let index = 0; index <= array.length-1; index++){
    html += `<li> ${array[index]} </li>`
}
document.querySelector("ol").innerHTML = html