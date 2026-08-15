import java.util.Arrays;
import java.util.Scanner;

public class RPermutationWithArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        int i;
        for(i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        for(i = 0; i < n; i++) b[i] = sc.nextInt();
        Arrays.sort(b);
        for(i = 0; i < n; i++){
            if(a[i] != b[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}