package test;

import display.Game;
import display.Map;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        Map t = new Map();

        // Display
        Game d = new Game(t);
        d.setVisible(true);
    }
}
