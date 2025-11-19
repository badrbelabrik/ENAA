package InheritanceChallenges.challenge5;

public class PaiementVirement extends Paiement{
    public PaiementVirement(){
        super();
    }

    public void effectuerPaiement(double montant){
        System.out.println("Paiement par virement de " + montant + " MAD");
    }
}
