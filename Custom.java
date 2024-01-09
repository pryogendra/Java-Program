import java.lang.Exception;
import java.util.*;
class MyEx extends Exception
{
    MyEx(String msg)
    {
        super(msg);
    }
}
public class Custom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        try
        {
            if(age<0)
            {
                throw new MyEx("Age must be greate than 0.");
            }
            else if(age>18)
            {
                System.out.println("Congrats!, You are Eligible for the driving licence.");
            }
            else
            {
                System.out.println("Sorry!, You are not eligible for the driving licence.");
            }
        }
        catch(MyEx e)
        {
            System.out.print(e.getMessage());
        }
    }
}