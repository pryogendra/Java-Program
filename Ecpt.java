import java.util.*;
class Ecpt
{
    public static void main(String args[])
    {
        try
        {
            int a[]={10,5},b=5;
            int x=a[2]/(b-a[1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error.");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by 0 is not allowed.");
        }
    }
}