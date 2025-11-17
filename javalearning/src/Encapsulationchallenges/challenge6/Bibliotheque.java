package Encapsulationchallenges.challenge6;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    private List<Livre> livres = new ArrayList<>();

    public Bibliotheque(String nom){
        this.nom = nom;
    }
    public void ajouterLivre(Livre l){
        livres.add(l);
    }
    public void supprimerLivre(Livre l){
        livres.remove(l);
    }
    public void afficherLivres(){
        System.out.println("=== "+this.nom+" ===");
        for (Livre l: livres){
            System.out.println("livre "+l.getIsbn()+": "+l.getTitre()+", auteur: "
            +l.getAuteur());
        }
    }

}
