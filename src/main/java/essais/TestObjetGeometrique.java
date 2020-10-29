package essais;

import fr.diginamic.banque.entities.Cercle;
import fr.diginamic.banque.entities.ObjetGeometrique;
import fr.diginamic.banque.entities.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args){
        Cercle a = new Cercle(1);
        Rectangle b = new Rectangle(2, 3);
        ObjetGeometrique[] obj = {a, b};

        for (int i=0; i<2; i++){
            System.out.println(obj[i].calculAire());
            System.out.println(obj[i].calculPerim());
        }
    }
}
