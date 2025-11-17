package Encapsulationchallenges.challenge7;

import java.util.ArrayList;
import java.util.List;

public class Livre {
    private String titre;
    private List<Auteur> auteurs = new ArrayList<>();

    public Livre(String titre){
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void ajouterAuteur(Auteur a){
        auteurs.add(a);
    }

    public void afficherAuteurs(){
        System.out.println("=== liste des auteurs de livre "+this.titre+" ===");
        int counter =1;
        for(Auteur a: auteurs){
            System.out.println("auteur "+counter+" : "+a.getNom());
            counter++;
        }
    }
}
