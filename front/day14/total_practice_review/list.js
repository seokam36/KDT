printList()
function printList(){
    //html 보여줄 변수
    let tbody = document.querySelector("#tbody")
    let html = ''

    //스토리지 저장된 boardList 가져오기
    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }

    //반복문 돌려서 해당 배열 출력하기
    for(let i=0; i<boardList.length; i++){
        board = boardList[i]
        html += `<tr>
                    <th>${board.no}</th>
                    <th><a href="view.html?no=${board.no}"</a>${board.title}</th>
                </tr>`
    }
    
    // 저장된 html 출력
    tbody.innerHTML = html
}