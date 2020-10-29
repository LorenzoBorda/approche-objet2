package fr.diginamic.utils;

import fr.diginamic.banque.entities.Cercle;

public class CercleFactory {


    public static Cercle creerCercle(float nouvR){
        Cercle a = new Cercle(nouvR);
        return a;
    }
}
