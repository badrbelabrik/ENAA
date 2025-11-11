package OOPchallenges;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public int calculateArea(){
        int area;
        area = length*width;
        return area;
    }
    public void display(){
        int area = calculateArea();
        System.out.println(length+" * "+width+" = "+area);
    }

    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(12,15);
        rec1.calculateArea();
        rec1.display();
    }
}
