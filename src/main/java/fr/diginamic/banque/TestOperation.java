package fr.diginamic.banque;

import fr.diginamic.banque.entities.Operation;
import fr.diginamic.banque.entities.Credit;
import fr.diginamic.banque.entities.Debit;

public class TestOperation {

    public static void main(String[] args){
        Credit a = new Credit("1", 2);
        Credit b = new Credit("1", 1);
        Credit c = new Credit("1", 1);
        Credit d = new Credit("1", 1);
        Debit e = new Debit("1", 1);
        Debit f = new Debit("1", 1);
        Debit g = new Debit("1", 1);
        Debit h = new Debit("1", 1);
        Operation[] ope = new Operation[]{a,b,c,d,e,f,g,h};
        int total =0;
        for(int i=0; i<ope.length; i++){
            System.out.println(ope[i].afficherType() + " - " + ope[i].toString());
            if(ope[i].afficherType() == "Credit"){
                total += ope[i].montant;
            }else{
                total -= ope[i].montant;
            }
        }
        System.out.println(total);
    }

}
