import java.util.Scanner;

public class PFirstDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char temp = num.charAt(0);
        int firstDigit = temp - '0'; // char number to INT number conversion
        System.out.println(firstDigit%2==0 ? "EVEN" : "ODD");

        // int num = sc.nextInt();
        // while(num >= 10){
        //     num /= 10;
        // }
        // System.out.println(num%2==0 ? "EVEN" : "ODD");
    }
}