package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args){
        ArrayList a = new ArrayList(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        for(int i =0; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println(a.size());
        System.out.println(Collections.max(a));
        a.remove(a.indexOf(Collections.min(a)));
        for(int i=0; i<a.size(); i++){
            int a1 = (int)a.get(i);
            if(a1 < 0){
                a1 = a1*-1;
                a.set(i, a1);
            }
        }
        for(int i =0; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
