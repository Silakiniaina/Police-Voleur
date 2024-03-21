package components;

import java.awt.Graphics;

import javax.swing.JPanel;
import graphe.Sommet;
import display.Map;
public abstract class Mobile extends JPanel{
    Sommet sommet;
    Map Map;

    
    public Mobile() {}
    
    public Mobile(Sommet s,Map m){
        this.setSommet(s);
        this.setMap(m);
    }

    public void move(Sommet s){
        this.setSommet(s);
        this.getSommet().getMap().hideChoice();
    }

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
        this.setBounds((int)this.getSommet().getX() - 5, (int)this.getSommet().getY() - 5, 20, 20);
    }
    
    public Map getMap() {
        return Map;
    }

    public void setMap(Map Map) {
        this.Map = Map;
    }
    public abstract void draw(Graphics g);
    public abstract boolean canMove();
}
