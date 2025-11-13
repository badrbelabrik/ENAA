package onlinecourses;

import java.util.ArrayList;
import java.util.List;

public class Instructeur{
    private List<Cours> courses = new ArrayList<>();
    private static int nextId = 1;
    private int instructorId;
    private String nom;
    private String specialisation;

    public Instructeur(String nom, String specialisation){
        this.instructorId = nextId++;
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

    public String getNom(){
        return nom;
    }
    public int getId(){
        return instructorId;
    }
}
