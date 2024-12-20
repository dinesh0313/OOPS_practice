public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        
    }
}
abstract class Animal{
    abstract void walk();
        
}

class Horse extends Animal{
    public void walk()
    {
        System.out.println("4 lengs");
    }
}

class chicken extends Animal
    {
        public void walk()
        {
            System.out.println("2 legs");
        }
    }