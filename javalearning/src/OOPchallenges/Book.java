package OOPchallenges;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: "+this.title+", Author: "+this.author+", Price: "+this.price);
    }

    public static void main(String[] args){
        Book book1 = new Book("title1","john",120);
        book1.display();
    }
}
