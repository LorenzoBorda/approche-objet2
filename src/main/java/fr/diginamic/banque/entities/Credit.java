package fr.diginamic.banque.entities;

public class Credit extends Operation {

    public Credit(String nouvDate, float nouvMont){
        super();
        this.dateOpe = nouvDate;
        this.montant = nouvMont;
    }

    public String afficherType(){
        return "Credit";
    }
}
