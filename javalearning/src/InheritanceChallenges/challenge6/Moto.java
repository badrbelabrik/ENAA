package InheritanceChallenges.challenge6;

public class Moto extends Vehicule{
    public Moto(String marque, String modele){
        super(marque,modele);
    }
    public void demarrer(){
        System.out.println("Le moto a demarrer");
    }
    public void calculerAutonomie(int capRes,double consMoy){
        double autonomie;
        autonomie = (capRes/consMoy)*100;
        System.out.println("L'autonomie de moto est : "+autonomie+" Km");
    }
}
