package OOPs;

public class inheritane {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.Breathe();
         Mamal Dog = new Mamal();
         Dog.Breathe();
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void Breathe(){
        System.out.println("Breathe");
    }
}

//Derived class

class Fish extends Animal{
    int fins;
    void Swim(){
        System.out.println("Swims");
    }
}

class Mamal extends Animal{
     int legs;
     void walk(){
        System.out.println("Walk");
     }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("Fly");
    }
}

// class Dog extends Mamal{
//      String breed;
// }