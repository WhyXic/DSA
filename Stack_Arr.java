public class Stack_Arr {
    private int top;
    private int[] arr;
    public Stack_Arr(int capacity){
        top = -1;
        arr = new int[capacity];
    }
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("The stack is full");
        }
        top++;
        arr[top] = data;
    }
    public int pop(){
        if(isFull()){
            throw new RuntimeException("The stack is full");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public boolean isFull(){
        return top == size();
    }
    public int size(){
        return top + 1;
    }
    public static void main(String[] args){
        Stack_Arr stack = new Stack_Arr(6);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.print(stack.size());
        System.out.print(stack.isFull());
    }

}
