class Person
{
    String name="Rohit",gender="Male";
    int age=19;
}
class Student extends Person
{
    
    int roll_no=1098;
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
    }
    
}
public class Inheritance
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.display();
    }
    
}