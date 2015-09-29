/**
 * Created by olivierpasquier on 21/09/15.
 */

package com.ecp.sio.paintOP; // créer dans un package avec une convention de nommage
import com.ecp.sio.paintOP.Modele.Rectangle;
import com.ecp.sio.paintOP.Modele.Circle;
import com.ecp.sio.paintOP.Modele.Shape;

import java.util.ArrayList;
import java.util.List;

public class PaintOP {

    // premiere classe par défaut = public

    public static void main(String[] args) {

        /* Static pour caractériser methode qui n'appartient pas à une méthode des objets
        on utilise méthode sans crééer instance de classe. Méthode static n'a pas acces aux methodes non-static, eg instancié


        PaintOP ps= new PaintOP ();

        PaintOP.main ();  //appel particulier de main
        */

        /*
        byte a = 3;
        long f = 586L
        float b = 3.2f
        System.out.println("Hello World");
        System.out.println(a);
        double h = 2 / 3; // division d'un int par int donne un int
        double h = 2. / 3; // avec un point, donne un nom à virgule
        boolean d = true;
        boolean and = d && false;
        boolean or = d || true;
        // System est deja organisé dans un package. Pas besoin de préciser java.lang.
        // .out est forcement statique car non défini comme classe

        // structure de langage
        if (a == 2) { // est un boolean
            System.out.println(a + "equals 2");
            else if (a == 3) {
                System.out.println(a + "equals 3");
                else{
                }
            }
            }
        // boucle for
        for (int i=0; i <10; i++) {
            System.out.println("Loop " + i);
        }
        }
    a = Math.round(b);
    System.out.println(a);
    *
    */

        Rectangle rect = new Rectangle(10, 20, 200, 100);
        // on doit préciser les parametres car on a utilisé un constructeur dans la classe
        System.out.println(rect.toString());

        Rectangle rect1 = new Rectangle(10, 20, 200, 100);
        System.out.println(rect1.toString());

        Rectangle rect2 = new Rectangle(10, 20, 200, 100);
        System.out.println(rect2.toString());

        Shape shape = new Rectangle(10, 20, 200, 100);
        System.out.println(shape.toString());

        System.out.println(shape.getArea());

        boolean test = rect1.equals(rect2);

        System.out.println(test);


        Circle circ = new Circle(15, 25, 20);
        // on doit préciser les parametres car on a utilisé un constructeur dans la classe
        System.out.println(circ.toString());

        int[] table1 = new int[3];
        // int [] table2 = new int { 1, 2, 3 };
        int [] table3 = {1, 2, 3 };


        // les tableaux ont une taille fixe, à utiliser quand on sait ce qu'ol y a dedans, sinon créer des objects

        List<String> list = new ArrayList<String>; // List est une interface soit une liste de méthode, non instanciable, il faut arraylist
        list.add("toto");
        // list.add(rect1); ne peut prendre que des string

        list.remove(0);
        list.get(0);// donne l'objet de la liste au point 0

        String str = list.get(0);
        // Rectangle r = (Rectangle) list.get(0);

        //list est une classe générique qui prends un paramètre quand on l'instancie <> = parametre générique

        String[] strings = {"Hello", "World"};
        String str = strings[0];

        for (String s : strings) { // on définit une variable temporaire s

        }

    }
}
