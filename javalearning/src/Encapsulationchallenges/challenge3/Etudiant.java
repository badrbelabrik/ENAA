package Encapsulationchallenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private static int nextId = 1;
    private int etudiantId;
    private String nom;
    private List<Cours> coursSuivis = new ArrayList<>();

public Etudiant(String nom){
    this.etudiantId = nextId++;
    this.nom = nom;
}

public void inscrire(Cours c){
    c.ajouterEtudiant(this);
    coursSuivis.add(c);
}
public void afficherCours(){
    System.out.println("=== Liste du cours etudiant "+this.nom+" ===");
    for(Cours c: coursSuivis){
        System.out.println( "cours "+c.getCoursId()+": "+c.getTitre());
    }
}

    public static int getNextId() {
        return nextId;
    }


    public int getEtudiantId() {
        return etudiantId;
    }

    public String getNom() {
        return nom;
    }

    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }
}
