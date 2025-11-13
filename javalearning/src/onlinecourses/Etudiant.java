package onlinecourses;

public class Etudiant{
    private static int nextId = 1;
    private int studentId;
    private String nom;
    private String email;
    public Etudiant(String nom, String email){
        this.studentId = nextId++;
        this.nom = nom;
        this.email = email;
    }
    public void inscrire(Cours c){
        c.ajouterEtudiant(this);
    }
    public void afficherCours(){
    }
    public int getId() {return studentId;}
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
}
