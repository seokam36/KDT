printList()
function printList(){
    let tbody = document.querySelector("#tbody")
    let html = ''

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }

    for(let i=0; i<boardList.length; i++){
        let board = boardList[i]
        html += `<tr>
                    <th>${board.no}</th>
                    <th><a href="view.html?no=${board.no}">${board.title}</a></th>
                </tr>`
    }

    tbody.innerHTML = html
}
