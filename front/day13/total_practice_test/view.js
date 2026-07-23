view()
function view(){
    let url = new URLSearchParams( location.search )
    let no = url.get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }
    // 반복문 돌려서 동일한 게시물번호 찾아 출력하기 
    for(let i=0; i<boardList.length; i++){
        let board = boardList[i]
        document.querySelector("#title").innerHTML = board.title
        document.querySelector("#content").innerHTML = board.content
    }
}

function del(){
    let url = new URLSearchParams(location.search)
    let no = url.get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }

    for(let i=0; i<boardList.length; i++){
        board = boardList[i]
        if(board.no == no){
            let pw = prompt("비밀번호 입력")
            if(board.pw == pw){
                boardList.splice(i,1)
                localStorage.setItem('boardList',JSON.stringify(boardList))
                alert("삭제 성공")
                location.href = "list.html"
                return
            } else {
                alert("비밀번호 확인")
            }
        }
    }
}