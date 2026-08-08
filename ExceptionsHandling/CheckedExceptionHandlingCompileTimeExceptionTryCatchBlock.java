package ExceptionsHandling;

import java.io.EOFException;

public class CheckedExceptionHandlingCompileTimeExceptionTryCatchBlock {
    public static void main(String[] args) throws EOFException {
        //Example 1: ClassNotFoundException
        try{
            Class.forName("AmarMatha");
        } catch(ClassNotFoundException ex){
            System.out.println(ex + " Class not found!");
        }

        //Example 2: EOFException
        try {
            throw new EOFException("End of File");
        } catch(EOFException ex){
            System.out.println(ex.getMessage());
        }

        //Example 3: NoSuchFileException
        try{
            throw new NoSuchFieldException("age");
        } catch (NoSuchFieldException ex){
            System.out.println(ex);
        }
    }

}
