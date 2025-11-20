package InheritanceChallenges.challenge10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){
       ProduitElectronique pe1 = new ProduitElectronique("tv",3500,0.05);
       ProduitAlimentaire pa1 = new ProduitAlimentaire("chicken",100,2025);
       ProduitVestimentaire pv1 = new ProduitVestimentaire("jacket",350,10);

       List<Produit> produits = new ArrayList<>();
       produits.add(pe1);
       produits.add(pa1);
       produits.add(pv1);

       for(Produit p: produits){
           p.afficheprix();
       }
    }
}
