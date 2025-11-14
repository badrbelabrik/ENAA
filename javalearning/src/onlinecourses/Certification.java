package onlinecourses;

import java.util.List;

public class Certification {
    private static int nextId = 1;
    private int certId;
    private Cours cours;
    private Etudiant etudiant;
    private int dateObtention;

    public Certification(Cours cours,Etudiant etudiant,int dateObtention){
        this.certId = nextId++;
        this.cours = cours;
        this.etudiant = etudiant;
        this.dateObtention = dateObtention;

    }
    public void afficherCertification(){
        System.out.println("certification id: "+this.certId+", etudiant: "+
                this.etudiant.getNom()+", cours: "+this.cours.getTitre()+
                ", date d'obtention: "+this.dateObtention);
    }
    void gghh(List<Cours> cour){

    }
}
