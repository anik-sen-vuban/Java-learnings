package ExceptionsHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        //Finally Block always execute
        try{
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException amarMatha){
            System.out.println(amarMatha + "\nString shouldn't be empty");
        } finally {
            System.out.println("Code is running....");
        }
    }
}
