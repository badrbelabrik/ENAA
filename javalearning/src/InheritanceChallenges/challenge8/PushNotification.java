package InheritanceChallenges.challenge8;

public class PushNotification extends Notification{
    public void envoyer(String message){
        System.out.println(message);
        System.out.println("Notification reçu par Push");
    }
}
