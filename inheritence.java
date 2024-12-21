import java.util.*;
import bank;

public class inheritence {

    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name="customer1";
    }
}

class shape
{
    public void area()
    {
        System.out.println("print area");
    }
}
class triangle extends shape
{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
}
class circle extends shape
{
    public void area(int r)
    {
        System.out.println(3.14*r*r);
    }
}

