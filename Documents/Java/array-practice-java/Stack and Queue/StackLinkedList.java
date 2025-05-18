
public class StackLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node top;

    // Constructor
    StackLinkedList() {
        top = null; // - Creates an empty stack where top is null, meaning no elements exist yet.

    }

    // Push Operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to Stack");
    }


    // Pop Operation
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek operation
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    //isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method to test

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Pooped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
    }

}