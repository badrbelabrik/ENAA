package Encapsulationchallenges.challenge9;

public class Etudiant {
    private static int nextId = 1;
    private int id;
    private String nom;
    private Certification certification;

    public Etudiant(String nom){
        this.id = nextId++;
        this.nom = nom;
    }
    public void attribuerCertification(Certification c){
        this.certification = c;
    }
    public void afficherDetails(){
        if(certification != null){
            System.out.println("Etudiant "+this.id+": "+this.nom+", certification :"+certification.getTitre()
                    +", date d'obtention : "+certification.getDateObtention());
        } else {
            System.out.println("Etudiant "+this.id+": "+this.nom+", certification : pas de certification");
        }

    }

}
