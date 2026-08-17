package Test_Code;

import java.util.Scanner;

class Palindrome_{
    boolean palindrome(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Palindrome_ p = new Palindrome_();
        System.out.println(p.palindrome(s));
    }
}
