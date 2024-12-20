public class StaticVariable {
    public static void main(String[] args) {
        Student.name="hello";
        Student s=new Student();
        s.age=20;
        System.out.println(s.age);
        System.out.println(Student.name);
        Student.changename();
        System.out.println(Student.name);
    }
}

class Student
    {
        int age;
        static String name;

        public static void changename()
        {
            name="hello1";
        }
    }

