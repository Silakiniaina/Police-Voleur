package listener;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import components.Mobile;
import display.Terrain;
import graphe.Sommet;

public class Ecoute implements MouseListener {
    Terrain terrain;
    Mobile choosen;
    
    public Ecoute(Terrain t) {
        t.setEcoute(this);
        this.setTerrain(t);
        for (int i = 0; i < this.getTerrain().getListSommet().length; i++) {
            Sommet s = this.getTerrain().getListSommet()[i];
            s.addMouseListener(this);
        }
        for(int i=0; i < this.getTerrain().getListMobile().length; i++){
            Mobile m = this.getTerrain().getListMobile()[i];
            m.addMouseListener(this);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Component c = (Component)e.getSource();
            if(c instanceof Sommet){
                Sommet s = (Sommet)c;
                if (s.isInChoice()){
                    if(this.getChoosen() != null)
                        this.getChoosen().move(s);
                    else
                        this.getTerrain().getVoleur().move(s);
                }else
                    System.out.println("Sommet not in choice");
            }else if(c instanceof Mobile){
                Mobile m = (Mobile)c;
                this.setChoosen(m);
                this.getTerrain().showChoice();
                Vector<Sommet> ls = m.getSommet().getPossibilities();
                for(int i=0; i<ls.size(); i++){
                    Sommet s = ls.get(i);
                    s.setInChoice(true);
                }
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
    
    public Mobile getChoosen() {
        return choosen;
    }

    public void setChoosen(Mobile choosen) {
        this.choosen = choosen;
    }
}
