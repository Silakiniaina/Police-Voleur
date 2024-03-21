package test;

import java.awt.Point;
import java.util.HashMap;

import components.Mobile;
import components.Police;
import components.Voleur;
import display.Display;
import display.Terrain;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        Terrain t = new Terrain();
        HashMap<String,String> p = new HashMap<>();
        p.put("p1","Computer");
        p.put("p2","Sanda");

        // Display
        Display d = new Display(t,p);
        d.setVisible(true);

    }
}
