let array = [[0,1,2],[3,4,5],[6,7,8]]
let player1 = 0

while(1){
    if(player1 % 2 == 0){
        let result = prompt("player1 : 선택할 칸을 입력하세요(0~8)")
        let row
        if(result <= 2){
            row = 0
        } else if(result <= 5) {
            row = 1
        } else {
            row = 2
        }
        let col = result%3 
        if(array[row][col]=="O" || array[row][col]=="X"){
            console.log(`${result}칸은 이미 선택되었습니다. 비어있는 칸을 선택하세요`)
            continue
        } else {
            array[row][col]="O"
            if(array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][1] == array[0][2]){
                console.log("player1 승리")
                break
            }
            if(array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][1]==array[1][2]){
                console.log("player1 승리")
                break
            }
            if(array[2][0] == array[2][1] && array[2][0]==array[2][2] && array[2][1]==array[2][2]){
                console.log("player1 승리")
                break
            }
            if(array[0][0] == array[1][0] && array[0][0]== array[2][0] && array[1][0]==array[2][0]){
                console.log("player1 승리")
                break
            }
            if(array[0][1] == array[1][1] && array[0][1]== array[2][1] && array[1][1]==array[2][1]){
                console.log("player1 승리")
                break
            }
            if(array[0][2] == array[1][2] && array[0][2]== array[2][2] && array[1][2]==array[2][2]){
                console.log("player1 승리")
                break
            }
            if(array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[1][1]==array[2][2]){
                console.log("player1 승리")
                break
            }
            if(array[0][2] == array[1][1] && array[0][2]== array[2][0] && array[1][1]==array[2][0]){
                console.log("player1 승리")
                break
            }
        }
        player1++
        if(player1==9){
            console.log("칸이 꽉찼습니다. 무승부입니다")
            break
        }
    } else {
        let result = prompt("player2 : 선택할 칸을 입력하세요(0~8)")
        let row
        if(result <= 2){
            row = 0
        } else if(result <= 5) {
            row = 1
        } else {
            row = 2
        }
        let col = result%3 
        if(array[row][col]=="O" || array[row][col]=="X"){
            console.log(`${result}칸은 이미 선택되었습니다. 비어있는 칸을 선택하세요`)
            continue
        } else {
            array[row][col]="X"
            if(array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][1] == array[0][2]){
                console.log("player2 승리")
                break
            }
            if(array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][1]==array[1][2]){
                console.log("player2 승리")
                break
            }
            if(array[2][0] == array[2][1] && array[2][0]==array[2][2] && array[2][1]==array[2][2]){
                console.log("player2 승리")
                break
            }
            if(array[0][0] == array[1][0] && array[0][0]== array[2][0] && array[1][0]==array[2][0]){
                console.log("player2 승리")
                break
            }
            if(array[0][1] == array[1][1] && array[0][1]== array[2][1] && array[1][1]==array[2][1]){
                console.log("player2 승리")
                break
            }
            if(array[0][2] == array[1][2] && array[0][2]== array[2][2] && array[1][2]==array[2][2]){
                console.log("player2 승리")
                break
            }
            if(array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[1][1]==array[2][2]){
                console.log("player2 승리")
                break
            }
            if(array[0][2] == array[1][1] && array[0][2]== array[2][0] && array[1][1]==array[2][0]){
                console.log("player2 승리")
                break
            }
        }
        player1++
        if(player1==9){
            console.log("칸이 꽉찼습니다. 무승부입니다")
        }
    }
}