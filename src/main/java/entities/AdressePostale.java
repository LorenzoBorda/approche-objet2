package entities;

public class AdressePostale {

    public AdressePostale(String nouvNum, String nouvLib, int nouvCode, String nouvVille){
        this.numeroDeRue = nouvNum;
        this.libelleDeLaRue = nouvLib;
        this.codePostal = nouvCode;
        this.ville = nouvVille;
    }

    public static void main(String[] args){

        System.out.println("coucou");
    }
    String numeroDeRue;
    String libelleDeLaRue;
    int codePostal;
    String ville;
}
