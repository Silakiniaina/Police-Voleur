package display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;
import components.Mobile;
import components.Police;
import components.Voleur;
import graphe.Sommet;
import listener.Listener;

public class Map extends JPanel {
    Sommet[] listSommet;
    Mobile[] listMobile;
    Listener ecoute;
    int turn = 0;

    public Map() {
        this.initComponent();
        this.setListSommet(Sommet.getListSommet());
        this.setListMobile();
        this.placeSommet(this.getListSommet());
        Listener s = new Listener(this);

    }

    public void initComponent(){
        this.setBounds(0,0,600,700);
        this.setLayout(null);
    }

    public Sommet[] getListSommet() {
        return listSommet;
    }
    
    public void setListSommet(Sommet[] listSommet) {
        for (int i = 0; i < listSommet.length; i++) {
            Sommet s = listSommet[i];
            s.setMap(this);
            s.setBounds((int) s.getX(), (int) s.getY(), 20, 20);
            this.add(s);
        }
        this.listSommet = listSommet;
    }
    
    public Mobile[] getListMobile() {
        return listMobile;
    }

    public void switchTurn(){
        if(this.getTurn() == 0){
            this.setTurn(1);
        }else{
            this.setTurn(0);
        }
    }
    
    public void setListMobile() {
        Sommet[] ls = this.getListSommet();
        Mobile[] lm = new Mobile[4];
        lm[0] = new Voleur(ls[20],this);
        lm[1] = new Police(ls[19],this);
        lm[2] = new Police(ls[18],this);
        lm[3] = new Police(ls[17],this);
        for(int i=0 ; i<lm.length; i++){
            this.add(lm[i]);
        }
        this.listMobile = lm;
    }
    
    public Listener getEcoute() {
        return ecoute;
    }

    public void setEcoute(Listener ecoute) {
        this.ecoute = ecoute;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
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

    public boolean isGameOver(){
        boolean result = false;
        if(this.getVoleur().getSommet().getPossibilities().size() == 0 || this.getVoleur().getSommet().equals(this.getListSommet()[20])){
            result = true;
        }
        return result;
    }

    public String getWinner(){
        String result = "POLICE";
        if( this.getVoleur().getSommet().equals(this.getListSommet()[20])){
            result = "VOLEUR";
        }
        return result;
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

    public void drawTurnInformation(Graphics g){
        int t = this.getTurn();
        if(t == 0){
            g.setColor(Color.RED);
            g.fillRect(0,600,600,60);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial",Font.BOLD,24));
            g.drawString("Voleur's Turn",230,640);
        }else{
            g.setColor(Color.BLUE);
            g.fillRect(0,600,600,60);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial",Font.BOLD,24));
            g.drawString("Police's Turn",230,640);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        int w = this.getWidth(), h = this.getHeight() - 100;
        final int W_MAGIC_CONSTANT = (int)((w*100)/600);
        final int H_MAGIC_CONSTANT = (int)((h*100)/600);
        final int PH_MAGIC_CONSTANT = (int)((h * 80)/600);
        final int PW_MAGIC_CONSTANT = (int)((w * -20)/600);
        final int PADDING  = 10;
        //this.drawCroquis(g, h, w,PADDING);
        this.drawTurnInformation(g);
        g.setColor(Color.BLACK);
        g.drawOval(this.getX() + PADDING, this.getY() + PADDING, this.getWidth() - PADDING * 2, (this.getHeight() - 100) - PADDING * 2);
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
        repaint();
    }
}
