/*
1. 기획서/요구사항 따른 프로토타입 
2. 메모리 설계
    1) 저장해야할 것들을 찾아보기, 카테고리/제품명/가격/이미지/등록일
    2) 속성들 간의 종속관계 파악
    3) 쪼개진 테이블 간 연관 만들기, 관계형데이터베이스
        3-1) 테이블당 식별자(PK) 1개 이상 권장
        3-2) 상하관계 파악해서 식별자 하위요소 저장 (FK 외래키)
    4) JS로 표현, 표 = 배열 / 객체 = 행 / 열 = 속성
 */
let categoryList = [
    {'ccode':1, 'cname':'음료'},
    {'ccode':2, 'cname':'과자'}
]

let productList = [
    {'pcode':1, 'pname':'콜라', 'pprice':1000, 'pimg':'https://placehold.co/100x100', 'pdate':'2026-07-22', 'ccode':1},
    {'pcode':2, 'pname':'사이다', 'pprice':1500, 'pimg':'https://placehold.co/100x100', 'pdate':'2026-07-23', 'ccode':1}
]


function productAdd(){
    let img
}

function productRemove(){

}

function productEdit(){

}