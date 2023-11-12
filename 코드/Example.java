package test;

public class Example {
    
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Java();

        System.out.println("book1.name = " + book1.name);
        System.out.println("book2.name = " + book2.name);
        book1.print();
        book2.print();
        if(book2 instanceof Java) {
            Java book3 = (Java)book2;
            System.out.println("book3.name = " + book3.name);
        }
        System.out.println("book2.name = " + book2.name);
    }

}

class Book {
    String name = "책";
    int price = 1000;

    public void print() {
        System.out.println("name = " + this.name);
        System.out.println("price = " + this.price);
    }
}

class Java extends Book {
    String name = "Java";
    int price = 2000;

    @Override
    public void print() {
        System.out.println("name = " + this.name);
        System.out.println("price = " + this.price);
    }
}
