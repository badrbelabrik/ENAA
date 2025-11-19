package InheritanceChallenges.challenge3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Chien("max"));
        animals.add(new Chat("caty"));
        for(Animal a: animals){

            a.faireSon();
            a.manger();
        }
    }
}
