package Test_Code;

import java.util.Scanner;

class FibonacciRecursive{
    int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    void seeFibonacci(int n){
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}

public class Fibonacci_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciRecursive f = new FibonacciRecursive();
        f.seeFibonacci(n);
    }
}
