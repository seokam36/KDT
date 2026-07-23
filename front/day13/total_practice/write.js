function boardWrite(){
    let title = document.querySelector('#titleInput').value
    let content = document.querySelector('#contentInput').value
    let pw = document.querySelector('#pwInput').value
    
    let obj = {title, content, pw}

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else{
        boardList = JSON.parse(boardList)
    }

    obj.no = boardList.length == 0 ? 1 : boardList[boardList.length-1].no + 1
    boardList.push(obj)

    localStorage.setItem('boardList', JSON.stringify(boardList))

    alert('게시물 작성')
    location.href = 'list.html'
}