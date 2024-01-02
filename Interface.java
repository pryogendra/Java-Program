interface Product
{
    static final int pcode=101;
    String pname="Pen";
    public abstract void display();
}
class ProdImpl implements Product
{
    public void display()
    {
        System.out.println("Product Name = "+pname+"\nProduct code = "+pcode);
    }
}
public class Interface
{
    public static void main(String args[])
    {
        ProdImpl pd=new ProdImpl();
        Product p;
        p=pd;
        p.display();
    }
}