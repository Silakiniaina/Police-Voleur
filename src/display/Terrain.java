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
        if(this.getListMobile() != null){
            for(int i=0; i<listMobile.length; i++){
                Mobile m = listMobile[i];
                m.setBounds((int)m.getSommet().getPosition().getX(), (int)m.getSommet().getPosition().getY(), 50, 50);
                this.add(m);
            }
        }
        this.listMobile = listMobile;
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, this.getWidth(), this.getHeight());
        g.drawLine(300, 0, 300, 600);
        g.drawLine(0, 270, 600, 270);
        g.drawOval(200,170,200,200);
        g.drawArc(200,-20,200,80,170,190);
        g.drawArc(200,500,200,80,0,190);
        g.drawArc(520,170,80,200,90,190);
        g.drawArc(-15,170,80,200,260,190);
        if(this.getListMobile()!= null){
            for(int i=0; i<this.getListMobile().length; i++){
                Mobile s = this.getListMobile()[i];
                s.draw(g);
            }
        }
        for(int i=0; i<this.getListSommet().length; i++){
            Sommet s = this.getListSommet()[i];
            s.draw(g);
        }
        repaint();
    }
}
