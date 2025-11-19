package InheritanceChallenges.challenge2;

public class Manager extends Employe {
    private int prime;

    public Manager(String nom,double salaireBase,int prime){
        super(nom,salaireBase);
        this.prime = prime;
    }
    public double calculerSalaire(){
        return getSalaireBase()+prime;
    }
}
