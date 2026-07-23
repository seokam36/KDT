/*
    - 브라우저(크롬/엣지/사파리)에 의존하여 HTML 렌더링
    - HTML 안에 JS/CSS 도 포함하여 같이 렌더링 된다.
    - 브라우저의 F5(새로고침) 하면 재요청(렌더링) 하므로 JS 초기화 한다.
*/
// 1] JS 변수들은 브라우저에서 F5(새로고침) 초기화 된다.
// 2] HTML 안에 포함된 JS/CSS 파일들은 F12(개발자도구) [Sources]/[Console] 코드 확인
    // -> 하나의 html에 여러개 js/css 파일 가능하다.
// 3] 서로 다른 .js 파일에서 동일한 HTML에 포함되면 코드 공유 가능
    // test.js 에서 선언된 코드가 , exam1.js에서 호출(사용) 가능

//[1] 웹 스토리지 객체 호출
console.log(localStorage)
console.log(sessionStorage)

//[2] 웹 스토리지 객체 내 자료 추가 .setItem
sessionStorage.setItem('name', '유재석')
// 개발자도구 -> Application -> 왼쪽메뉴 -> 세션스토리지 -> 도메인(주소) 클릭

//[3] 웹스토리지 객체 내 자료 호출 .getItem('key')
let name = sessionStorage.getItem('name')
console.log(name)
let age = localStorage.getItem('age')
console.log(age)

//[4] 웹 스토리지 객체 내 자료 삭제 .removeItem('key') , .clear()
sessionStorage.removeItem('name')       //특정한 key가 존재하면 key/value 삭제
localStorage.clear()                    //모든 키 삭제

//[*] 웹 스토리지도 문자열만 지원 타입변환 필요
//[5] JSON, JSON.stringify(객체)
sessionStorage.setItem('회원객체', JSON.stringify({'name':'유재석', 'age':40}) )
// JSON.parse(문자열) : 문자열 타입 -> 객체 타입 변환
let 회원객체 = JSON.parse(sessionStorage.getItem('회원객체'))
console.log(회원객체)

//JS는 브라우저가 새로고침시 메모리 초기화 -> 백엔드 or 브라우저 스토리지 사용