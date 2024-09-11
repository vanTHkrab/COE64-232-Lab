package Object.Homework.A_20_2;

class Book {                                                        // Blank 9: Book
    String name;
    int price;

    Author author;                                                    // Blank 10: Author
    Publisher publisher;                                              // Blank 11: Publisher

    public Book(String n, int p, Author author, Publisher publisher) { // Blank 12: public
        this.name = n;
        this.price = p;
        this.author = author;                                         // Blank 15: this.author
        this.publisher = publisher;                                   // Blank 16: this.publisher
    }
}