import java.util.*;

public class MCapitalOrSmallOrDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a = 97, z = 122 = (97+(26-1))
        // A = 65, Z = 90
        // 1 = 48, 9 = 57

        char ch = sc.next().charAt(0);
        // System.out.println((int)ch);
        if((int)ch>=65 && (int)ch<=90) System.out.println("ALPHA\nIS CAPITAL\n");
        else if((int)ch>=97 && (int)ch<=122) System.out.println(("ALPHA\nIS SMALL\n"));
        else System.out.println("IS DIGIT");
    }
}