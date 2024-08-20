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

    /**
     * This method returns the nth term in the Fibonacci Sequence based on a user input
     *
     * @param n
     * @return The nth term
     */
    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
