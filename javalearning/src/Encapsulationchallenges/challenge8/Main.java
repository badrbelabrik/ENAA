package Encapsulationchallenges.challenge8;

public class Main {
    public static void  main(String[]args){
        Facture f1 = new Facture();
        Paiement p1 = new Paiement(300,"11-11-2025");
        Paiement p2 = new Paiement(450,"12-11-2025");
        Paiement p3 = new Paiement(170,"15-11-2025");

        f1.ajouterPaiement(p1);
        f1.ajouterPaiement(p2);
        f1.ajouterPaiement(p3);

        f1.afficherTotal();

    }
}
