import java.util.*;
class Sample   //Sample.java
{
    public static void main(String args[])
    {
        int a[]={5,10},b=5;
        try
        {
            int x=(a[2]-a[1])/b;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error.");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by 0 is not allowed.");
        }
        finally
        {
            int y=a[1]/a[0];
            System.out.println("Y = "+y);
        }
    }
}