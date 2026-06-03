import java.util.*;

public class CEvenOddPositiveAndNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, posi=0, negi=0, odd=0, even=0;
        while (n != 0) {
            x = sc.nextInt();
            if(x < 0){
                negi++;
                if(x % 2 == 0) even++;
                else odd++;
            }else{
                if(x != 0)
                    posi++;
                if(x % 2 == 0) even++;
                else odd ++;
            }
            n--;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + posi);
        System.out.println("Negative: " + negi);
    }
}