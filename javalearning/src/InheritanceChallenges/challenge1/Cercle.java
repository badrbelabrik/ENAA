package InheritanceChallenges.challenge1;

public class Cercle extends Forme{
    private double rayon;
    private static String name="cercle";
    public Cercle(double rayon){
        this.name = name;
        this.rayon = rayon;
    }
    public double calculerAire(){

        return Math.PI * Math.pow(rayon,2);
    }

}
