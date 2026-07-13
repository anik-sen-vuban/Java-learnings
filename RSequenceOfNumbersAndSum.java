import java.util.*;

public class RSequenceOfNumbersAndSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, tem, i, sum;
        boolean flag = true;
        while(flag){
            m = sc.nextInt();
            n = sc.nextInt();
            if(m > n){
                tem = m;
                m = n;
                n = tem;
            }
            if(m <= 0 || n <= 0) continue;
            sum = 0;
            for(i = m; i <= n; i++){
                System.out.print(i + " ");
                sum += i;
            }
            System.out.print("sum =" + sum);
            System.out.println();
        }
    }
}