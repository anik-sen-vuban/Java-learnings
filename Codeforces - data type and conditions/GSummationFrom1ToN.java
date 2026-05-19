import java.util.*;

public class GSummationFrom1ToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(((long)n*(n+1))/2);
    }
}