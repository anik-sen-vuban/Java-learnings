import java.util.*;

public class ASummation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.close();
        int[] arr = new int[n];
        // System.out.println(arr.length);
        long sum = 0;
        int i;
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // for(int ele : arr) System.out.print(ele + " ");
        // System.out.println();
        sc.close();
        System.out.println(Math.abs(sum));
    }
}