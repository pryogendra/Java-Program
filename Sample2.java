import java.util.*;
class Sample2      //Sample2.java
{
    public static void main(String args[])
    {
        int a=10,b=5,c=5;
        try
        {
            int x=a/(b-c);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by 0 is not allowed.");
        }
    }
}