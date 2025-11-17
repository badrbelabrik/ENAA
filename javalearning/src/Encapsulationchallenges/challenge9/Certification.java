package Encapsulationchallenges.challenge9;

public class Certification {
    private String titre;
    private String dateObtention;

    public Certification(String titre, String dateObtention){
        this.titre = titre;
        this.dateObtention = dateObtention;
    }

    public String getTitre() {
        return titre;
    }

    public String getDateObtention() {
        return dateObtention;
    }
}
