import java.util.Scanner;

public class OFibonacci {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n==1){
            System.out.println("0");
            return;
        }
        if(n==2){
            System.out.println("1");
            return;
        }
        long firstNum = 0;
        long secondNum = 1;
        long thirdNum = 0;
        int i;
        for(i = 3; i <= n; i++){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        System.out.println(thirdNum);
    }
}