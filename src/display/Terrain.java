package display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;
import components.Mobile;
import components.Police;
import components.Voleur;
import graphe.Sommet;
import listener.Ecoute;

public class Terrain extends JPanel {
    Sommet[] listSommet;
    Mobile[] listMobile;
    Ecoute ecoute;
    
    
    public Terrain() {
        this.initComponent();
        this.setListSommet(Sommet.getListSommet());
        this.setListMobile();
        this.placeSommet(this.getListSommet());
        Ecoute s = new Ecoute(this);

    }

    public void initComponent(){
        this.setBounds(0,0,600,600);
        this.setLayout(null);
    }

    public Sommet[] getListSommet() {
        return listSommet;
    }
    
    public void setListSommet(Sommet[] listSommet) {
        for (int i = 0; i < listSommet.length; i++) {
            Sommet s = listSommet[i];
            s.setTerrain(this);
            s.setBounds((int) s.getX(), (int) s.getY(), 20, 20);
            this.add(s);
        }
        this.listSommet = listSommet;
    }
    
    public Mobile[] getListMobile() {
        return listMobile;
    }
    
    public void setListMobile() {
        Sommet[] ls = this.getListSommet();
        Mobile[] lm = new Mobile[4];
        lm[0] = new Voleur(ls[20]);
        lm[1] = new Police(ls[19]);
        lm[2] = new Police(ls[18]);
        lm[3] = new Police(ls[17]);
        for(int i=0 ; i<lm.length; i++){
            this.add(lm[i]);
        }
        this.listMobile = lm;
    }
    
    public Ecoute getEcoute() {
        return ecoute;
    }

    public void setEcoute(Ecoute ecoute) {
        this.ecoute = ecoute;
    }

    public Voleur getVoleur() {
        Voleur result = null;
        for (int i = 0; i < this.getListMobile().length; i++) {
            Mobile m = this.getListMobile()[i];
            if (m instanceof Voleur) {
                result = (Voleur) m;
                break;
            }
        }
        return result;
    }

    public void showChoice(){
        Vector<Sommet> ls = this.getEcoute().getChoosen().getSommet().getPossibilities();
        for (int i = 0; i < ls.size(); i++) {
            ls.get(i).setInChoice(true);
        }
        for (int i = 0; i < this.getListSommet().length; i++) {
            if (!ls.contains(this.getListSommet()[i]))
                this.getListSommet()[i].setInChoice(false);
        }
    }

    public void hideChoice(){
        for (int i = 0; i < this.getListSommet().length; i++) {
            this.getListSommet()[i].setInChoice(false);
        }
    }

    public void drawCroquis(Graphics g,int h, int w, int p){
        g.setColor(Color.RED);
        g.drawLine(p*3, 0, p*3, h);
        g.drawLine(w-p*3, 0, w-p*3, h);
        g.drawLine(0, p*3, w, p*3);
        g.drawLine(0, h - p*3, w, h - p*3);
        g.drawLine((int)w/2 - 100, 0, (int)w/2 - 100, h);
        g.drawLine((int)w/2 + 100, 0, (int)w/2 + 100, h);
        g.drawLine(0, (int)h/2 - 100, w, (int)h/2 - 100);
        g.drawLine(0, (int)h/2 + 100, w, (int)h/2 + 100);
    }

    public void placeSommet(Sommet[] ls){
        for(int i=0; i<ls.length; i++){
            ls[i].place(this);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        int w = this.getWidth(), h = this.getHeight();
        final int W_MAGIC_CONSTANT = (int)((w*100)/600);
        final int H_MAGIC_CONSTANT = (int)((h*100)/600);
        final int PH_MAGIC_CONSTANT = (int)((h * 80)/600);
        final int PW_MAGIC_CONSTANT = (int)((w * -20)/600);
        final int PADDING  = 10;
        //this.drawCroquis(g, h, w,PADDING);
        g.setColor(Color.BLACK);
        g.drawOval(this.getX() + PADDING, this.getY() + PADDING, this.getWidth() - PADDING * 2, this.getHeight() - PADDING * 2);
        g.drawLine((int)w/2, PADDING, (int)w/2, h - PADDING);
        g.drawLine(PADDING, (int)h/2, w - PADDING, (int)h/2);
        g.drawOval((int)w/2 - W_MAGIC_CONSTANT, (int)h/2 - H_MAGIC_CONSTANT, 200, 200);
        g.drawArc(w/2 - W_MAGIC_CONSTANT, PW_MAGIC_CONSTANT, 200, 100, 0, -180);
        g.drawArc(w/2 - W_MAGIC_CONSTANT, h - PH_MAGIC_CONSTANT, 200, 100, 0, 180);
        g.drawArc(w - PH_MAGIC_CONSTANT, (int)h/2 - H_MAGIC_CONSTANT, 100, 200, 90, 180);
        g.drawArc(PW_MAGIC_CONSTANT, (int)h/2 - H_MAGIC_CONSTANT, 100, 200, 90, -180);
        if (this.getListMobile() != null) {
            for (int i = 0; i < this.getListMobile().length; i++) {
                Mobile s = this.getListMobile()[i];
                s.draw(g);
            }
        }
        for (int i = 0; i < this.getListSommet().length; i++) {
            Sommet s = this.getListSommet()[i];
            s.draw(g);
        }
        revalidate();
        repaint();
    }
}
