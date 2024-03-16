package components;

import javax.swing.JPanel;
import graphe.Sommet;

public class Mobile extends JPanel{
    Sommet sommet;

    public Mobile() {}

    public Mobile(Sommet s){
        this.setSommet(s);
    }

    public void move(Sommet s){
        this.setSommet(s);
    }

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
    }
}