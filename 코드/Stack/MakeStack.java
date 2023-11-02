package test;

public class MakeStack {
    private int[] stack; // 스택 배열
    private int size; // 저장된 요소의 수

    public MakeStack() {
        this.stack = new int[2];
    }
    
    private void duplicateSize() {
        // Todo: 스택이 꽉 찼다면 배열의 크기를 2배로 늘리기
    }

    public void push(int element) {
        // Todo: 스택에 요소를 추가
    }
    
    public int pop() {
        // Todo: 스택에서 요소를 제거
        return 0;
    }
    
    public void printStack() {
        // Todo: 스택의 내용을 출력
        // Todo: 스택의 요소 수와 배열의 길이도 출력
    }

    public int size() {
        return this.size;
    }

}