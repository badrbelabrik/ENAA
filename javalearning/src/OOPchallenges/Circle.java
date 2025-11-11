package OOPchallenges;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double Area(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getCircumreference(){
        double circum = 2 * Math.PI * this.radius;
        return circum;
    }

    public void display(){
        System.out.println("results of circle radius :"+this.radius);
        System.out.println("Area= "+ Area()+", Circumreference= "+getCircumreference());
    }

    public static void main(String[]args){
    Circle circle1 = new Circle(10);
    circle1.Area();
    circle1.getCircumreference();
    circle1.display();
    }
}
