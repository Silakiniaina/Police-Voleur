package listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import graphe.Sommet;

public class SommetListener implements MouseListener {
    Sommet sommet;
    
    public SommetListener() {}

    public SommetListener(Sommet s){
        this.setSommet(s);
    }

    public Sommet getSommet() {
        return sommet;
    }

    public void setSommet(Sommet sommet) {
        this.sommet = sommet;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            System.out.println("Clicked sommet");
            if(this.getSommet().isInChoice()){
                this.getSommet().getTerrain().getVoleur().move(this.getSommet());
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
