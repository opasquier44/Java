package com.ecp.sio.paintOP.Modele;

/**
 * Created by olivierpasquier on 28/09/15.
 */
public class Rectangle extends Shape {

    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y); //on donne les varaible à la calsse parente
        this.width = width;
        this.height = height;
    }

    /*public Rectangle(int x; int y; int width, int height) {
        super (x, y); // on fait appel au constructeur parent, doit être sur la premiere ligne
        this.width = width;
        this.height = height;
    }
    */

    // ce constructeur commence par une majuscule et porte le nom de la classe ou elle est. Permet de construire l'objet
    // construit les arguments et les mets dans l'attributs.
    // je force le code à utiliser rectanle à utiliser ce constructeur
    // si les setter étaient compliqués on les utiliserait dans le cos,tructeur.

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

        // nom parametre et attribut sont les memes, d'ou this. pour donner le nom, pour faire référence à l'attribut.
        // le nom du parametre est prioritaire sur l'attribut
    }

    @Override
    //annotation placée sur la méthode pour signaler que je rédéfinie une classe parente
        public String toString() {
            return "Rectangle {" +
                    "x=" + getX() +
                    " - width=" + width +
                    " - height=" + height +
                    '}';
        }

    @Override
    public boolean equals (Object obj) {
        if (super.equals(obj) && obj instanceof Rectangle){
                Rectangle rect = ((Rectangle) obj);
                return rect.width == width &&
                        rect.height == height;
                }
        return false;
        }

    }

