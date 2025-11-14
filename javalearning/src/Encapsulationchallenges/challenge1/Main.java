package Encapsulationchallenges.challenge1;

public class Main {
    public static void main(String[]args){
        Personne person1 = new Personne ("badr",32);
        Passeport pass1 = new Passeport("morocco","14.11.2035");
        person1.assignerPasseport(pass1);
        System.out.println("la personne :"+person1.getNom()+", age: "
                +person1.getAge()+", passeport numero: "+pass1.getNumero()+", nationalite: "
                +pass1.getNationalite()+", date expiration: "+pass1.getDateExpiration());
    }
}
