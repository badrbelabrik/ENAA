package onlinecourses;

import java.util.ArrayList;
import java.util.List;

public class Cours{
    private List<Etudiant> etudiants = new ArrayList<>();
    private int courseId;
    private String titre;
    private String description;
    private Instructeur instructeur;

    public Cours(int courseId, String titre, String description){
        this.courseId = courseId;
        this.titre = titre;
        this.description = description;
    }
    public void ajouterEtudiant(Etudiant e){
        etudiants.add(e);
    }
    public Instructeur getInstructeur() {
        return instructeur;
    }
    public void assignerInstructeur(Instructeur i){
        this.instructeur = i;
    }
    public void afficherDetails(){
        System.out.println("Cours "+this.courseId+": "+this.titre+" ,"+this.description);
    }
}
