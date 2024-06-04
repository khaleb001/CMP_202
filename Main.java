package StackAndQueue2;

public class Main {
    public static void main(String[] args) {
        // Create a stack with a capacity of 10
        Stack stack = new Stack(10);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Popped element: " + stack.pop()); 

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push more elements
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Check if the stack is full
        System.out.println("Is stack full? " + stack.isFull()); 

        // Try to push onto a full stack
        stack.push(8); 

        // Pop the remaining elements
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Try to pop from an empty stack
        System.out.println("Popped element: " + stack.pop()); 
    }
}
