package test;

import java.awt.Point;

import components.Police;
import display.Display;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        // Display
        Display d = new Display();

        // List sommet
        Point p1 = new Point(250,15);
        Point p2 = new Point(300,10);
        Point p3 = new Point(350,15);
        Point p4 = new Point(300,50);

        Sommet s1 = new Sommet(p1);
        Sommet s2 = new Sommet(p2);
        Sommet s3 = new Sommet(p3);
        Sommet s4 = new Sommet(p4);

        Sommet[] listSommet = new Sommet[4];
        listSommet[0] = s1;
        listSommet[1] = s2;
        listSommet[2] = s3;
        listSommet[3] = s4;

        // Mobile
        
        // Terrain



    }
}
