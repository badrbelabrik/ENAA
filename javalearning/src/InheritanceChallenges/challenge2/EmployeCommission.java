package InheritanceChallenges.challenge2;

public class EmployeCommission extends Employe{
    private int ventes;
    private int commission;

    public EmployeCommission(String nom,double salaireBase,int ventes,int commission){
       super(nom,salaireBase);
       this.ventes = ventes;
       this.commission = commission;

    }
    public double calculerSalaire(){
        return this.getSalaireBase() + (commission * ventes);
    }
}
