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
        this.setLayout(null);
        this.setListSommet(ls);
        this.setListMobile(lm);
    }
     
    public Sommet[] getListSommet() {
        return listSommet;
    }
    public void setListSommet(Sommet[] listSommet) {
        for(int i=0; i<listSommet.length; i++){
            Sommet s = listSommet[i];
            s.setBounds((int)s.getPosition().getX(), (int)s.getPosition().getY(), 20, 20);
            this.add(s);
        }
        this.listSommet = listSommet;
    }
    public Mobile[] getListMobile() {
        return listMobile;
    }
    public void setListMobile(Mobile[] listMobile) {
        for(int i=0; i<listMobile.length; i++){
            Mobile m = listMobile[i];
            m.setBounds((int)m.getSommet().getPosition().getX(), (int)m.getSommet().getPosition().getY(), 50, 50);
            this.add(m);
        }
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
