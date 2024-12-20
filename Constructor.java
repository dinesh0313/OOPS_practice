public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("dinesh",22);
        s1.printinfo();
    }
}

class Student{
    String name;
    int age;

//     Student()
//     {
//         System.out.println("constructor called"); 
//     }

Student( String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void printinfo()
    {
        System.out.println(this.name+" "+this.age);
    }
}
 