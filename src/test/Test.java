package test;

import java.awt.Point;
import java.util.HashMap;

import components.Mobile;
import components.Police;
import components.Voleur;
import display.Game;
import display.Map;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        Map t = new Map();
        HashMap<String,String> p = new HashMap<>();
        p.put("p1","Computer");
        p.put("p2","Sanda");

        // Display
        Game d = new Game(t);
        d.setVisible(true);

    }
}
