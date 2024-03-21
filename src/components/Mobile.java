package components;

import java.awt.Graphics;

import javax.swing.JPanel;
import graphe.Sommet;
public abstract class Mobile extends JPanel{
    Sommet sommet;

    public Mobile() {}

    public Mobile(Sommet s){
        this.setSommet(s);
    }

    public void move(Sommet s){
        this.setSommet(s);
        System.out.println("Moving out");
        this.getSommet().getTerrain().hideChoice();
    }

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
        this.setBounds((int)this.getSommet().getX() - 5, (int)this.getSommet().getY() - 5, 20, 20);
    }

    public abstract void draw(Graphics g);
}
