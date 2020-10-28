package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale adresse = new AdressePostale("a", "a", 1, "a");
        Personne pa = new Personne("a", "a", adresse);
        Personne pb = new Personne("a", "a");
        AdressePostale adresse2 = new AdressePostale("b", "b", 1, "b");
        pa.setAddresse(adresse2);
    }
}
