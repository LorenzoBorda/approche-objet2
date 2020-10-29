package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char ope){
        switch(ope){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
}
