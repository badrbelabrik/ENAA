package InheritanceChallenges.challenge9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        List<Document>liste = new ArrayList<>();
        liste.add(new PDF());
        liste.add(new Word());
        liste.add(new Image());
        for(Document d: liste){
            d.afficher();
        }
    }
}
