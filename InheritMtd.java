class Methodover
{
    public void method(int a)
    {
        System.out.println("This is a class 1 method. \nThe value of a is : "+a);
    }
}
public class InheritMtd extends Methodover
{
    public void method(int b)
    {
        System.out.println("This is a class 2 method.\nThe value of b is : "+b);
    }
    public static void main(String args[])
    {
        InheritMtd m=new InheritMtd();
        m.method(5);
    }
}