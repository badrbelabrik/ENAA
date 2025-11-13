package onlinecourses;

import java.util.ArrayList;
import java.util.List;

public class Cours{
    private ArrayList<Etudiant> coursetudiants = new ArrayList<>();
    private static int nextId = 1;
    private int coursId;
    private String titre;
    private String description;
    private Instructeur instructeur;

    public Cours(String titre, String description){
        this.coursId = nextId++;
        this.titre = titre;
        this.description = description;
    }
    public void ajouterEtudiant(Etudiant e){
        coursetudiants.add(e);
    }
    public Instructeur getInstructeur() {
        return instructeur;
    }
    public void assignerInstructeur(Instructeur i){
        this.instructeur = i;
    }
    public ArrayList<Etudiant> getCoursEtudiant() {
        return coursetudiants;
    }
    public void afficherDetails(){
        System.out.println("Cours "+this.coursId+": "+this.titre+" ,"+this.description +" ,have "+coursetudiants.size());
    }
    public int getId(){return coursId;}
    public String getTitre(){return titre;}
}
