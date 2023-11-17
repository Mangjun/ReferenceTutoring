package kiosk;

import kiosk.product.Product;

public class ProductList {
    private Product[] list;
    private int size;
    private int total;

    public ProductList() {
        this.list = new Product[10];
    }

    private void duplicate() {
        Product[] newList = new Product[list.length * 2];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }

    public boolean add(Product product) {
        if (size == list.length) {
            duplicate();
        }
        list[size++] = product;
        total += product.getPrice();
        return true;
    }

    public Product get(int index) {
        if(index >= 0 && index < size) {
            return list[index];
        }
        return null;
    }

    public boolean remove(Product product) {
        int index = indexOf(product);
        if (index == -1) {
            return false;
        } else {
            total -= list[index].getPrice();
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            list[--size] = null;
            return true;
        }
    }

    private int indexOf(Product product) {
        String productName = product.getName();
        for (int i = 0; i < size; i++) {
            if (productName.equals(list[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
        total = 0;
    }

    public void print() {
        System.out.print("장바구니: ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + ". " + list[i].getName());
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("총 금액: " + total);
    }

    public void order(String orderType) {
        System.out.println("***영수증***");
        System.out.println("주문 방식: " + orderType);
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". " + list[i].getName());
        }
        System.out.println("총 금액: " + total);
    }

    public int size() {
        return this.size;
    }
}
