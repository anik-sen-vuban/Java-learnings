import java.util.*;

public class FDigitsSummation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m;
        n = sc.nextLong();
        m = sc.nextLong();
        System.out.println((n%10)+(m%10));
    }
}