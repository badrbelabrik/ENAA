package InheritanceChallenges.challenge7;

public class Mage extends Personnage{
    public Mage(String nom, int pointsDevie){
        super(nom,pointsDevie);
    }
    public void attaquer(Personnage attacked){
        int points = 20;
        attacked.setPointsDevie(attacked.getPointsDevie()-points);
        System.out.println(getNom()+" Attacked "+ attacked.getNom());
        if(attacked.getPointsDevie()<0){
            System.out.println(this.getNom()+" Won !!!!");
        }
    }
}
