import java.util.*;

public class GPalindromeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0; i<n; i++)
            arr[i] = sc.nextInt();
        for(i = 0; i < n; i++){
            if(arr[i] != arr[n-i-1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}