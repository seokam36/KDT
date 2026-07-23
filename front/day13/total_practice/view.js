getBoard()
function getBoard(){
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')
    let boardList = localStorage.getItem('boardList')

    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }

    for(let i=0; i<boardList.length; i++){
        let obj = boardList[i]
        if(obj.no == selectNo){
            document.querySelector('#title').innerHTML = obj.title
            document.querySelector('#content').innerHTML = obj.content
            return
        }
    }
}

function boardDelete(){
    let url = new URLSearchParams(location.search)
    let selectNo = url.get('no')
    let boardList = localStorage.getItem('boardList')

    if(boardList == null){
        boardList = []
    } else{
        boardList = JSON.parse(boardList)
    }
    for(let i=0; i<boardList.length; i++){
        let obj = boardList[i]
        if(selectNo == obj.no){
              let pw = prompt('비밀번호 입력')
        if (obj.pw == pw){
            boardList.splice(i,1)
            localStorage.setItem('boardList',JSON.stringify(boardList))
            alert('삭제 성공')
            location.href='list.html'
            } else {
                alert('비밀번호 불일치')
            }
        }
    }
}