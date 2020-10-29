package fr.diginamic.banque.entities;

public class Compte {
    String numeroCompte;
    float soldeDuCompte;

    public Compte(){

    }

    public Compte(String nouvNum, float nouvSolde){
        this.numeroCompte = nouvNum;
        this.soldeDuCompte = nouvSolde;
    }

    public String toString(){
        return "Numéro: "+this.numeroCompte+", Soldes: "+this.soldeDuCompte;
    }
}
