let departmentList = [  { 'dcode' : 1 , 'dname' : "개발팀"   }, 
                        { 'dcode' : 2 , 'dname' : "디자인팀" }, 
                        { 'dcode' : 3 , 'dname' : "기획팀"   }   ]

let lastDepartmentCode = departmentList.length;
                        
let employeeList = [
    {'ecode' : 1, 'dcode' : 1, 'ename' : "김민준", 'eposition' : '선임 개발자', 'eimg' : 'https://placehold.co/100x100' },
    {'ecode' : 2, 'dcode' : 2, 'ename' : "이서연", 'eposition' : '수석디자이너', 'eimg' : 'https://placehold.co/100x100' },
    {'ecode' : 3, 'dcode' : 3, 'ename' : "박도윤", 'eposition' : '팀장', 'eimg' : 'https://placehold.co/100x100' },
]

let lastEmployeeCode = employeeList.length; // 최근 발급된 마지막 사원 코드

let vacationList = [
    {'vcode' : 1 , 'ecode' : 1 , 'vstart' : '2025-08-04' , 'vend' : '2025-08-04' , 'vreason' : '병원 진료' },
    {'vcode' : 2 , 'ecode' : 2 , 'vstart' : '2025-07-21' , 'vend' : '2025-07-25' , 'vreason' : '여름 휴가' }
]


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
    let object = {dcode:++lastDepartmentCode, dname:name}
    console.log(object)
    // 같은 부서명 입력시 오류
    for(let i=0; i<departmentList.length; i++){
        if(object.dname == departmentList[i].dname){
            alert("같은 부서명을 입력했습니다.")
            return
        }
    }
    departmentList.push(object)

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
            for(let j=0; j<employeeList.length; j++){
                if(dcode == employeeList[j].dcode){
                    alert("사원목록에 해당 부서가 있습니다")
                    return
                }
            }
            departmentList.splice(i,1)
            alert("삭제 성공")
            departmentPrint()
            return
        }
    }
}


//조회 함수
employeePrint();
function employeePrint() {
  console.log("함수호출 시작");
  // JS가 처음 열릴떄, 등록, 수정, 삭제 시 호출
  let tbody = document.querySelector(".employee-table tbody");
  let html = "";

  for (let i = 0; i < employeeList.length; i++) {
    // 사원 배열 순회하면서 정보 추출
    let employee = employeeList[i];
    let dname = "";
    for (let j = 0; j < departmentList.length; j++) {
      //부서 배열을 순회하면서 같은 부서코드 인덱스 찾기
      if (employee.dcode == departmentList[j].dcode) {
        dname = departmentList[j].dname; //같은 인덱스의 부서 배열에 있는 부서명 가져오기
        break; //찾았으면 종료
      }
    }
    html += `<tr>
                <td>
                  <img src=${employee.eimg} />
                </td>
                <td>${employee.ename}</td>
                <td>${dname}</td>
                <td>${employee.eposition}</td>
                <td class="action-links align-right">
                  <a href="#" class="link-edit" onclick="employeeUpdate(${employee.ecode})">수정</a>
                  <a href="#" class="link-delete" onclick="employeeDelete(${employee.ecode})">삭제</a>
                </td>
              </tr>`;
  }
  tbody.innerHTML = html;
}

//삭제 함수

function employeeDelete(ecode) {
  for (let i = 0; i < employeeList.length; i++) {
    if (employeeList[i].ecode == ecode) {
      employeeList.splice(i, 1);

      alert("사원 삭제 성공");
      employeePrint();
      return;
    }
  }
}

//수정 함수

function employeeUpdate(ecode) {
  for (let i = 0; i < employeeList.length; i++) {
    let change = 0;
    if (employeeList[i].ecode == ecode) {
      let newname = prompt("수정할 이름 입력");
      let newdepartment = prompt("수정할 부서 입력");
      let newposition = prompt("수정할 직급 입력");
      let changeDepartment = [];
      for (let j = 0; j < departmentList.length; j++) {
        changeDepartment.push(departmentList[j].dname);
      }

      if (changeDepartment.includes(newdepartment) == false) {
        alert("존재하지 않는 부서입니다.");
        return;
      }

      for (let k = 0; k < departmentList.length; k++) {
        if (newdepartment == departmentList[k].dname) {
          newdepartment = departmentList[k].dcode;
        }
      }

      console.log(changeDepartment);
      if (employeeList[i].eposition.includes(newposition) == false) {
        alert("존재하지 않는 직급입니다.");
        return;
      }
      employeeList[i].ename = newname;
      employeeList[i].dcode = newdepartment;
      employeeList[i].eposition = newposition;

      employeePrint();
      return;
    }
  }
}

//등록 함수

function employeeAdd() {
  let name = document.querySelector(".e-name").value;
  let position = document.querySelector(".e-position").value;
  let department = document.querySelector(".e-department").value;
  let image = document.querySelector(".e-image").files[0];

  if (department == "disabled") {
    alert("카테고리를 선택해주세요.");
    return;
  }

  let object = {
    ecode: lastEmployeeCode + 1,
    ename: name,
    dcode: department,
    eposition: position,
    eimg:
      image == undefined
        ? "https://placehold.co/100"
        : URL.createObjectURL(image),
  };
  employeeList.push(object);
  lastEmployeeCode += 1;
  alert("등록성공");
  employeePrint();
}


// READ
vacationPrint()

function vacationPrint(){
    
    let html = '<h2 class="card-title">휴가 신청 전체 목록</h2>'

    for( i = 0 ; i <= vacationList.length-1 ; i++ ){

        let ename = ''

        for( a = 0 ; a <= employeeList.length-1 ; a++ ){

            if( employeeList[a].ecode == vacationList[i].ecode ){
                ename = employeeList[a].ename
                break
            }
        }

        html += `<div class="vacation-card">
                    <div class="user-name">${ename}</div>
                    <div class="date">${vacationList[i].vstart} ~ ${vacationList[i].vend}</div>
                    <div class="reason">사유: ${vacationList[i].vreason}</div>
                    <button onclick="vacationDelete(${vacationList[i].vcode})" type="button" class="btn-cancel">신청취소</button>
                </div>`

    }

    document.querySelector('.vvv').innerHTML = html

}

// DELETE

function vacationDelete(vcode){

    for( i=0 ; i <= vacationList.length-1 ; i++ ){

        if( vacationList[i].vcode == vcode ){

            vacationList.splice( i , 1 )

            alert(`휴가 신청 취소 완료`)

            vacationPrint()

            return
        }
    }
} 

// CREATE

let lastVacationCode = vacationList.length

function vacationAdd(){
    
    let name = document.querySelector('.vnamev').value
    let startDate = document.querySelector('.vstartDatev').value
    let endDate = document.querySelector('.vendDatev').value
    let reason = document.querySelector('.vreasonv').value

    let ecode = 0

    for( i = 0 ; i <= employeeList.length-1 ; i++ ){

        if( employeeList[i].ename = name ){
            ecode = employeeList[i].ecode
            break
        }
    }

    let vobject = {'vcode' : lastVacationCode+1 , 'ecode' : ecode , 'vstart' : startDate , 'vend' : endDate , 'vreason' : reason }

    vacationList.push(vobject)

    alert(`휴가 신청 완료`)

    vacationPrint()

}