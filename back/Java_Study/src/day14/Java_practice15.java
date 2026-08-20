package day14;

import java.util.ArrayList;
import java.util.List;

public class Java_practice15 {
    public static void main(String[] args) {
        // <?>는 "어떤 타입이든 다 들어올 수 있는 와일드카드(조커) 타입"

        List<InventorySlot<?>> inventory = new ArrayList<>();

        InventorySlot<String> obj1 = new InventorySlot<>();
        obj1.setSlotNumber(1);
        obj1.setData("집행자의 검");
        inventory.add(obj1);

        InventorySlot<Integer> obj2 = new InventorySlot<>();
        obj2.setSlotNumber(2);
        obj2.setData(500000);
        inventory.add(obj2);

        InventorySlot<Double> obj3 = new InventorySlot<>();
        obj3.setSlotNumber(3);
        obj3.setData(85.5);
        inventory.add(obj3);

        InventorySlot<String > obj4 = new InventorySlot<>();
        obj4.setSlotNumber(4);
        obj4.setData("드래곤 갑옷");
        inventory.add(obj4);

        System.out.println("=== 인벤토리 슬롯 목록 ===");
        inventory.forEach((obj)->{
            System.out.println("[슬롯 " + obj.getSlotNumber() + "번 ] 보관 : " + obj.getData());
        });


    }
}

class InventorySlot< T > {
    private int slotNumber;
    private T data;

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public T getData() {
        return data;
    }
}

/*-------------------------------------------
[ Practice15 ] 컬렉션 기반 인벤토리 슬롯 관리 시스템
상황:
게임 인벤토리는 여러 개의 제네릭 슬롯(InventorySlot<T>)으로 구성되며,
전체 슬롯 목록은 List 컬렉션을 통해 일괄 관리 및 순회 출력을 수행합니다.

요구사항:
1. InventorySlot<T> 제네릭 클래스 작성:
   - 필드: private int slotNumber, private T data
2. Main 실행 클래스 구현:
   - 다음 슬롯 객체들을 리스트에 추가:
     * 슬롯 1번: 문자열 무기 ("집행자의 검")
     * 슬롯 2번: 정수형 골드 (500000)
     * 슬롯 3번: 실수형 강화 확률 (85.5)
     * 슬롯 4번: 문자열 방어구 ("드래곤 갑옷")
   -  for문(for-each)을 사용하여 모든 슬롯 정보를 순회 출력

출력 예시:
=== 인벤토리 슬롯 목록 ===
[슬롯 1번] 보관: 집행자의 검
[슬롯 2번] 보관: 500000
[슬롯 3번] 보관: 85.5
[슬롯 4번] 보관: 드래곤 갑옷
-------------------------------------------*/