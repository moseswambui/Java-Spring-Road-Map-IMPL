package OOP.BookOOPExample;
import java.util.Date;
public class Main {

    public static void main(String[] args){
        Artist artist = new Artist("Moses_wambui", "Password123","moses@gmail.com","0717828930",
                "Moses Wambui", "KE", "1990-01-01");

        artist.displayUserInfo(); // Uses the displayUserInfo() method from User class
        artist.displayUserInfo(true);
        // Using overridden method to display user type
        artist.displayUserType(); // Outputs: "Artist"

        // Creating a book
        Book book = new Book("The Art of Programming", "2023-01-15", "Jane Smith");

        // Displaying book info
        book.displayBookInfo(); // Outputs book information

        // Creating a category
        Category category = new Category("Programming");

        // Getters and setters can be used similarly for Category class
    }

}
