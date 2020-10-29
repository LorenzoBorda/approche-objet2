package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args){
        ArrayList<Integer> listeInt = new ArrayList<Integer>();
        for(int i=1; i<=100; i++){
            listeInt.add(i);
        }
        System.out.println(listeInt.size());
    }
}
