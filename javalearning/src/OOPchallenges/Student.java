package OOPchallenges;

public class Student {

        String name;
        int age;
        int grade;
        public Student(String name,int age,int grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
        public void displayInfo(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }


    public static void main(String[] args){
        Student student1 = new Student("Ali",20,19);
        student1.displayInfo();
    }
}
