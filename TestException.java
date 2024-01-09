import java.lang.Exception;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
public class TestException
{
    public static void main(String args[])
    {
        int x=5,y=1000;
        try
        {
            float z=(float)x/(float)y;
            if(z<0.01)
            {
                throw new MyException("Number is too small.");
            }
            else
            {
                System.out.println("z= "+z);
            }
        }
        catch(MyException e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
}