package InheritanceChallenges.challenge1;

public class Rectangle extends Forme {
    private static String name="rectangle";
    private double largeur;
    private double hauteur;
    public Rectangle (double largeur, double hauteur){
        this.name = name;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public double calculerAire(){
        return largeur * hauteur;
    }

}
