package Object.Homework.A_20_2;

public class PublisherTest {

    public static void main (String[] args) {
        Author author = new Author("John", 42, "USA");              // Blank 17: Author; Blank 18: new Author
        Publisher publisher = new Publisher("Sun Publication", "JDSR-III4", "LA"); // Blank 19: Publisher; Blank 20: new Publisher
        Book b = new Book("Java for Beginner", 800, author, publisher); // Blank 21: Book; Blank 22: new Book

        System.out.println("Book Name: " + b.name);                 // Blank 23: b.name
        System.out.println("Book Price: " + b.price);               // Blank 24: b.price

        System.out.println("------------Author Details----------");
        System.out.println("Author Name: " + b.author.authorName);  // Blank 25: b.author.authorName
        System.out.println("Author Age: " + b.author.age);          // Blank 26: b.author.age
        System.out.println("Author place: " + b.author.place);      // Blank 27: b.author.place

        System.out.println("------------Publisher Details-------");
        System.out.println("Publisher Name: " + b.publisher.name);  // Blank 28: b.publisher.name
        System.out.println("Publisher ID: " + b.publisher.publisherID); // Blank 29: b.publisher.publisherID
        System.out.println("Publisher City: " + b.publisher.city);  // Blank 30: b.publisher.city
    }
}
