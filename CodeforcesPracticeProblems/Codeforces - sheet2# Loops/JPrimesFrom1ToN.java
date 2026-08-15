import java.util.Scanner;

public class JPrimesFrom1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i, j;
        boolean palin;
        for(i=2; i<=n; i++){
            palin = true;
            for(j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    palin = false;
                    break;
                }
            }
            if(palin) System.out.print(i + " ");
        }
        System.out.println();
    }
}