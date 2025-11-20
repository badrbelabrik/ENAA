package InheritanceChallenges.challenge10;

public class ProduitVestimentaire extends Produit{
    private double remise;

    public ProduitVestimentaire(String nom, double prix, double remise){
    super(nom,prix);
    this.remise = remise;
    }

    public double getPrixFinal(){
        return getPrix()-(getPrix()/100)*remise;
    }
}
