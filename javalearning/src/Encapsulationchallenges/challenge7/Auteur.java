package Encapsulationchallenges.challenge7;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String nom;
    private List<Livre> livres = new ArrayList<>();

    public Auteur(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterLivre(Livre l){
        livres.add(l);
    }
    public void afficherlivres(){
        System.out.println("=== liste des livres de "+this.nom+" ===");
        int counter =1;
        for (Livre l: livres){
            System.out.println("livre "+counter+": "+l.getTitre());
            counter ++;
        }

    }
}
