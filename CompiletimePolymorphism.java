
public class CompiletimePolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="dinesh";
        s1.age=22;
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
    }
}

class Student{
    String name;
    int age;



    public void printinfo(String name)
    {
        System.out.println(name);
    }
    public void printinfo(String name,int age)
    {
        System.out.println(name+" "+age);
    }
    public void printinfo(int age)
    {
        System.out.println(age);
    }
}
 