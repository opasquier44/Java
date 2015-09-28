package com.ecp.sio.paintOP.sample;

/**
 * Created by olivierpasquier on 28/09/15.
 */
public class Complex {

    private double r;
    private double i;

    public double getR() {
        return r;
    }

    public double getI() {
        return i;
    }

    public double getMod() {
        return Math.sqrt(Math.pow(r, 2) + Math.pow(i,2));
    }

    public double getArg() {
        return Math.atan(i /r);
    }

// la classe nombre complexe est private, à l'exterieur, on ne sait pas comment est calculté le nombre complexe
    // on ne voit que les getI, getMod de l'extérieur
}
