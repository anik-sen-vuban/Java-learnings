package Test_Code;

class Person_{
    String name;

    //Default constructor
    Person_(){

    }

    //Parameterize constructor
    Person_(String name){
        this.name = name;
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Person_ p = new Person_();
        p.name = "Anik";
        System.out.println(p.name);

        Person_ p1 = new Person_("Vuban");
        System.out.println(p1.name);
    }
}
