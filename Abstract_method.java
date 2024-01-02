abstract class Car
{
    String color;
    public String showColors()
    {
        return color;
    }
    abstract public double cc();
}
class SVV extends Car{
    double cc;
    SVV()
    {
        cc=1000.0;
    }
    public double cc()
    {
        return cc;
    }
    
}
public class Abstract_method
{
    public static void main(String args[])
    {
        SVV s= new SVV();
        System.out.println(s.cc());
    }
}