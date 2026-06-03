import java.util.Scanner;

public class DPositionsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, x;
        int[] arr = new int[n];
        for(i=0; i<n; i++){
            x = sc.nextInt();
            arr[i] = x;
        }
        for(i=0; i<n; i++)
            if(arr[i] <= 10)
                System.out.println("A["+i+"] = "+arr[i]);
        // System.out.println();
    }
}