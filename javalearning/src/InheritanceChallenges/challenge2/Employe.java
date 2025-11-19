package InheritanceChallenges.challenge2;

public class Employe {
    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase){
          this.nom = nom;
          this.salaireBase = salaireBase;
    }
    public Employe(String nom){
        this.nom = nom;
    }
    public double calculerSalaire(){
        return 0;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }
}
