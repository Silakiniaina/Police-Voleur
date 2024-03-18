package components;

import java.awt.Color;
import java.awt.Graphics;

import graphe.Sommet;

public class Police extends Mobile {

    public Police(Sommet s){
        super(s);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval((int)this.getSommet().getPosition().getX() - 5, (int)this.getSommet().getPosition().getY() - 5, 20, 20);   
    }
    
}
