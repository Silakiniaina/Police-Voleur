package graphe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JPanel;

import components.Mobile;
import display.Terrain;
public class Sommet extends JPanel {
    Sommet[] voisins;
    int id;
    Terrain terrain;
    boolean isInChoice;
    
    public Sommet() { }

    public Sommet(int id){
        this.setId(id);
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

    public Sommet[] getVoisins(){
        return voisins;
    }
    public void setVoisins(Sommet[] voisins) {
        this.voisins = voisins;
    }

    public Terrain getTerrain() {
        return terrain;
    }
    
    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
        this.place(terrain);
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void draw(Graphics g){
        if(this.isTaken())this.setVisible(false);
        else{
            this.setVisible(true);
            if(this.isInChoice()){
                g.setColor(Color.GREEN);
                g.fillOval((int)this.getX(), (int)this.getY(), 15, 15);
            }
        }
        // g.setColor(Color.BLUE);
        // g.drawString(String.valueOf(this.getId()), this.getX(), this.getY());
    }

    public void place(Terrain t){
        int w = t.getWidth(), h = t.getHeight(), p = 10;
        int x = 0, y = 0;
        switch(this.getId()){
            case 1:
                x = (int)((w/2)-105); y = p*3 - 5;
                break;
            case 2:
                x = (int)((w/2) - 5); y = p - 5;
                break;
            case 3:
                x = (int)((w/2) + 95); y = p*3 - 5;
                break;
            case 4:
                x = w - p * 3 - 5; y = (int)(h/2 - 105);
                break;
            case 5:
                x = w - p - 5; y = (int)(h/2 - 5);
                break;
            case 6:
                x = w - p * 3 - 5; y = (int)(h/2 + 95);
                break;
            case 7:
                x = (int)((w/2) + 95); y = h - p*3 - 5;
                break;
            case 8:
                x = (int)((w/2) - 5); y = h - p - 5;
                break;
            case 9:
                x = (int)((w/2) - 105); y = h - p*3 - 5;
                break;
            case 10:
                x = p * 3 - 5; y = (int)(h/2 + 95);
                break;
            case 11:
                x = p - 5; y = (int)(h/2 - 5);
                break;
            case 12:
                x = p * 3 - 5; y = (int)(h/2 - 105);
                break;
            case 13:
                x = (int)((w/2) - 5); y = p + 65;
                break;
            case 14:
                x = w - (p + 75); y = (int)h/2 - 5;
                break;
            case 15:
                x = (int)((w/2) - 5); y =  h - (p + 75);
                break;
            case 16:
                x = p + 65 ; y = (int)h/2 - 5;
                break;
            case 17: 
                x = p + 190; y = (int)h/2 - 5;
                break;
            case 18:
                x = (int)((w/2) - 5); y = p + 190;  
                break;
            case 19: 
                x = w - (p + 195); y = (int)h/2 - 5;
                break;
            case 20: 
                x = (int)((w/2) - 5); y = h - (p + 200);  
                break; 
            case 21:
                x = (int)w/2 - 5; y =  (int)h/2 - 5;
                break;
        }
        this.setBounds(x,y,10,10);
    }
}
