package test;

public class ItemListSolve {

    private Item[] items;
    private int size = 0;

    public ItemListSolve() {
        items = new Item[10];
    }

    public ItemListSolve(int length) {
        items = new Item[length];
    }

    private void duplicate() {
        Item[] newItems = new Item[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, items.length);
        items = newItems;
    }

    public boolean add(Item item) {
        if (size == items.length) {
            duplicate();
        }
        items[size++] = item;
        return true;
    }

    public boolean remove(Item item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (equals(items[i], item)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        if (index == size - 1) {
            items[--size] = null;
        } else if (index == 0) {
            for (int i = 0; i < size; i++) {
                Item temp = items[i];
                items[i] = items[i + 1];
                items[i + 1] = temp;
            }
            items[--size] = null;
        } else {
            for (int i = size - 1; i > index; i--) {
                Item temp = items[i];
                items[i] = items[i - 1];
                items[i - 1] = temp;
            }
            items[--size] = null;
        }
        return true;
    }

    private boolean equals(Item item1, Item item2) {
        if (item1.getName().equals(item2.getName())) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    public void print() {
        System.out.print("장바구니: [");
        for (int i = 0; i < size; i++) {
            System.out.print(items[i].getName());
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("총 금액 = " + sum());
        System.out.println();
    }

    public Item get(int index) {
        if(index >= 0 && index < size) {
            return items[index];
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int sum() {
        int sum = 0;
        for(int i=0; i<size;i++) {
            sum += items[i].getPrice();
        }
        return sum;
    }

    public int size() {
        return this.size;
    }
}
