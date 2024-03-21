package components;

import java.awt.Color;
import java.awt.Graphics;

import graphe.Sommet;
import display.Map;

public class Voleur extends Mobile {

    public Voleur(Sommet s,Map m){
        super(s,m);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval((int)this.getSommet().getX() - 5, (int)this.getSommet().getY() - 5, 20, 20);   
    }
    @Override
    public boolean canMove() {
        boolean result = false;
        if(this.getMap().getTurn() == 0){
            result = true;
        }
        return result;
    }
}
