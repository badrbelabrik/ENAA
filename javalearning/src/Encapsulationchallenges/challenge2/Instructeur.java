package Encapsulationchallenges.challenge2;
import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    private static int nextId=1;
    private int instructeurId;
    private String nom;
    private String specialisation;
    private List<Cours> coursEnseignes = new ArrayList<>();

    public Instructeur(String nom,String specialisation){
        this.instructeurId = nextId++;
        this.nom = nom;
        this.specialisation = specialisation;
    }
    public void ajouterCours(Cours c){
        coursEnseignes.add(c);
    }
    public void afficherCours(){
        for(Cours c: coursEnseignes){
            System.out.println("cours "+c.getCoursId()+","+c.getTitre()+", "+
                    c.getDescription());
        }
    }
}
