package com.ecp.sio.paintOP.Modele;

/**
 * Created by olivierpasquier on 28/09/15.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cercle {" +
            "rayon=" + radius +
                '}';
    }
}
