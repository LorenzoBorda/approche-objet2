package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<String>();
        a.add("USA");
        a.add("France");
        a.add("Allemagne");
        a.add("UK");
        a.add("Italie");
        a.add("Japon");
        a.add("Chine");
        a.add("Russie");
        a.add("Inde");
        int max = 0;
        String v = "";
        for(Object ville : a){
            String mot = (String) ville;
            int l = mot.length();
            if(l>max){
                max = l;
                v = (String) ville;
            }
        }
        a.remove(v);
        System.out.println(a);

    }
}
