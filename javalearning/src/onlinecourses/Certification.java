package onlinecourses;

import java.util.List;
import java.util.Scanner;

public class Certification {
    private static int nextId = 1;
    private int certId;
    private Cours cours;
    private Etudiant etudiant;
    private String dateObtention;

    public Certification(Cours cours, Etudiant etudiant, String dateObtention) {
        this.certId = nextId++;
        this.cours = cours;
        this.etudiant = etudiant;
        this.dateObtention = dateObtention;
    }

    public void assignEtudiant(Etudiant e) {
        this.etudiant = e;
    }

    public int getCertId() {
        return certId;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void afficherCertifications () {
            System.out.println("certification id: " + this.certId + ", etudiant: " +
                    this.etudiant.getNom() + ", cours: " + this.cours.getTitre() +
                    ", date d'obtention: " + this.dateObtention);
        }

    }

