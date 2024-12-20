public class classANDobject{
    public static void main(String[] args) {
        pen p1=new pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();
    }
}

class pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("writing something");
    }
}