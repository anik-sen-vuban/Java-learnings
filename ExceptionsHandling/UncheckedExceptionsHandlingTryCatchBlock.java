package ExceptionsHandling;

public class UncheckedExceptionsHandlingTryCatchBlock {
    public static void main(String[] args) {
        //Exception-1: ArithmeticException
        try {

            int result = 10 / 0;

        } catch (ArithmeticException ex) {

            System.out.println(ex + "\nCannot divide by zero.");

        }

        //Exception-2: ArrayIndexOutOfBoundException
        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException amarMatha) {

            System.out.println(amarMatha + "\nInvalid Array Index.");

        }

        //Exception-3: NullPointerException
        try {

            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException ex) {

            System.out.println(ex + "\nObject is null.");

        }

        //Exception-4: NegativeArraySizeException
        try {

            int[] numbers = new int[-5];

        } catch (NegativeArraySizeException e) {

            System.out.println(e + "\nArray size cannot be negative.");

        }
    }
}
