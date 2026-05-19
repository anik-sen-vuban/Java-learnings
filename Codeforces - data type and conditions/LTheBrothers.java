import java.util.*;

public class LTheBrothers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.next();
        String s1 = sc.next();
        String f2 = sc.next();
        String s2 = sc.next();
        // System.out.println(s1 + " " + s2);
        System.out.println(s1.equals(s2) ? "ARE Brothers" : "NOT");
    }
}