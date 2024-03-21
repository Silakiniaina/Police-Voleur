package components;

import java.awt.Color;
import java.awt.Graphics;

import graphe.Sommet;
import display.Map;

public class Police extends Mobile {

    public Police(Sommet s,Map t){
        super(s,t);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval((int)this.getSommet().getX() - 5, (int)this.getSommet().getY() - 5, 20, 20);   
    }
    @Override
    public boolean canMove() {
        boolean result = false;
        if(this.getMap().getTurn() == 1){
            result = true;
        }
        return result;
    }
    
}
