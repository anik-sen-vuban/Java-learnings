import java.util.Scanner;

public class LGcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int i, gcd = 1;
        for(i=2; i<= min; i++){
            if(a % i == 0 && b % i == 0) gcd = i;
        }
        System.out.println(gcd);
    }
}