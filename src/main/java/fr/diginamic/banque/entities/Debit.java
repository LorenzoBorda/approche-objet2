package fr.diginamic.banque.entities;

public class Debit extends Operation {

    public Debit(String nouvDate, float nouvMont){
        super();
        this.dateOpe = nouvDate;
        this.montant = nouvMont;
    }

    public String afficherType(){
        return "Debit";
    }
}
