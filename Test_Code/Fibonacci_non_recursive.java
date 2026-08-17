package Test_Code;

import java.util.Scanner;

class Fibonacci {
    int a = 0;
    int b = 1;
    int c;
    void fibonacci(int n){
        System.out.print(a + " " + b + " ");
        for(int i = 3; i <= n; i++){
            c = a+ b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

public class Fibonacci_non_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci f = new Fibonacci();
        f.fibonacci(n);
    }
}
