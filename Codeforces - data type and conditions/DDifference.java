import java.util.*;

public class DDifference{
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("Difference = " + ((long)a*b-(long)c*d));
    }
}