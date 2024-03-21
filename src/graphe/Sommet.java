package graphe;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

import components.Mobile;
import display.Map;

public class Sommet extends JPanel {
    Sommet[] voisins;
    int id;
    Map terrain;
    boolean isInChoice;

    public Sommet() {
    }

    public Sommet(int id) {
        this.setId(id);
    }

    public boolean isInChoice() {
        return isInChoice;
    }

    public void setInChoice(boolean isInChoice) {
        this.isInChoice = isInChoice;
    }

    public boolean isTaken() {
        boolean result = false;
        Mobile[] ls = this.getMap().getListMobile();
        for (int i = 0; i < ls.length; i++) {
            if (ls[i].getSommet() == this) {
                result = true;
                break;
            }
        }
        return result;
    }

    public Vector<Sommet> getPossibilities() {
        Vector<Sommet> result = new Vector<Sommet>();
        for (int i = 0; i < this.getVoisins().length; i++) {
            if (!this.getVoisins()[i].isTaken()) {
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

    public Map getMap() {
        return terrain;
    }

    public void setMap(Map terrain) {
        this.terrain = terrain;
        this.place(terrain);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void draw(Graphics g) {
        if (this.isTaken())
            this.setVisible(false);
        else {
            this.setVisible(true);
            if (this.isInChoice()) {
                g.setColor(Color.BLUE);
                g.drawOval((int) this.getX(), (int) this.getY(), 15, 15);
            }
        }
        // g.setColor(Color.BLUE);
        // g.drawString(String.valueOf(this.getId()), this.getX(), this.getY());
    }

    public static Sommet[] getListSommet() {
        Sommet[] result = new Sommet[21];
        int index = 0;
        for (int i = 1; i < 22; i++) {
            result[index] = new Sommet(i);
            index += 1;
        }

        // Voisin
        Sommet[] voisin21 = { result[16], result[17], result[18], result[19] };
        result[20].setVoisins(voisin21);
        Sommet[] voisin20 = { result[14], result[16], result[20], result[18] };
        result[19].setVoisins(voisin20);
        Sommet[] voisin19 = { result[13], result[19], result[20], result[17] };
        result[18].setVoisins(voisin19);
        Sommet[] voisin18 = { result[12], result[16], result[20], result[18] };
        result[17].setVoisins(voisin18);
        Sommet[] voisin17 = { result[15], result[17], result[20], result[19] };
        result[16].setVoisins(voisin17);
        Sommet[] voisin16 = { result[11], result[10], result[9], result[16] };
        result[15].setVoisins(voisin16);
        Sommet[] voisin15 = { result[8], result[7], result[6], result[19] };
        result[14].setVoisins(voisin15);
        Sommet[] voisin14 = { result[3], result[4], result[5], result[18] };
        result[13].setVoisins(voisin14);
        Sommet[] voisin13 = { result[0], result[1], result[2], result[17] };
        result[12].setVoisins(voisin13);
        Sommet[] voisin12 = { result[0], result[15], result[10] };
        result[11].setVoisins(voisin12);
        Sommet[] voisin11 = { result[11], result[15], result[9] };
        result[10].setVoisins(voisin11);
        Sommet[] voisin10 = { result[10], result[15], result[8] };
        result[9].setVoisins(voisin10);
        Sommet[] voisin9 = { result[9], result[14], result[7] };
        result[8].setVoisins(voisin9);
        Sommet[] voisin8 = { result[8], result[14], result[6] };
        result[7].setVoisins(voisin8);
        Sommet[] voisin7 = { result[7], result[14], result[5] };
        result[6].setVoisins(voisin7);
        Sommet[] voisin6 = { result[6], result[13], result[4] };
        result[5].setVoisins(voisin6);
        Sommet[] voisin5 = { result[5], result[13], result[3] };
        result[4].setVoisins(voisin5);
        Sommet[] voisin4 = { result[13], result[4], result[2] };
        result[3].setVoisins(voisin4);
        Sommet[] voisin3 = { result[3], result[12], result[1] };
        result[2].setVoisins(voisin3);
        Sommet[] voisin2 = { result[2], result[12], result[0] };
        result[1].setVoisins(voisin2);
        Sommet[] voisin1 = { result[1], result[12], result[11] };
        result[0].setVoisins(voisin1);

        return result;
    }

    public void place(Map t) {
        int w = t.getWidth(), h = t.getHeight(), p = 10;
        int x = 0, y = 0;
        switch (this.getId()) {
            case 1:
                x = (int) ((w / 2) - 105);
                y = p * 3 - 5;
                break;
            case 2:
                x = (int) ((w / 2) - 5);
                y = p - 5;
                break;
            case 3:
                x = (int) ((w / 2) + 95);
                y = p * 3 - 5;
                break;
            case 4:
                x = w - p * 3 - 5;
                y = (int) (h / 2 - 105);
                break;
            case 5:
                x = w - p - 5;
                y = (int) (h / 2 - 5);
                break;
            case 6:
                x = w - p * 3 - 5;
                y = (int) (h / 2 + 95);
                break;
            case 7:
                x = (int) ((w / 2) + 95);
                y = h - p * 3 - 5;
                break;
            case 8:
                x = (int) ((w / 2) - 5);
                y = h - p - 5;
                break;
            case 9:
                x = (int) ((w / 2) - 105);
                y = h - p * 3 - 5;
                break;
            case 10:
                x = p * 3 - 5;
                y = (int) (h / 2 + 95);
                break;
            case 11:
                x = p - 5;
                y = (int) (h / 2 - 5);
                break;
            case 12:
                x = p * 3 - 5;
                y = (int) (h / 2 - 105);
                break;
            case 13:
                x = (int) ((w / 2) - 5);
                y = p + 65;
                break;
            case 14:
                x = w - (p + 75);
                y = (int) h / 2 - 5;
                break;
            case 15:
                x = (int) ((w / 2) - 5);
                y = h - (p + 75);
                break;
            case 16:
                x = p + 65;
                y = (int) h / 2 - 5;
                break;
            case 17:
                x = p + 185;
                y = (int) h / 2 - 5;
                break;
            case 18:
                x = (int) ((w / 2) - 5);
                y = p + 185;
                break;
            case 19:
                x = w - (p + 195);
                y = (int) h / 2 - 5;
                break;
            case 20:
                x = (int) ((w / 2) - 5);
                y = h - (p + 200);
                break;
            case 21:
                x = (int) w / 2 - 5;
                y = (int) h / 2 - 5;
                break;
        }
        this.setBounds(x, y, 10, 10);
    }
}
