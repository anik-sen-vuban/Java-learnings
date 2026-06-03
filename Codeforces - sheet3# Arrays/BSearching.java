import java.util.*;

public class BSearching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i=0; i<n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
    
        for(i=0; i<n; i++){
            if(arr[i] == x){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}