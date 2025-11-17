package Encapsulationchallenges.challenge4;

public class Main {
    public static void main(String[] qrgs){
        Produit p1 = new Produit("g pro", 1300.0,10);
        Produit p2 = new Produit("razer viper", 1800.0,10);
        Produit p3 = new Produit("final mouse", 3400.0,10);

        Commande c1 = new Commande();
        p1.commanderProduit(c1);
        p2.commanderProduit(c1);
        p3.commanderProduit(c1);

        c1.afficherTotal();


    }
}
