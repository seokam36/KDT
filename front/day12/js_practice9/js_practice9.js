let departmentList = [{dcode:1, dname:"개발팀"}, 
                    {dcode:2, dname:"디자인팀"}, 
                    {dcode:3, dname:"기획팀"}]
let lastDepartmentCode = 4

//1. READ
departmentPrint()
function departmentPrint(){
    let tbody = document.querySelector(".card table tbody")
    let html = ""
    for(let i=0; i<departmentList.length; i++){
        let department = departmentList[i]
        html += `<tr>
              <td>${department.dname}</td>
              <td class="action-links align-right">
                <a href="#" class="link-edit" onclick="departmentUpdate(${department.dcode})">수정</a>
                <a href="#" class="link-delete" onclick="departmentDelete(${department.dcode})">삭제</a>
              </td>
            </tr>`
    }
    tbody.innerHTML = html
}

//2. CREATE
function departmentAdd(){
    let name = document.querySelector(".dname").value               
    let object = {dcode:lastDepartmentCode, dname:name}
    console.log(object)
    // 같은 부서명 입력시 오류
    for(let i=0; i<departmentList.length; i++){
        if(object.dname == departmentList[i].dname){
            alert("같은 부서명을 입력했습니다.")
            return
        }
    }
    departmentList.push(object)
    lastDepartmentCode++

    alert("등록 성공")
    departmentPrint()
}

//3. Update
function departmentUpdate(dcode){
    for(let i=0; i<departmentList.length; i++){
        if(departmentList[i].dcode == dcode){
            let name = prompt("수정할 부서명 입력")
            // 같은 부서명 입력시 오류
            for(let i=0; i<departmentList.length; i++){
                if(name == departmentList[i].dname){
                alert("같은 부서명을 입력했습니다.")
                return
            }
        }
            departmentList[i].dname = name
            departmentPrint()
            return
        }
    }
}
//4. Delete
function departmentDelete(dcode){
    for(let i=0; i<departmentList.length; i++){
        if(departmentList[i].dcode == dcode){
            departmentList.splice(i,1)
            alert("삭제 성공")
            departmentPrint()
            return
        }
    }
}