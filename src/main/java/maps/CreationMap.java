package maps;

import java.util.HashMap;
public class CreationMap {
    public static void main(String[] args){
        HashMap<String, Integer> a = new HashMap<String, Integer>();

        a.put("Paul", 1750);
        a.put("Hicham", 1825);
        a.put("Yu", 2250);
        a.put("Ingrid", 2015);
        a.put("Chantal", 2418);

        System.out.println(a.size());
    }
}
