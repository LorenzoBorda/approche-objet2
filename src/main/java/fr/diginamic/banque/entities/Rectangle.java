package fr.diginamic.banque.entities;

public class Rectangle implements ObjetGeometrique {
    double a;
    double b;
    public double calculPerim(){
        return this.a*2+this.b*2;
    }
    public double calculAire(){
        return this.a*this.b;
    }

    public Rectangle(double aa, double bb){
        this.a = aa;
        this.b = bb;
    }
}
