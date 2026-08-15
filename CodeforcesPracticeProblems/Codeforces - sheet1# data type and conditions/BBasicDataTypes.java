import java.util.*;

public class BBasicDataTypes{
    public static void main(String[] args) {
        int a;
        long b;
        char c;
        float d;
        double e;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextLong();
        c = sc.next().charAt(0);
        d = sc.nextFloat();
        e = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.printf("%.1f\n", e);
    }
}