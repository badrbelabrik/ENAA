package InheritanceChallenges.challenge2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Employe> employes = new ArrayList<>();
        employes.add(new EmployeCommission("ahmed",1500,30,20));
        employes.add(new EmployeHoraire("mohamed",60,100));
        employes.add(new Manager("badr",5000,2000));
        for(Employe e: employes){
            System.out.println(e.getNom()+" salaire : "+e.calculerSalaire());
        }

    }
}
