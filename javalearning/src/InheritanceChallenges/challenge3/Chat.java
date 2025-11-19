package InheritanceChallenges.challenge3;

public class Chat extends Animal{
    public Chat(String nom){
        super(nom);
    }

    public void faireSon(){
        System.out.println(getNom()+" meowing");
    }
    public void manger(){
        System.out.println(getNom()+" eating");
    }
}
