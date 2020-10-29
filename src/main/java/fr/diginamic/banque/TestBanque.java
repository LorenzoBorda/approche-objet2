package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args){
        Compte a = new Compte("abc", 1);
        CompteTaux b = new CompteTaux("abc", 1, 2);
        Compte[] tableau = new Compte[]{a, b};

        System.out.println(tableau[0].toString());
        System.out.println(tableau[1].toString());
    }
}

