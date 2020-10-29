package essais;

import fr.diginamic.banque.entities.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args){
        Cercle a = new Cercle(1);
        Cercle b = new Cercle(3);
        System.out.println(a.calculPerim());
        System.out.println(a.calculAire());
        System.out.println(b.calculPerim());
        System.out.println(b.calculAire());
        Cercle c = CercleFactory.creerCercle(6);
        System.out.println(c.calculPerim());
        System.out.println(c.calculAire());
    }
}
