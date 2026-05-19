import java.util.Scanner;

public class ASayHelloWithC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Hello, " + name + "\n");
    }
}