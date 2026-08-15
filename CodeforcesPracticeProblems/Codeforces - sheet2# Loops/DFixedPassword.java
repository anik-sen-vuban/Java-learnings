import java.util.Scanner;

public class DFixedPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        boolean fu = true;
        while (fu) {
            x = sc.nextInt();
            if(x == 1999){
                System.out.println("Correct");
                break;
            }else System.out.println("Wrong");
        }
    }
}