package myStack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("G");
        myStack.push("W");
        myStack.push("C");
        myStack.push("A");

        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
    }
}
