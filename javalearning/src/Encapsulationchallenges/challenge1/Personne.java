package Encapsulationchallenges.challenge1;

public class Personne {
    private String nom;
    private int age;
    private Passeport passeport;

    public Personne (String nom, int age){
        this.nom = nom;
        this.age = age;
    }
    public void assignerPasseport(Passeport p){
        this.passeport = p;
    }
    public void afficherInfo(){

    }
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }

}
