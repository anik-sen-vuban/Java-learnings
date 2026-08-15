import java.util.Scanner;

public class NCheckCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        // boolean allChar = true;
        int i, cnt = 0;
        if(s.charAt(a) == '-'){
            for(i = 0; i < s.length(); i++){
                if(s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9 && a != i) cnt++;
            }
            System.out.println(cnt == s.length()-1 ? "Yes" : "No");
        }
        else System.out.println("No");
    }
}