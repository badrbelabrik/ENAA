package Encapsulationchallenges.challenge10;

import java.util.ArrayList;
import java.util.List;

public class Employe {
    private String nom;
    private List<Projet> projets = new ArrayList<>();

    public Employe(String nom){
        this.nom = nom;
    }
    public void ajouterProjet(Projet p){
        p.ajouterEmploye(this);
        projets.add(p);
    }
    public void afficherProjets(){
        System.out.println("=== Liste des projets de "+this.nom+" ===");
        int counter =1;
        for(Projet p: projets){
            System.out.println(counter+"). "+p.getNom());
            counter++;
        }
    }

    public String getNom() {
        return nom;
    }
}
