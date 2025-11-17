package Encapsulationchallenges.challenge4;

public class Produit {
   private String nom;
   private  double prixUnitaire;
   private int quantite;

        public Produit(String nom, double prixUnitaire, int quantite){
            this.nom = nom;
            this.prixUnitaire = prixUnitaire;
            this.quantite = quantite;
        }
    public void commanderProduit(Commande c){
        c.ajouterProduit(this);
    }

    public String getNom() {
        return nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }
}
