package InheritanceChallenges.challenge10;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }
    public void afficheprix(){
        System.out.println("Prix final du produit "+getNom()+" = "+getPrixFinal());
    }
    public double getPrixFinal(){
        return 0;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}
