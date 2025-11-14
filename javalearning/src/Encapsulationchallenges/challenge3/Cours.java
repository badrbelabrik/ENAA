package Encapsulationchallenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private static int nextId = 1;
    private int coursId;
    private String nom;
    private List<Etudiant> inscrits = new ArrayList<>();

    public Cours(String nom){
        this.coursId = nextId++;
        this.nom = nom;
    }
    public void ajouterEtudiant(Etudiant e){
        inscrits.add(e);
    }
}
