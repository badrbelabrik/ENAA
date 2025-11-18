package onlinecourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cours{
    private List<Etudiant> coursetudiants = new ArrayList<>();
    private List<Certification> certifications = new ArrayList<>();
    private static int nextId = 1;
    private int coursId;
    private String titre;
    private String description;
    private Instructeur instructeur;
    public double prix;

    public Cours(String titre, String description,double prix){
        this.coursId = nextId++;
        this.titre = titre;
        this.description = description;
        this.prix = prix;
    }
    public void ajouterEtudiant(Etudiant e){
        if (e.getPaiement() == null){
            System.out.println("the student did not pay for this course !!!");
        }else{coursetudiants.add(e);}
    }

    public Instructeur getInstructeur() {
        return instructeur;
    }
    public void assignerInstructeur(Instructeur i){
        this.instructeur = i;
    }
    public void afficherDetails(){
        System.out.println("Cours "+this.coursId+": "+this.titre+" ,"+this.description
                +", prof "+this.instructeur.getNom() +" ,have "+coursetudiants.size()
                +" students");
    }
    public void genererCertification() {
        for (Etudiant e : coursetudiants) {
            if (e.isCourscompleted() && !certifications.contains(e.getCertification())) {
                Certification c1 = new Certification(this, e, "2025");
                e.getNewCertification(c1);
                certifications.add(c1);
            }
        }
    }

    public void afficherCertifications(){
        for(Certification c: certifications){
            System.out.println("Certification "+c.getCertId()+": "+"date d'obtention "+c.getDateObtention()
                    +"du cours "+this.titre+", pour l'etudiant "+c.getEtudiant().getNom());
        }

        }

    public int getId(){return coursId;}
    public String getTitre(){return titre;}

    public double getPrix() {
        return prix;
    }

    public List<Etudiant> getCoursetudiants() {
        return coursetudiants;
    }

    public List<Certification> getCertifications() {
        return certifications;
    }
}
