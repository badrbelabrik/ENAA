package InheritanceChallenges.challenge8;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    public Notification(){
    }
    public void notifierTous(List<Notification> liste, String msg){
        for (Notification n: liste){
            n.envoyer("Nouveau message");
        }
    }
    public void envoyer(String message){

    }
}
