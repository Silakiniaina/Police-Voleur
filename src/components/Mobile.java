package components;

import java.awt.Graphics;

import javax.swing.JPanel;
import graphe.Sommet;
public abstract class Mobile extends JPanel{
    Sommet sommet;

    public Mobile() {}

    public Mobile(Sommet s){
        this.setSommet(s);
        this.setBounds((int)this.getSommet().getPosition().getX() - 5, (int)this.getSommet().getPosition().getY() - 5, 20, 20);
    }

    public void move(Sommet s){
        this.setSommet(s);
        System.out.println("Moving out");
        this.setBounds((int)s.getPosition().getX() - 5,(int)s.getPosition().getY() - 5,20,20);
        this.getSommet().getTerrain().hideChoice();
    }

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
    }

    public abstract void draw(Graphics g);
}
