package graphe;

import java.awt.Point;

import display.Terrain;
public class Sommet {
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
}
