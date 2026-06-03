import java.util.*;

public class CSimpleCalculator{
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + (long)x*y);
        System.out.println(x + " - " + y + " = " + (x-y));
    }
}