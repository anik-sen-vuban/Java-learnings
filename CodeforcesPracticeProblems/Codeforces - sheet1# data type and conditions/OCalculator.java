import java.util.Scanner;

public class OCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int length = w.length();
        // int i;
        // String A = "", B = "";
        // for(i=0; i<length; i++){
        //     if(w.charAt(i)!='+' && w.charAt(i)!='-' && w.charAt(i)!='*' && w.charAt(i)!='/') A += w.charAt(i);
        //     else break;
        // }
        // char s = w.charAt(i);
        // for(i=i+1; i<length; i++){
        //     B += w.charAt(i);
        // }

        String[] nums = w.split("[+*/\\-]");

        String temp = w.replaceAll("[0-9]","");
        char s = temp.charAt(0);

        // int a = Integer.parseInt(A); //String number to Int number conversion
        // int b = Integer.parseInt(B);

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        // System.out.println(a);
        // System.out.println(s);
        // System.out.println(b);

        System.out.println(s=='+' ? a+b : s=='-' ? a-b : s=='*' ? a*b : a/b);
    }
}