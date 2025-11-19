package InheritanceChallenges.challenge6;

public class Main {
    public static void main(String[]args){
        Voiture v1 = new Voiture("renault","clio");
        Moto m1 = new Moto("peugeot","103");
        Camion c1 = new Camion("scania","540");

        v1.demarrer();
        v1.calculerAutonomie(50,7);
    }
}
