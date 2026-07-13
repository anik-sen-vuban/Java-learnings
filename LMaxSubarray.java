import java.util.*;

public class LMaxSubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        int[] arr;
        int i, j, k, max;
        while(t != 0){
            n = sc.nextInt();
            arr = new int[n];
            for(i = 0; i < n; i++) arr[i] = sc.nextInt();
            for(i = 0; i < n; i++){
                for(j = 0; j <= i; j++){
                    max = Integer.MIN_VALUE;
                    for(k = j; k <= i; k++){
                        // System.out.print(arr[k] + " ");
                        max = Math.max(arr[k], max);
                    }
                    System.out.print(max + " ");
                }
                
            }
        System.out.println();
        t--;
        }
    }
}