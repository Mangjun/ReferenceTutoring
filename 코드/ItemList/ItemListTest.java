package test;

public class ItemListTest {
    public static void main(String[] args) {
        ItemListSolve itemList = new ItemListSolve();

        itemList.add(new Monitor());
        itemList.add(new Mouse());
        itemList.add(new Keyboard());

        itemList.print();

        itemList.remove(new Monitor());

        itemList.print();

        itemList.add(new Monitor());
        itemList.add(new Mouse());
        itemList.add(new Keyboard());

        System.out.println("itemList.get(0) = " + itemList.get(0));

        itemList.print();

        itemList.remove(new Mouse());

        itemList.print();

        itemList.remove(new Keyboard());

        itemList.print();

        itemList.clear();

        itemList.print();
    }
}
