package InheritanceChallenges.challenge7;

public class Personnage {
    private String nom;
    private int pointsDevie;

    public Personnage(String nom, int pointsDevie){
        this.nom = nom;
        this.pointsDevie = pointsDevie;
    }
    public void attaquer(Personnage attacked,int points){
       attacked.setPointsDevie(attacked.getPointsDevie()-points);
       if(attacked.getPointsDevie()<0){
           System.out.println(this.getNom()+" Won !!!!");
       }
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDevie() {
        return pointsDevie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDevie(int pointsDevie) {
        this.pointsDevie = pointsDevie;
    }
}
