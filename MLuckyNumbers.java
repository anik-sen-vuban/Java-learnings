import java.util.*;

public class MLuckyNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tem;
        if(a > b){
            tem = a;
            a = b;
            b = tem;
        }
        int i, num, dupliNum, cnt = 0;
        boolean flag;
        for(i = a; i <= b; i++){
            num = i;
            flag = true;
            while(num != 0){
                // num %= 10;
                dupliNum = num;
                if(dupliNum % 10 != 4 && dupliNum % 10 != 7){
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if(flag){
                System.out.print(i + " ");
                cnt ++;
            }
        }
        if(cnt == 0) System.out.println("-1");
    }
}