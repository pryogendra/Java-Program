class Book
{
    static String bname;
    static String author;
    static void create_book()
    {
        bname="java Core";
        author="James G";
    }
    static void book_details()
    {
        System.out.println("Book name ="+bname);
        System.out.println("Author ="+author);
    }
}
public class StaticMethod
{
    public static void main(String args[])
    {
        Book.create_book();
        Book.book_details();
    }
}