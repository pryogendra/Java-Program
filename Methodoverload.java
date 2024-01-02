class Area
{
    int x,y;
    int area(int x)
    {
        return x*x;
    }
    int area(int x,int y)
    {
        return x*y;
    }
    float area(float x)
    {
        return 3.14f*x*x;
    }
}
public class MethodOverload
{
    public static void main(String args[])
    {
        Area a=new Area();
        System.out.println("Area of Square = "+a.area(5));
        System.out.println("Area of Rectangle = "+a.area(10,20));
        System.out.println("Area of Circle = "+a.area(15.3f));
    }
}