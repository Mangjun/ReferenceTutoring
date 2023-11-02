package test;

public class MakeStackSolve {
    private int[] stack; // 스택 배열
    private int size = 0; // 저장된 요소의 수

    public MakeStackSolve() {
        this.stack = new int[2];
    }

    private void duplicateSize() {
        int[] copy = new int[stack.length * 2];
        System.arraycopy(stack, 0, copy, 0, stack.length);
        stack = copy;
    }

    public void push(int element) {
        if (size == stack.length) {
            duplicateSize();
        }
        stack[size] = element;
        size++;
    }

    public int pop() {
        int old = stack[size - 1];
        stack[size - 1] = 0;
        size --;
        return old;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
        System.out.println("size : " + size);
        System.out.println("stackLength: " + stack.length);
    }

    public int size() {
        return this.size;
    }

}