package OOPs;

public class abstraction {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();

        // Hen h2 =new Hen();
        // h2.eat();
        // h2.walk();

        Mustang m =  new Mustang();

        
    }
}

abstract class Animal{
    Animal(){
       System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("Animals Eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    };
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}

class Hen extends Animal{
    void walk() {
        System.out.println("Hen Walks on 2 legs");
    };

}