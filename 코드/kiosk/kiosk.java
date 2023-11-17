package kiosk;

import kiosk.product.Product;

import java.util.Scanner;

public class kiosk {
    static Menu menu = new Menu();
    static MenuList menuList = new MenuList();
    static ProductList list = new ProductList();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String orderType = "";
        boolean flagOrder = true;
        boolean flagList = true;
        int sel;
        int menuSel;


        while (true) {
            System.out.println("1. 포장");
            System.out.println("2. 매장");
            System.out.print(">> ");

            sel = s.nextInt();
            switch (sel) {
                case 1:
                    orderType = "포장";
                    break;
                case 2:
                    orderType = "매장";
                    break;
            }
            flagOrder = true;

            while (flagOrder) {
                System.out.println("1. 홈");
                System.out.println("2. 커피");
                System.out.println("3. 논커피");
                System.out.println("4. 디저트");
                System.out.println("5. 장바구니");
                System.out.print(">> ");

                sel = s.nextInt();
                switch (sel) {
                    case 1:
                        flagOrder = false;
                        break;
                    case 2:
                        menuList.printMenu(menu.getCoffees());
                        listAdd(s, menu.getCoffees());
                        break;
                    case 3:
                        menuList.printMenu(menu.getNonCoffees());
                        listAdd(s, menu.getNonCoffees());
                        break;
                    case 4:
                        menuList.printMenu(menu.getDesserts());
                        listAdd(s, menu.getDesserts());
                        break;
                    case 5:
                        System.out.println("1. 보기");
                        System.out.println("2. 삭제");
                        System.out.println("3. 비우기");
                        System.out.println("4. 주문하기");
                        System.out.println("5. 뒤로 가기");
                        flagList = true;
                        while (flagList) {
                            System.out.print(">> ");
                            menuSel = s.nextInt();
                            switch (menuSel) {
                                case 1:
                                    list.print();
                                    break;
                                case 2:
                                    list.print();
                                    System.out.println("삭제할 번호");
                                    System.out.print(">> ");
                                    menuSel = s.nextInt();
                                    if (menuSel >= 1 && menuSel <= list.size()) {
                                        System.out.println(list.get(menuSel).getName() + " 삭제");
                                        list.remove(list.get(menuSel - 1));
                                    } else {
                                        System.out.println("잘못 입력");
                                    }
                                    break;
                                case 3:
                                    list.clear();
                                    break;
                                case 4:
                                    list.order(orderType);
                                    list.clear();
                                    System.out.println();
                                    flagList = false;
                                    flagOrder = false;
                                    break;
                                case 5:
                                    flagList = false;
                                    flagOrder = false;
                                    break;
                                default:
                                    System.out.println("잘못 입력");
                                    break;
                            }
                        }
                        break;
                }
            }

        }
    }

    private static void listAdd(Scanner s, Product[] products) {
        int menuSel;
        while (true) {
            menuSel = s.nextInt();
            if (menuSel >= 1 && menuSel <= products.length + 1) {
                if (menuSel == products.length + 1) {
                    break;
                }
                list.add(products[menuSel - 1]);
                System.out.println(products[menuSel - 1].getName() + " 추가");
                System.out.print(">> ");
            } else {
                System.out.println("잘못 입력");
            }
        }
    }
}
