package InheritanceChallenges.challenge6;

public class Vehicule {
    private String marque;
    private String modele;

    public Vehicule(String marque,String modele){
        this.marque = marque;
        this.modele = modele;
    }
    public void demarrer(){
        System.out.println("Vehicule a demarrer");
    }
    public void calculerAutonomie(int capRes,double consMoy){
        double autonomie;
        autonomie = (capRes/consMoy)*100;
        System.out.println("L'autonomie de vehicule est : "+autonomie+" Km");
    }
}
