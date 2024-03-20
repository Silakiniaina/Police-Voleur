package components;

import java.awt.Color;
import java.awt.Graphics;

import graphe.Sommet;
import listener.MobileListener;

public class Voleur extends Mobile {

    public Voleur(Sommet s){
        super(s);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval((int)this.getSommet().getPosition().getX() - 5, (int)this.getSommet().getPosition().getY() - 5, 20, 20);   
    }
}
