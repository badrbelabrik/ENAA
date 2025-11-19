package InheritanceChallenges.challenge3;

public class Chien extends Animal{
    public Chien(String nom){
        super(nom);
    }
    public void faireSon(){
        System.out.println(getNom()+" barking");
    }
    public void manger(){
        System.out.println(getNom()+" eating");
    }
}
