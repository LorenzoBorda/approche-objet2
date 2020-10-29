package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVilles {
    public static void main(String[] args){
        Ville nice = new Ville("Nice", 343000);
        Ville carcassonne = new Ville("Carcassonne", 47800);
        Ville narbonne = new Ville("Narbonne", 53400);
        Ville lyon = new Ville("Lyon", 484000);
        Ville foix = new Ville("Foix", 9700);
        Ville pau = new Ville("Pau", 77200);
        Ville marseille = new Ville("Marseille", 850700);
        Ville tarbes = new Ville("Tarbes", 40600);
        ArrayList<Ville> a = new ArrayList<>(Arrays.asList(nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes));
        int num = a.get(0).nbHab;
        for(int i=0; i<a.size(); i++){
            if(a.get(i).nbHab > num){
                num = a.get(i).nbHab;
            }
        }
        System.out.println(num);
        for(int i=0; i<a.size(); i++){
            if(a.get(i).nbHab > 100000){
                a.get(i).nom = a.get(i).nom.toUpperCase();
            }
        }
        for(int i=0; i<a.size(); i++){
            System.out.println("Nom : "+ a.get(i).nom + " - Nb. Habs : " + a.get(i).nbHab);
        }
    }
}
