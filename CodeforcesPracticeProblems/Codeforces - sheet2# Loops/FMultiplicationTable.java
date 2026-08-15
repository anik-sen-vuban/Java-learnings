import java.util.Scanner;

public class FMultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n = sc.nextInt();
        sc.close();
        for(i=1; i<=12; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}