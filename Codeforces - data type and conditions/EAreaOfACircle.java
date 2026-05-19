import java.util.*;

public class EAreaOfACircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        double pi = 3.141592653;
        r = sc.nextFloat();
        System.out.printf("%.9f\n", pi*r*r);
    }
}