package InheritanceChallenges.challenge2;

public class EmployeHoraire extends Employe{
    private int heuresTravaillees;
    private int tauxHoraire;

    public EmployeHoraire(String nom,int heuresTravaillees, int tauxHoraire){
        super(nom);
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
    }
    public double calculerSalaire(){
        return heuresTravaillees*tauxHoraire;
    }

}
