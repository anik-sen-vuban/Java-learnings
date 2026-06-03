import java.util.*;

public class VComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(" ", "");
        // System.out.println(s);
        String[] nums = s.split("[><=]");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
    
        String tempS = s.replaceAll("[0-9\\-]", "");
        // // System.out.println(tempS);
        char sign = tempS.charAt(0);
        System.out.println(sign=='>' && a > b ? "Right" : sign=='<' && a<b ? "Right" : sign=='=' && a==b ? "Right" : "Wrong");
        // System.out.println(sign=='>' && a>b);
    }
}