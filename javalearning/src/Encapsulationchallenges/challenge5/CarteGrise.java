package Encapsulationchallenges.challenge5;

public class CarteGrise {
    private static int nextId = 1;
    private int numero;
    private Voiture voiture;
    private String dateEmission;

    public CarteGrise(String dateEmission){
        this.numero = nextId++;
        this.dateEmission = dateEmission;
    }
    public void LierVoiture(Voiture v){
        v.LierCarteGrise(this);
    }

    public int getNumero() {
        return numero;
    }

    public String getDateEmission() {
        return dateEmission;
    }
}
