import java.util.Scanner;

public class CReplacement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x, i;
        for(i=0; i<n; i++){
            x = sc.nextInt();
            arr[i] = x > 0 ? 1 : x < 0 ? 2 : 0;
        }
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
}