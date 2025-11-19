package InheritanceChallenges.challenge5;

public class Paiement {
    private static int nextId=1;
    private int numero;

    public Paiement(){
        this.numero = nextId++;
    }

    public void effectuerPaiement(double montant){
        System.out.println("Paiement générique de " + montant + " MAD");
    }
    public void traiterPaiement(Paiement p,double montant){
        p.effectuerPaiement(montant);
    }

    public int getNumero() {
        return numero;
    }
}
