import java.util.*;

public class LMaxSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, j, k, n, maxValue;
        int[] arr;
        while(t-- != 0){
            n = sc.nextInt();
            arr = new int[n];
            for(i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (i = 0; i < n; i++) {
                for (j = 0; j + i < n; j++) {
                
                    maxValue = Integer.MIN_VALUE;
                
                    for (k = j; k <= j + i; k++) {
                        maxValue = Math.max(maxValue, arr[k]);
                    }
                
                    System.out.print(maxValue + " ");
                }
            }
            System.out.println();
        }
    }
}