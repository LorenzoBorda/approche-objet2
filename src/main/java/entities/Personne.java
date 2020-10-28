package entities;

public class Personne {

    public Personne(String nouvNom, String nouvPrenom, AdressePostale nouvAdr){
        this.nom = nouvNom;
        this.prenom = nouvPrenom;
        this.adresse = nouvAdr;
    }

    public Personne(String nouvNom, String nouvPrenom){
        this.nom = nouvNom;
        this.prenom = nouvPrenom;
    }

    String nom;
    String prenom;
    AdressePostale adresse;

    public static void main(String[] args){
    }

    public void afficherMaj(){
        String upperCase = this.nom.substring(0, 1).toUpperCase() + this.nom.substring(1);
        System.out.println(upperCase);
    }

    public void setNom(String nouvNom){
        this.nom = nouvNom;
    }

    public void setPrenom(String nouvPrenom){
        this.prenom = nouvPrenom;
    }

    public void setAddresse(AdressePostale nouvAdd){
        this.adresse = nouvAdd;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public AdressePostale getAddr(){
        return this.adresse;
    }
}
