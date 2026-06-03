import java.util.Scanner;

public class YTheLast2Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        a %= 100;
        b %= 100;
        c %= 100;
        d %= 100;
        System.out.println((a*b*c*d)%100 < 10 ? "0"+(a*b*c*d)%100 : (a*b*c*d)%100);
    }
}