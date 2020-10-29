package fr.diginamic.banque.entities;

public abstract class Operation {
    String dateOpe;
    public float montant;

    public Operation(){

    }

    public Operation(String nouvDate, float nouvMont){
        super();
        this.dateOpe = nouvDate;
        this.montant = nouvMont;
    }

    public String toString(){
        return "Date: "+this.dateOpe+"Montant: "+this.montant;
    }

    public String afficherType(){
        return "Operation";
    }
}
