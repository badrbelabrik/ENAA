package OOPchallenges;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void displayProduct(){
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);
        System.out.println("price:"+ price);
    }

    public static void main(String[] args){
        Product p1 = new Product(101,"Laptop", 8500.00);
        p1.displayProduct();
    }
}
