package Object.Homework.A_16;

public class Book {
    private int id;  
	private String name,author,publisher;  
	private int quantity;  

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString(){
        return id + " " + name + " " + author + " " + publisher + " " + quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getId(){
        return id;
    }

    public String getPublisher(){
        return publisher;
    }

    public String toString(int id){
        return id + " " + name + " " + author + " " + publisher + " " + quantity;
    }
}
