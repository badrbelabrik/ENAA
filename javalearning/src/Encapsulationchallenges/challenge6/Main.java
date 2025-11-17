package Encapsulationchallenges.challenge6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Bibliotheque b1 = new Bibliotheque("bibliotheque municipal");
        Livre l1 = new Livre("livre1","jean");
        Livre l2 = new Livre("livre2","marcos");
        Livre l3 = new Livre("livre3","felipe");

        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);

        b1.supprimerLivre(l2);

        b1.afficherLivres();
    }


}
