// Main.java
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception
    {
        
        //fill your code here
        BookDAO bookdao=new BookDAO();
        System.out.println("List of Books");
        System.out.format("%-5s %-20s %-20s %-10s %s\n","Id","Title","Category","Author","Price");
       // System.out.println("Id       Title          Category       Author      Price");



        ArrayList<Book> listBooks=new ArrayList<Book>();

        listBooks=bookdao.listBooks();
        for(Book book:listBooks){
            Integer id=book.getId();
            String title=book.getTitle();
            String category=book.getCategory();
            String author=book.getAuthor();
            Double price=book.getPrice();
            System.out.format("%-5s %-20s %-20s %-10s %s\n",id,title,category,author,price);

        }

        

    }
}
