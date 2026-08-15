import java.util.*;

public class JLuckyArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        for(i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = arr[0];
        // for(i = 1; i < n; i++)
        //     if(arr[i] < min) min = arr[i];
        int cnt = 0;
        for(i = 0; i < n; i++)
            if(min == arr[i]) cnt++;
        System.out.println(cnt % 2 == 0 ? "Unlucky" : "Lucky");
    }
}