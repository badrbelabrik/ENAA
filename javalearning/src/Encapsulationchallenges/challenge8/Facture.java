package Encapsulationchallenges.challenge8;

import java.util.ArrayList;
import java.util.List;

public class Facture {
    private static int nextId =1;
    private int id;
    private List<Paiement> paiements = new ArrayList<>();

    public Facture(){
        this.id = nextId++;
    }
    public void ajouterPaiement(Paiement p){
        paiements.add(p);
    }
    public double calculerTotalPaiements(){
        double total=0;
        for(Paiement p: paiements){
            total += p.getMontant();
        }
        return total;
    }
    public void afficherTotal(){
        System.out.println("Total payer pour la facture "+this.id+" : "+
                this.calculerTotalPaiements()+ " MAD");
    }
}
