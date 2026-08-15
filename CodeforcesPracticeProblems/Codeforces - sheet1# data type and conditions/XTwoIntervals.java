import java.util.*;

public class XTwoIntervals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        sc.close();

        System.out.println(Math.max(l1, l2)<=Math.min(r1, r2) ? Math.max(l1, l2) + " " + Math.min(r1, r2) : -1);
    }
}