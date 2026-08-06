public class UncheckedExceptionsHandlingTryCatchBlock {
    public static void main(String[] args) {
        //Exception-1
        try {

            int result = 10 / 0;

        } catch (ArithmeticException ex) {

            System.out.println(ex + "\nCannot divide by zero.");

        }

        //Exception-2
        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException amarMatha) {

            System.out.println(amarMatha + "\nInvalid Array Index.");

        }

        //Exception-3
        try {

            String name = null;

            System.out.println(name.length());

        } catch (NullPointerException ex) {

            System.out.println(ex + "\nObject is null.");

        }

        //Exception-4
        try {

            int[] numbers = new int[-5];

        } catch (NegativeArraySizeException e) {

            System.out.println(e + "\nArray size cannot be negative.");

        }
    }
}
