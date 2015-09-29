package com.ecp.sio.paintOP.Modele;

/**
 * Created by olivierpasquier on 28/09/15.
 */
public abstract class Shape {

    private int x, y ; // on définit la visibilité - private serait visible uniquement dans le meme package
                    // encapsulation : utiliser le moins possible 'public'
                    // commande n : générateur de code sur Mac

    //public Shape () {

    //}

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() { //methode getter se charge de rendre public de retourner publiquement la valeur de l'attribut Y
        return y;
    }

    public void setY(int y) { // setter stocke la valeur du parametre dans l'attribut
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof  Shape) {
            Shape shape = ((Shape) obj);
            return shape.x == this.x && shape.y == this.y;
        } else {
            return false;
        }

    }

    public abstract double getArea();

}

// getter setter sont crée pour le principe d'encapsulation. Permet de cacher la facon dont x et y ont des valeurs
