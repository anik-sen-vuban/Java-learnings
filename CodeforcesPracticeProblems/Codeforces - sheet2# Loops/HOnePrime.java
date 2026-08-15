import java.util.*;

public class HOnePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean prime = true;
        int i;
        for(i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "YES" : "NO");
    }
}