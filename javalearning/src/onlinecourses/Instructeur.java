package onlinecourses;

import java.util.ArrayList;
import java.util.List;

public class Instructeur{
    private List<Cours> courses = new ArrayList<>();
    private int instructorId;
    private String nom;
    private String specialisation;

    public Instructeur(int instructorId, String nom, String specialisation){
        this.instructorId = instructorId;
        this.nom = nom;
        this.specialisation = specialisation;
    }
    public void assignerCours(Cours c){
        c.assignerInstructeur(this);
        courses.add(c);
    }
    public void  afficherCours(Cours c){
        System.out.println("Cours assignés à " + nom + " :");
        for(int i=0; i<courses.size(); i++){
            System.out.println("-"+courses.get(i));
        }

    }
}
