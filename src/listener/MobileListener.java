package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import components.Mobile;
import display.Terrain;
import graphe.Sommet;

public class MobileListener implements MouseListener {
    Mobile mobile;
    Terrain terrain;

    public MobileListener(){}

    public MobileListener(Mobile m){
        this.setMobile(m);
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Voleur clicked");
       if(e.getButton() == MouseEvent.BUTTON1){
            Vector<Sommet> ls = this.getMobile().getSommet().getPossibilities();
            for(int i=0; i<ls.size(); i++){
                Sommet s = ls.get(i);
                s.setInChoice(true);
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
    
}
