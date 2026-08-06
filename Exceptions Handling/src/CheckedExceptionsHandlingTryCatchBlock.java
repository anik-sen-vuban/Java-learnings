import java.io.EOFException;

public class CheckedExceptionsHandlingTryCatchBlock {
    public static void main(String[] args) {
        //Exception-1
        try {

//            Class.forName("Student");
            System.out.println(Class.forName("Student"));
            System.out.println(Class.forName("Teacher"));
        } catch (ClassNotFoundException amarMatha) {

            System.out.println("Class Not Found.");

        }

        //Exception-2
        try {

            throw new EOFException("End of File. Also amar matha");

        } catch (EOFException e) {

            System.out.println(e.getMessage());

        }

        //Exception-3
        try {
            throw new NoSuchFieldException("age");
        } catch (NoSuchFieldException ex){
            System.out.println("There have no \"age\" named variable");
        }
    }
}

class Student{
    //Student class
}