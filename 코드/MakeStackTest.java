package test;

public class MakeStackTest {

    public static void main(String[] args) {
        MakeStack stack = new MakeStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.printStack();

        stack.push(7);
        stack.push(8);
        stack.push(9);

        stack.printStack();

        stack.push(10);

        stack.printStack();

        stack.pop();

        stack.printStack();
    }

}
