package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {
    public static void main(String[] args){
        Compte a = new Compte("abc", 1);
        System.out.println(a);
    }
}
