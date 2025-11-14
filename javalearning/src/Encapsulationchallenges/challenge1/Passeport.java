package Encapsulationchallenges.challenge1;

public class Passeport {
    private static int nextnumero = 1;
    private int numero;
    private String nationalite;
    private String dateExpiration;

    public Passeport(String nationalite, String dateExpiration) {
        this.numero = nextnumero++;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;
    }
    public int getNumero(){
        return numero;
    }
    public String getNationalite(){
        return nationalite;
    }
    public String getDateExpiration(){
        return dateExpiration;
    }

}
