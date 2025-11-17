package Encapsulationchallenges.challenge6;

public class Livre {
    private String titre;
    private String auteur;
    private static int nextId = 1;
    private int isbn;

    public Livre(String titre, String auteur){
        this.isbn = nextId++;
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getIsbn() {
        return isbn;
    }
}
