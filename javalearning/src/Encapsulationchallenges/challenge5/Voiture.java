package Encapsulationchallenges.challenge5;

public class Voiture {
    private static int nextId = 1;
    private int immatriculation;
    private String marque;
    private String modele;
    private CarteGrise cartegrise;

    public Voiture(String marque, String modele){
        this.immatriculation = nextId++;
        this.marque = marque;
        this.modele = modele;
    }
    public void LierCarteGrise(CarteGrise c){
        this.cartegrise = c;
    }
    public void Afficherdetails(){
        System.out.print("voiture numero: "+this.immatriculation+", marque: "
                +this.marque+", modele: "+this.modele);
        if (cartegrise != null){
            System.out.println(", carte grise numero: "
                    +cartegrise.getNumero() +", date: "+cartegrise.getDateEmission());
        } else {System.out.println(", aucune carte grise liée.");}
    }
}
