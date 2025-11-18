package onlinecourses;

public class Paiement {
    private static int nextId=1;
    private int Id;
    private double prix;
    private Etudiant etudiant;
    private Cours cours;
    public boolean done;

    public Paiement(Cours cours, boolean done){
        this.Id = nextId++;
        this.cours = cours;
        this.done = done;
    }

    public void assignEtudiant(Etudiant e){
        this.etudiant = e;
    }
    public void assignPrix(Cours c){
        this.prix = c.getPrix();
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return Id;
    }
}
