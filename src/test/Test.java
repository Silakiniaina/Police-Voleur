package test;

import java.awt.Point;

import components.Mobile;
import components.Police;
import components.Voleur;
import display.Display;
import display.Terrain;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        Terrain t = new Terrain();

        // Display
        Display d = new Display(t);
        d.setVisible(true);

    }
}
