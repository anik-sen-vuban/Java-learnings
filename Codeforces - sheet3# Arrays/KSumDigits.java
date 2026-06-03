import java.util.*;

public class KSumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr = sc.next();
        int sum = 0;
        int i;
        for(i = 0; i < n; i++) sum += arr.charAt(i) - '0';
        System.out.println(sum);
    }
}