package components;

import javax.swing.JPanel;
import graphe.Sommet;

public class Mobile extends JPanel{
    Sommet sommet;

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
    }
}
