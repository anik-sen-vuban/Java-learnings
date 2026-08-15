import java.util.*;

public class TSortNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};
        // int first = Math.min(a, Math.min(b,c));
        // int second = first == a ? Math.min(b, c) : first == b ? Math.min(a, c) : Math.min(a, b);
        // int third = Math.max(a, Math.max(b, c));

        // System.out.println(first + "\n" + second + "\n" + third + "\n");
        // System.out.println();

        Arrays.sort(arr);
        int i;
        for(i=0; i<3; i++) System.out.println(arr[i]);
        System.out.println();
        System.out.println(a + "\n" + b + "\n" + c + "\n");
    }
}