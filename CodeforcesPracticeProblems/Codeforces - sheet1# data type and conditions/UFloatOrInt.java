import java.util.*;

public class UFloatOrInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        if(x % (int)x == 0.0) System.out.println("int " + (int)x);
        else{
            // String s = Float.toString(x);
            // String[] nums = s.split("[.]");
            // System.out.println("float " + nums[0] + " 0." + nums[1]);
            System.out.printf("float %d %.3f\n", (int)x, x-(int)x);
        }
    }
}