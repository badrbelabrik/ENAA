package InheritanceChallenges.challenge6;

public class Camion extends Vehicule{
    public Camion(String marque, String modele){
        super(marque,modele);
    }

    public void demarrer(){
        System.out.println("Le camion a demarrer");
    }
    public void calculerAutonomie(int capRes,double consMoy){
        double autonomie;
        autonomie = (capRes/consMoy)*100;
        System.out.println("L'autonomie de camion est : "+autonomie+" Km");
    }
}
