package entities;

public class Personne {

    public Personne(String nouvNom, String nouvPrenom, AdressePostale nouvAdr){
        this.nom = nouvNom;
        this.prenom = nouvPrenom;
        this.adresse = nouvAdr;
    }

    String nom;
    String prenom;
    AdressePostale adresse;

    public static void main(String[] args){
    }
}
