import java.util.*;

public class IPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        String reversed = new StringBuilder(n).reverse().toString();
        int reverseNum = Integer.parseInt(reversed);

        System.out.println(reverseNum);
        System.out.println(n.equals(reversed) ? "YES" : "NO");
    }
}