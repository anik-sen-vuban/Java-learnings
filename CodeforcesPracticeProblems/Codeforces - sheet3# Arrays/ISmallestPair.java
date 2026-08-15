import java.util.Scanner;

public class ISmallestPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, i, j, minSum;
        int[] arr;
        while(t != 0){
            t--;
            n = sc.nextInt();
            arr = new int[n];
            for(i = 0; i < n; i++) arr[i] = sc.nextInt();
            minSum = Integer.MAX_VALUE;
            // System.out.println(minSum);
            for(i = 0; i < n-1; i++){
                for(j = i+1; j < n; j++){
                    // if(arr[i] + arr[j] + j - i < minSum)
                    //     minSum = arr[i]+arr[j]+j-i;
                    minSum = Math.min(arr[i]+arr[j]+j-i, minSum);
                }
            }
            System.out.println(minSum);
        }
    }
}