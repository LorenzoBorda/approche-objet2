package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> a = new HashSet<Double>();
        a.add(1.5);
        a.add(8.25);
        a.add(-7.23);
        a.add(13.3);
        a.add(-12.45);
        a.add(48.5);
        a.add(0.01);
        System.out.println(a);
        Collections.max(a);
        a.remove(Collections.min(a));
        System.out.println(a);
    }
}
