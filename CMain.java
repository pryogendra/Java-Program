class Constructor
{
    int a,b;
    Constructor()
    {
        System.out.println("This is a default constructor.");
        a=10;
        b=10;
    }
    Constructor(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("\nThis is a parameterized constructor.\nThe sum is : "+(a+b));
    }
}
public class CMain
{
    public static void main(String args[])
    {
        Constructor c=new Constructor();
        Constructor c1=new Constructor(10,30);
        //Constructor c2=new Constructor(c);
    }
}