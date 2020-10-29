package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {
    public static void main(String[] args){
        ArrayList a = new ArrayList(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        String plusLong = (String) a.get(0);
        for(int i=0; i<a.size(); i++){
            String mot = (String) a.get(i);
            if(plusLong.length() < mot.length()){
                plusLong = mot;
            }
        }
        System.out.println(plusLong);
        for(int i=0; i<a.size(); i++){
            String mot = (String) a.get(i);
            a.set(i, mot);
        }
        for(int i=0; i<a.size(); i++){
            String nom = (String) a.get(i);
            System.out.println(nom.charAt(0));
            if(nom.charAt(0) == 'N'){
                a.remove(i);
            }
        }
        for(int i=0; i<a.size(); i++){
            String nom = (String) a.get(i);
            System.out.println(nom);
        }
    }
}
