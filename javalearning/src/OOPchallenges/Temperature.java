package OOPchallenges;

public class Temperature {
    double celsius;

    public Temperature(double celsius){
        this.celsius = celsius;
    }
    public double toFahrenheit(){
        double fahrenheit;
        fahrenheit = this.celsius * 9/5 + 32;
        return fahrenheit;
    }
    public void display(){
        System.out.println("the value in celsius "+this.celsius+ " is "+toFahrenheit()+" in Fahrenheit");
    }

    public static void main(String[] args){
        Temperature temp1 = new Temperature(40);
        temp1.toFahrenheit();
        temp1.display();
    }
}
