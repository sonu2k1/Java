package OOPs;

public class constructor {
    public static void main(String[] args){
        Student s1 = new Student();
           s1.name = "Sonu";
           s1.roll = 47;
           s1.password = "abc";
        Student s2 = new Student(s1);
        s2.password = "xyz";
        //System.out.println(s1.name);
    }
}

class Student{    
    String name;
    int roll;
    String password;
    
    Student(Student s1){   /// Copy Constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(String name){ //Parameterized Constructor
        this.name = name;

    }
    Student(){    // Non Parametrized Constructor
        System.out.println("Constructor is called....");
    }
    Student(int roll){
        this.roll = roll;

    }
}