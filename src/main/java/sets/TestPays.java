package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestPays {
    public static void main(String[] args){
        HashSet<Pays> a = new HashSet<Pays>();
        Pays usa = new Pays("USA", 1, 90);
        Pays france= new Pays("France", 2, 80);
        Pays allemagne= new Pays("Allemagne", 3, 70);
        Pays uk= new Pays("UK", 4, 60);
        Pays italie= new Pays("Italie", 5, 50);
        Pays japon= new Pays("Japon", 6, 40);
        Pays chine= new Pays("Chine",7 , 30);
        Pays russie= new Pays("Russie", 8, 20);
        Pays inde= new Pays("Inde", 9, 10);

        a.add(usa);
        a.add(france);
        a.add(allemagne);
        a.add(uk);
        a.add(italie);
        a.add(japon);
        a.add(chine);
        a.add(russie);
        a.add(inde);


        int maxPib = 0;
        int minPib = 0;

        for(Pays pays : a){
            if(pays.pib>maxPib){
                maxPib = pays.pib;
            }
        }

        for(Pays pays : a){
            if(pays.pib<minPib){
                minPib=pays.pib;
            }
        }
        for(Pays pays : a){
            if(pays.pib==minPib){
                pays.nom.toUpperCase();
            }
        }
        for(Pays pays : a){
            if(pays.pib==minPib){
                a.remove(pays);
            }
        }

        for(Pays pays : a){
            System.out.println("Nom : "+pays.nom+" nb Habitants : "+pays.nbHab+" PIB : "+pays.pib);
        }
    }
}
