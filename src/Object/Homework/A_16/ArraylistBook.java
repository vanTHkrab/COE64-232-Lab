package Object.Homework.A_16;

import java.util.ArrayList;

public class ArraylistBook {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book b : list) {
            System.out.println(b);
        }
        int total = 0;
        for (Book b : list) {
            total += b.getQuantity();
        }

        System.out.println("Total quantity of books: " + total);

	    System.out.println( "Find book id 101 =>"  ); 
        if (findBook(list, 101)) {
            System.out.println("Book found");
        } else {
            System.out.println("Book not found");
        }

        int j =1 ;

	    System.out.println( "Find book from Wiley =>"  ); 

        for (Book b : list) {
            if (b.getPublisher().equals("Wiley")) {
                System.out.println("Book found at index: " + j);
                break;
            }
            j++;
        }
    }

    public static boolean findBook(ArrayList<Book> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
