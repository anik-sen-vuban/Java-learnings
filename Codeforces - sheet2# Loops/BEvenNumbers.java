import java.util.Scanner;

public class BEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i;
        boolean fu = false;
        for(i=1; i<=n; i++)
            if(i%2==0){
                System.out.println(i);
                fu = true;
            }
        if(!fu) System.out.println(-1);
    }
}