import java.util.*;
class Sample1   //Sample1.java
{
    public static void main(String args[])
    {
        try
        {
            int a=15,b=5,c=5,x;
            int p[]={2};
            p[3]=33;
            try
            {
                x=a/(b-c);
                System.out.println("X= "+x);
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Division by 0 is not allowed.");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error.");
        }
    }
}