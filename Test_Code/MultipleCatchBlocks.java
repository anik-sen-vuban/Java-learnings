package Test_Code;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }
        // Handles ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        // Handles ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range!");
        }
        // Handles any other exception
        catch (Exception e) {
            System.out.println("Some other exception occurred!");
        }
    }
}
