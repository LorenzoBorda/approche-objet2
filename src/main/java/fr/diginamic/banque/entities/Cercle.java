package fr.diginamic.banque.entities;

public class Cercle implements ObjetGeometrique {
    double rayon;

    public Cercle(double nouvRayon){
        this.rayon=nouvRayon;
    }
    public double getRayon(){
        return this.rayon;
    }
    public double calculPerim(){
        return this.rayon*2*3.14;
    }
    public double calculAire(){
        return this.rayon*this.rayon*3.14;
    }
}
