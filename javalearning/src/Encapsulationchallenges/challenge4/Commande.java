package Encapsulationchallenges.challenge4;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private static int nextId =1;
    private int id;
    private List<Produit> produits = new ArrayList<>();

    public Commande(){
        this.id = nextId++;
    }

    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    public double calculerTotal(){
        double total = 0;
        for(Produit p: produits){
            total += p.getPrixUnitaire();
        }
        return total;
    }
    public void afficherTotal(){
        System.out.println("Le total de la commande et :"+this.calculerTotal()+" MAD");
    }

    public int getId() {
        return id;
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
