package graphe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import components.Mobile;
import display.Terrain;
public class Sommet extends JPanel {
    Sommet[] voisins;
    Point position;
    Terrain terrain;

    
    public Sommet() {}

    public Sommet(Point position){
        this.setPosition(position);
    }

    public Sommet(Sommet[] voisin, Point position){
        this.setVoisins(voisin);
        this.setPosition(position);
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
    }
}
