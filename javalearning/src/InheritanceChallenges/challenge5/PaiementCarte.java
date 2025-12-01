package InheritanceChallenges.challenge5;

public class PaiementCarte extends Paiement{
    public PaiementCarte(){
    }

    public void effectuerPaiement(double montant){
        System.out.println("Paiement par carte de " + montant + " MAD");
    }


}
