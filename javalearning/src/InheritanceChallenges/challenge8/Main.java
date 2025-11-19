package InheritanceChallenges.challenge8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Notification n1 = new Notification();
        List<Notification> liste1 = new ArrayList<>();
        liste1.add(new EmailNotification());
        liste1.add(new PushNotification());
        liste1.add(new SmsNotification());
        n1.notifierTous(liste1, "message reçu");
    }
}
