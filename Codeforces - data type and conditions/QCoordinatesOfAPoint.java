import java.util.Scanner;

public class QCoordinatesOfAPoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println(x > 0 && y > 0 ? "Q1" : x < 0 && y > 0 ? "Q2" : x < 0 && y < 0 ? "Q3" : x > 0 && y < 0 ? "Q4" : x == 0 && y == 0 ? "Origem" : x == 0 ? "Eixo Y" : "Eixo X");
    }
}