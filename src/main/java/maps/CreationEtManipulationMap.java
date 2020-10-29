package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(15, "Lille");
        mapVilles.put(26, "Lyon");
        mapVilles.put(37, "Bordeaux");

        for(int cle : mapVilles.keySet()){
            System.out.println(cle);
        }
        for(int cle: mapVilles.keySet()){
            System.out.print(mapVilles.get(cle));
        }
        System.out.println(mapVilles.size());
    }

}
