package Encapsulationchallenges.challenge10;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private String nom;
    private List<Employe> equipe = new ArrayList<>();

    public Projet(String nom){
        this.nom = nom;
    }
    public void ajouterEmploye(Employe e){
        equipe.add(e);
    }
    public void afficherEmployes(){
        System.out.println("=== Liste equipe du projet "+this.nom+" ===");
        int counter =1;
        for(Employe e: equipe){
            System.out.println(counter+"). "+e.getNom());
        }
    }
    public String getNom() {
        return nom;
    }
}
