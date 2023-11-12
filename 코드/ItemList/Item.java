package test;

public class Item {
    protected String name;
    protected int price;

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

class Monitor extends Item {
    public Monitor() {
        this.name = "모니터";
        this.price = 10000;
    }

}

class Keyboard extends Item {
    public Keyboard() {
        this.name = "키보드";
        this.price = 5000;
    }
}

class Mouse extends Item {
    public Mouse() {
        this.name = "마우스";
        this.price = 3000;
    }
}