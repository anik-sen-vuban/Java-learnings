import java.util.*;

public class ZHardCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        double powab = b*Math.log(a);
        double powcd = d*Math.log(c);
        System.out.println(powab > powcd ? "YES" : "NO");
    }
}