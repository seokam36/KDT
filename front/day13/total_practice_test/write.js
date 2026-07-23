function input(){
    let title = document.querySelector('#titleInput').value
    let content = document.querySelector('#contentInput').value
    let pw = document.querySelector('#pwInput').value

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }
    let obj = {title, content, pw}
    obj.no = boardList.length==1 ? 0 : boardList[boardList.length-1].no + 1
    boardList.push(obj)
    localStorage.setItem('boardList',JSON.stringify(boardList))

    alert("등록")
    location.href = "list.html"
}