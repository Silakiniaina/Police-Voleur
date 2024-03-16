package display;

import javax.swing.JPanel;

import components.Mobile;
import graphe.Sommet;

public class Terrain extends JPanel{
    Sommet[] listSommet; 
    Mobile[] listMobile;

    
    public Sommet[] getListSommet() {
        return listSommet;
    }
    public void setListSommet(Sommet[] listSommet) {
        this.listSommet = listSommet;
    }
    public Mobile[] getListMobile() {
        return listMobile;
    }
    public void setListMobile(Mobile[] listMobile) {
        this.listMobile = listMobile;
    }
}
