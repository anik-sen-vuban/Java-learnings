import java.util.Scanner;

public class MReplaceMinmax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        int min_v = arr[0], min_index = 0;
        int max_v = arr[0], max_index = 0;
        for(i = 1; i < n; i++){
            if(min_v > arr[i]){
                min_v = arr[i];
                min_index = i;
            }
            if(max_v < arr[i]){
                max_v = arr[i];
                max_index = i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = temp;
        for(int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
}