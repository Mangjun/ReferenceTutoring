package test;

public class ItemList {

    Item[] items;
    int size = 0;

    public ItemList() {
        items = new Item[10];
    }

    public ItemList(int length) {
        // Todo: 배열의 길이를 length로 설정
    }

    private void duplicate() {
        // Todo: 배열의 길이를 2배
    }

    public boolean add(Item item) {
        // Todo: 장바구니에 Item을 추가
        return false;
    }

    public boolean remove(Item item) {
        // Todo: 장바구니에서 Item을 삭제하고 연속적으로 만듦
        return false;
    }

    private void swap(Item item1, Item item2) {
        Item temp = item1;
        item1 = item2;
        item2 = temp;
    }

    public void clear() {
        // Todo: 장바구니를 비우기
    }

    public void print() {
        System.out.print("장바구니: [");
        for(int i=0; i<size;i++) {
            System.out.print(items[i].name);
            if(i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("총 금액 = " + sum());
    }

    public Item get(int index) {
        // Todo: index의 Item 꺼내기
        return null;
    }
    
    public boolean isEmpty() {
        // Todo: 장바구니가 비었는지 확인
        return false;
    }
    
    public int sum() {
        // Todo: 장바구니의 Item 가격의 합
        return 0;
    }

    public int size() {
        return this.size;
    }
}
