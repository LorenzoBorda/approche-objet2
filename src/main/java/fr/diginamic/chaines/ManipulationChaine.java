package fr.diginamic.chaines;

import entities.Personne;
import fr.diginamic.banque.entities.Compte;

public class ManipulationChaine {
    public static void main(String[] args){
        String chaine = "Durand;Marcel;012543;1 523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(';'));
        System.out.println(chaine.substring(0, chaine.indexOf(';')));
        String a = chaine.substring(0, chaine.indexOf(';'));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        String[] tab = chaine.split(";");
        for(String c: tab){
            System.out.println(c);
        }

        String nom= tab[0];
        String prenom = tab[1];
        String numCompte = tab[2];
        float x = Float.parseFloat(tab[3].replace(" ", ""));

        Personne p = new Personne(nom, prenom);

        Compte compte = new Compte(numCompte, x);
    }
}
