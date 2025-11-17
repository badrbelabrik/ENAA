package Encapsulationchallenges.challenge8;

public class Paiement {
    private double montant;
    private String date;

    public Paiement(double montant, String date){
        this.montant = montant;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public String getDate() {
        return date;
    }
}
