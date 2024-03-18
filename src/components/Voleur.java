package components;

import java.awt.Color;
import java.awt.Graphics;

import graphe.Sommet;
import listener.MobileListener;

public class Voleur extends Mobile {

    public Voleur(Sommet s){
        super(s);
        this.addMouseListener(new MobileListener(this));
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int)this.getSommet().getPosition().getX() - 5, (int)this.getSommet().getPosition().getY() - 5, 20, 20);   
    }
}
