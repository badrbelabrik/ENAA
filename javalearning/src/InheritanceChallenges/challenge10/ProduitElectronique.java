package InheritanceChallenges.challenge10;

public class ProduitElectronique extends Produit{
    private double taxeEco;
    public ProduitElectronique(String nom, double prix,double taxeEco){
        super(nom,prix);
        this.taxeEco = taxeEco;
    }
    public double getPrixFinal(){
        return getPrix()+taxeEco;
    }

}
