printBoard()
function printBoard(){
    // URL 추출해서 no값 저장하기
    let no = new URLSearchParams(location.search).get('no')
    
    let title = document.querySelector("#title")
    let content = document.querySelector("#content")
    htmlTitle = ''
    htmlContent = ''

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }
    
    // 배열값 반복문을 통해 no이 같은 값 찾기
    for(let i=0; i<boardList.length; i++){
        board = boardList[i]
        if(no == board.no){
            htmlTitle += `${board.title}`
            htmlContent += `${board.content}`
        }
    }

    title.innerHTML = htmlTitle
    content.innerHTML = htmlContent
}

function del(){
    let no = new URLSearchParams(location.search).get('no')

    let boardList = localStorage.getItem('boardList')
    if(boardList == null){
        boardList = []
    } else {
        boardList = JSON.parse(boardList)
    }

    //리스트 배열 반복문으로 no과 일치하는값 찾고 pw입력받아 pw도 같은지 확인후 삭제
    for(let i=0; i < boardList.length; i++){
        board = boardList[i]
        if(no == board.no){
            let pw = prompt('비밀번호 입력')
            if(pw == board.pw){
                boardList.splice(i,1)
                localStorage.setItem('boardList',JSON.stringify(boardList))
                alert('삭제 성공')
                location.href = "list.html"
            } else {
                alert('비밀번호를 확인하세요')
                return
            }
        }
    }
}