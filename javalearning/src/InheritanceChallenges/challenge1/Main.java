package InheritanceChallenges.challenge1;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Forme> formes = new ArrayList<>();
        formes.add(new Cercle(15.0));
        formes.add(new Rectangle(3.5,4));
        for(Forme f: formes){
            System.out.println(f.calculerAire());
        }
    }
}
