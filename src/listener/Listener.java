package listener;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JOptionPane;

import components.Mobile;
import display.Map;
import graphe.Sommet;

public class Listener implements MouseListener {
    Map terrain;
    Mobile choosen;
    
    public Listener(Map t) {
        t.setEcoute(this);
        this.setMap(t);
        for (int i = 0; i < this.getMap().getListSommet().length; i++) {
            Sommet s = this.getMap().getListSommet()[i];
            s.addMouseListener(this);
        }
        for(int i=0; i < this.getMap().getListMobile().length; i++){
            Mobile m = this.getMap().getListMobile()[i];
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
                    if(this.getChoosen() != null && this.getChoosen().canMove()){
                        this.getChoosen().move(s);
                        this.getMap().switchTurn();
                    }else{
                        System.out.println("It is not your turn");
                    }
                }else
                    System.out.println("Sommet not in choice");
                if(this.getMap().isGameOver()){
                    StringBuilder message = new StringBuilder();
                    message.append("Game is Over, ");
                    message.append(this.getMap().getWinner());
                    message.append(" WIN");
                    JOptionPane.showMessageDialog(null, message.toString());
                }
            }else if(c instanceof Mobile){
                Mobile m = (Mobile)c;
                this.setChoosen(m);
                this.getMap().showChoice();
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

    public Map getMap() {
        return terrain;
    }

    public void setMap(Map terrain) {
        this.terrain = terrain;
    }
    
    public Mobile getChoosen() {
        return choosen;
    }

    public void setChoosen(Mobile choosen) {
        this.choosen = choosen;
    }
}
