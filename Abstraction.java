public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        Animal animal=new Animal();// cant be create object of abstract class that is animal 
        animal.walk();
        horse.eat();//we can use horse because of horse is extend from the animal abstract class
    }
}
abstract class Animal{
    abstract void walk();
    public void eat()
    {
        System.out.println("animal eat"); //error
    }
    Animal()
    {
        System.out.println("animal constructor");
    }
}

class Horse extends Animal{
    public void walk()
    {
        System.out.println("4 lengs");
    }
    Horse()
    {
        System.out.println("horse constructor");
    }
}

class chicken extends Animal
    {
        public void walk()
        {
            System.out.println("2 legs");
        }
    }