import java.util.Scanner;

public class ELowestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        for(i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int min = arr[0], posi = 1;
        for(i=1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
                posi = i+1;
            }
        }
        System.out.print(min + " " + posi);
    }
}