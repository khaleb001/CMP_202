package StackAndQueue2;

public class Stack {
    int size;

    int top;

    int[] stack;

    Stack(int capacity){
        top = -1;
        size = capacity;
        stack = new int[size];
    }

    boolean isFull(){
        return (top == size - 1);
    }
    boolean isEmpty(){
        return (top == -1);
    }
    void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] = item;
            top++;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            return stack[top--];
        }
        return 0;
    }
}