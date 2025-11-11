package OOPchallenges;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(){
        this.brand = "Peugeot";
        this.model = "208";
        this.year = 2020;
    }

    public void displayCar(){
        System.out.println("Car brand: "+brand+" model: "+model+" year: "+year);
    }

    public static void  main(String[] args){
        Car car1 = new Car();
        car1.displayCar();

        Car car2 = new Car("Reanult", "Clio4", 2015);
        car2.displayCar();

    }
}
