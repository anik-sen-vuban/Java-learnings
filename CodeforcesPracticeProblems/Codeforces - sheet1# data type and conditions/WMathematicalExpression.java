import java.util.*;

public class WMathematicalExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = s.replace(" ", "");
        // System.out.println(s);
        String a="", b="", ans="";
        int i, sLength = s.length();
        for(i=0; i<sLength; i++){
            if(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*'){
                a += s.charAt(i);
            }else break;
        }
        char symbol = s.charAt(i);
        for(++i; i<sLength; i++){
            if(s.charAt(i)!='='){
                b += s.charAt(i);
            }else break;
        }
        for(++i; i<sLength; i++)
            ans += s.charAt(i);

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int aannss = Integer.parseInt(ans);

        System.out.println(symbol=='+' && aa+bb==aannss ? "Yes" : symbol=='-' && aa-bb==aannss ? "Yes" : symbol=='*' && aa*bb==aannss ? "Yes" : symbol=='+' ? aa+bb : symbol=='-' ? aa-bb : aa*bb);
    }
}