import java.util.Scanner;

public class PMinimizeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        int cnt = 0;
        boolean allEven = true;
        while(allEven){
            for(i = 0; i < n; i++)
                if(arr[i] % 2 == 1) allEven = false;
                else arr[i] /= 2;
            if(!allEven) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}