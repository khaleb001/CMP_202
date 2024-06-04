package StackAndQueue2;

public class Fib {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibNumber;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for(int i = 2; i <= 10; i++) {
            fibNumber = firstNumber + secondNumber;
            System.out.println(fibNumber);
            firstNumber = secondNumber;
            secondNumber = fibNumber;
        }
    }
}
