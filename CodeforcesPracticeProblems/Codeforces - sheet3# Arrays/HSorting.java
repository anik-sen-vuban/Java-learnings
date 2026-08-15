import java.util.*;

public class HSorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, j, temp;
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        // Arrays.sort(arr);
        boolean swaped;
        // int cnt = 0;
        //Bubble sort
        for(i = 0; i < n-1; i++){
            swaped = false;
            for(j = i+1; j < n; j++){
                temp = arr[i];
                if(arr[i] > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swaped = true;
                }
            }
            if(!swaped) break;
            // cnt ++;
        }
        // System.out.println(cnt);
        for(i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}