import java.util.*;
import java.math.*;

public class HTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("floor " + x + " / " + y + " = " + (int)Math.floor(x*1.0/y));
        System.out.println("ceil " + x + " / " + y + " = " + (int)Math.ceil(x*1.0/y));
        System.out.println("round " + x + " / " + y + " = " + Math.round(x*1.0/y));
    }
}