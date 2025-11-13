package onlinecourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cours{
    private List<Etudiant> coursetudiants = new ArrayList<>();
    private List<> paiements = new ArrayList<>();
    private List<> certifications = new ArrayList<>();
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
    public void afficherDetails(){
        System.out.println("Cours "+this.coursId+": "+this.titre+" ,"+this.description +", prof "+this.instructeur.getNom() +" ,have "+coursetudiants.size()+" students");
    }
    public void genererCertification(){
        Scanner input =new Scanner(System.in);
        System.out.print("Entrez id du cours:");
        int coursid = input.nextInt();
        System.out.print("Entrez id d'etudiant:");
        int etudid = input.nextInt();
        System.out.print("Entrez id d'etudiant:");
        int dateobtention = input.nextInt();
        for (Cours c: cours){

        }
        Certification certif = new Certification(dateobtention);

    }
    public void paiement(){

    }
    public int getId(){return coursId;}
    public String getTitre(){return titre;}
}
