

public class MyStackArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor 
    public MyStackArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top];
    }

    // Peek top element 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // for testing
    public static void main(String args[]) {
        MyStackArray stack = new MyStackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
    }
}