import java.util.*;

//Method override


abstract class university{
    abstract String versityName();
    abstract int getStudentNum();
}

class DU extends university{
    @Override
    int getStudentNum(){
        return 10000;
    }
    String versityName(){
        return "Dhaka University";
    }
}

class DIU extends university{
    @Override
    int getStudentNum(){
        return 20000;
    }
    String versityName(){
        return "Daffodil International University";
    }
}

class UIU extends university{
    @Override
    int getStudentNum(){
        return 15000;
    }
    String versityName(){
        return "United Internation University";
    }
}


public class MethodOverRide {
    public static void main(String[] args) {
        university x = new DIU();
        System.out.println("University Name: " + x.versityName());
        System.out.println("Student's Number: " + x.getStudentNum());

        System.out.println("----------------");

        x = new DU();
        System.out.println("University Name: " + x.versityName());
        System.out.println("Student's Number: " + x.getStudentNum());

        System.out.println("----------------");

        x = new UIU();
        System.out.println("University Name: " + x.versityName());
        System.out.println("Student's Number: " + x.getStudentNum());
    }
    
    
}
