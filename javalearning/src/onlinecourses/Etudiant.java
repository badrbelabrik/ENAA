package onlinecourses;

import java.util.ArrayList;
import java.util.List;

public class Etudiant{
    private List<Cours> etudiantcourses = new ArrayList<>();
    private static int nextId = 1;
    private int studentId;
    private String nom;
    private String email;
    private Paiement paiement;
    private boolean courscompleted;
    private Certification certification;
    public Etudiant(String nom, String email){
        this.studentId = nextId++;
        this.nom = nom;
        this.email = email;
        this.courscompleted = false;
    }
    public void inscrire(Cours c){
        c.ajouterEtudiant(this);
    }
    public void afficherCours(){
    }
    public void setPaiement(Paiement p){
        p.assignEtudiant(this);
        this.paiement = p;
    }
    public void getNewCertification(Certification c){
        c.assignEtudiant(this);
        this.certification = c;
    }
    public int getId() {return studentId;}
    public String getNom() {
        return nom;
    }
    public String getEmail() {
        return email;
    }
    public Paiement getPaiement(){return paiement;}

    public boolean isCourscompleted() {
        return courscompleted;
    }

    public void setCourscompleted() {
        this.courscompleted = true;
    }

    public Certification getCertification() {
        return certification;
    }
}
