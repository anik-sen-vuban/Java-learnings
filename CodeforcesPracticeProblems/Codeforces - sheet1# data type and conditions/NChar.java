import java.util.*;

public class NChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        // if((int)ch>=65 && (int)ch<=90) System.out.println((char)((int)ch+32));
        // else System.out.println((char)((int)ch-32));
        // System.out.println((int)ch>=65 && (int)ch<=90 ? (char)((int)ch+32) : (char)((int)ch-32));

        System.out.println(Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch));
    }
}