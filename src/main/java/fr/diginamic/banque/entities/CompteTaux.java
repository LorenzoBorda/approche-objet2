package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
    float tauxDeRemun;

    public CompteTaux(String nouvNum, float nouvSolde, float nouvTaux){
        super();
        this.tauxDeRemun = nouvTaux;
        this.numeroCompte = nouvNum;
        this.soldeDuCompte = nouvSolde;
    }

    public String toString(){
        return "Numéro: "+this.numeroCompte+", Solde: "+this.soldeDuCompte+", Taux: "+this.tauxDeRemun;
    }

}
