package graphe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JPanel;

import components.Mobile;
import display.Terrain;
import listener.SommetListener;
public class Sommet extends JPanel {
    Sommet[] voisins;
    Point position;
    Terrain terrain;
    boolean isInChoice;
    
    
    public Sommet() {}

    public Sommet(Point position){
        this.setPosition(position);
        this.addMouseListener(new SommetListener(this));
    }
    
    public Sommet(Sommet[] voisin, Point position){
        this.setVoisins(voisin);
        this.setPosition(position);
        this.setBounds((int)this.getPosition().getX(), (int)this.getPosition().getY(), 10, 10);
        this.addMouseListener(new SommetListener(this));
    }
    
    public boolean isInChoice() {
        return isInChoice;
    }

    public void setInChoice(boolean isInChoice) {
        this.isInChoice = isInChoice;
    }
    public boolean isTaken(){
        boolean result = false; 
        Mobile[] ls = this.getTerrain().getListMobile();
        for(int i=0; i<ls.length; i++){
            if(ls[i].getSommet() == this){
                result = true; 
                break;
            }
        }
        return result;
    }

    public Vector<Sommet> getPossibilities(){
        Vector<Sommet> result = new Vector<Sommet>();
        for(int i=0; i<this.getVoisins().length; i++){
            if(!this.getVoisins()[i].isTaken()){
                result.add(this.getVoisins()[i]);
            }
        }
        return result;
    }

    public Sommet[] getVoisins() {
        return voisins;
    }
    public void setVoisins(Sommet[] voisins) {
        this.voisins = voisins;
    }
    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }

    public Terrain getTerrain() {
        return terrain;
    }
    
    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect((int)this.getPosition().getX(), (int)this.getPosition().getY(), 10, 10);
        if(this.isInChoice()){
            g.setColor(Color.YELLOW);
            g.drawRect((int)this.getPosition().getX() - 2, (int)this.getPosition().getY() - 2 , 13, 13);
        }
    }
}
