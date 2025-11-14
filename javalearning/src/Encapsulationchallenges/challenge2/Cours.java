package Encapsulationchallenges.challenge2;

public class Cours {
    private static int nextId =1;
    private int coursId;
    private String titre;
    private String description;
    private Instructeur instructeur;

    public Cours(String titre, String description){
        this.coursId = nextId++;
        this.titre = titre;
        this.description = description;
    }
    public void assignInstructeur(Instructeur i){
        i.ajouterCours(this);
        this.instructeur = i;
    }
    public int getCoursId(){
        return coursId;
    }
    public String getTitre(){
        return titre;
    }
    public String getDescription(){
        return description;
    }
}
