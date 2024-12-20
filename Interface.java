
interface Animal{
    void walk();
}

interface har{

}
class Horse implements Animal ,har{
    public void walk()
    {
        System.out.println("4 legs");
    }
}
public class Interface {
   public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
   }
}


