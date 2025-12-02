package InheritanceChallenges.challenge10;

public class ProduitAlimentaire extends Produit{
    private int dateExpir;
    public ProduitAlimentaire(String nom, double prix, int dateExpir){
        super(nom,prix);
        this.dateExpir = dateExpir;
    }
    public double getPrixFinal(){
        double total=0;
        if(dateExpir<2026){
            total = getPrix()-0.10;
        } else {total = getPrix();}
        return total;
    }
}
