class ExampleThrows
{
    public static void main(String args[])
    {
        try
        {
            divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught an Exception "+e);
        }
    }
    public static void divide() throws ArithmeticException
    {
        int x=22,y=0,z;
        z=x/y;
    }
}