import java.util.Scanner;

public class RAgeInDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n/365 + " years");
        System.out.println((n%365)/30 + " months");
        System.out.println((n%365)%30 + " days");
    }
}