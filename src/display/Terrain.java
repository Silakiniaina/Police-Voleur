package display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import components.Mobile;
import graphe.Sommet;

public class Terrain extends JPanel{
    Sommet[] listSommet; 
    Mobile[] listMobile;

    public Terrain() {}

    public Terrain(Sommet[] ls, Mobile[] lm){
        this.setListSommet(ls);
        this.setListMobile(lm);
    }
     
    public Sommet[] getListSommet() {
        return listSommet;
    }
    public void setListSommet(Sommet[] listSommet) {
        this.listSommet = listSommet;
    }
    public Mobile[] getListMobile() {
        return listMobile;
    }
    public void setListMobile(Mobile[] listMobile) {
        this.listMobile = listMobile;
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, this.getWidth(), this.getHeight());
        for(int i=0; i<this.getListMobile().length; i++){
            Mobile s = this.getListMobile()[i];
            s.draw(g);
        }
    }
}
