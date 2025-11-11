package OOPchallenges;

public class Movie {
    String title;
    int rating;

    public Movie(String title, int rating){
        this.title = title;
        this.rating = rating;
    }
    public void displayRating() {
        if (this.rating > 8) {
            System.out.println("The movie "+ this.title +" rating is: Excellent");
        } else if (this.rating >= 5 && this.rating <= 8) {
            System.out.println("The movie "+ this.title +" rating is: Good");
        } else {
            System.out.println("The movie "+ this.title +" rating is: Poor");
        }
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("get out",8);
        movie1.displayRating();
    }
}
