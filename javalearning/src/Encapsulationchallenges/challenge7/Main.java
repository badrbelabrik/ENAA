package Encapsulationchallenges.challenge7;

public class Main {
    public static void main(String[]args){
        Livre l1 = new Livre("livre1");
        Livre l2 = new Livre("livre2");
        Livre l3 = new Livre("livre3");

        Auteur a1 = new Auteur("badr");
        Auteur a2 = new Auteur("yassine");
        Auteur a3 = new Auteur("ali");

        a1.ajouterLivre(l1);
        a1.ajouterLivre(l2);
        a1.ajouterLivre(l3);

        l1.ajouterAuteur(a1);
        l1.ajouterAuteur(a2);
        l1.ajouterAuteur(a3);

        a1.afficherlivres();
        l1.afficherAuteurs();
    }
}
