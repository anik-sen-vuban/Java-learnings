import java.util.Scanner;

public class GFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long product;
        int i, n;
        while (t != 0) {
            product = 1;
            n = sc.nextInt();
            for(i=1; i<=n; i++){
            product *= i;
            }
            System.out.println(product);
            t--;
        }
        sc.close();
    }
}