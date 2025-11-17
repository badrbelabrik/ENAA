package Encapsulationchallenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private static int nextId = 1;
    private int coursId;
    private String titre;
    private List<Etudiant> inscrits = new ArrayList<>();

    public Cours(String nom){
        this.coursId = nextId++;
        this.titre = nom;
    }
    public void ajouterEtudiant(Etudiant e){
        inscrits.add(e);
    }

    public void afficherEtudiants(){
        System.out.println("=== Liste des etudiants Cours"+ this.coursId+", "+this.titre+" ===");
        for(Etudiant e: inscrits){
            System.out.print("Etudiant "+e.getEtudiantId()+": "+e.getNom()+" | ");
        }

    }

    public int getCoursId() {
        return coursId;
    }

    public String getTitre() {
        return titre;
    }

    public List<Etudiant> getInscrits() {
        return inscrits;
    }
}

