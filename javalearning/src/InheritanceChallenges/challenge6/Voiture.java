package InheritanceChallenges.challenge6;

public class Voiture extends Vehicule{
    public Voiture(String marque, String modele){
        super(marque,modele);
    }

    public void demarrer(){
        System.out.println("La voiture a demarrer");
    }
    public void calculerAutonomie(int capRes,double consMoy){
        double autonomie;
        autonomie = (capRes/consMoy)*100;
        System.out.println("L'autonomie de voiture est : "+autonomie+" Km");
    }
}
