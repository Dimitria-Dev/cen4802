package assignment_one;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("The nth term of the sequence is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
