import java.util.*;

public class EMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, max=0;
        while(n != 0){
            x = sc.nextInt();
            max = Math.max(max, x);
            n--;
        }
        System.out.println(max);
    }
}