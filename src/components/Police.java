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
        g.setColor(Color.GREEN);
        g.fillRect((int)this.getSommet().getPosition().getX(), (int)this.getSommet().getPosition().getY(), 20, 20);  
    }
    
}
