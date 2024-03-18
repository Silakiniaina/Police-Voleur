package test;

import java.awt.Point;

import components.Mobile;
import components.Police;
import components.Voleur;
import display.Display;
import display.Terrain;
import graphe.Sommet;
import listener.MobileListener;

public class Test {
    public static void main(String[] args) {
        
        // List sommet
        Point p1 = new Point(195,10);
        Point p2 = new Point(295,0);
        Point p3 = new Point(395,15);
        Point p4 = new Point(555,165);
        Point p5 = new Point(577,265);
        Point p6 = new Point(563,365);
        Point p7 = new Point(395,535);
        Point p8 = new Point(295,555);
        Point p9 = new Point(195,540);
        Point p10 = new Point(10,365);
        Point p11 = new Point(0,265);
        Point p12 = new Point(20,165);
        Point p13 = new Point(295,57);
        Point p14 = new Point(517,265);
        Point p15 = new Point(295,497);
        Point p16 = new Point(60,265);
        Point p17 = new Point(195,265);
        Point p18 = new Point(295,165);
        Point p19 = new Point(395,265);
        Point p20 = new Point(295,365);
        Point p21 = new Point(295,265);

        
        Sommet s1 = new Sommet(p1);
        Sommet s2 = new Sommet(p2);
        Sommet s3 = new Sommet(p3);
        Sommet s4 = new Sommet(p4);
        Sommet s5 = new Sommet(p5);
        Sommet s6 = new Sommet(p6);
        Sommet s7 = new Sommet(p7);
        Sommet s8 = new Sommet(p8);
        Sommet s9 = new Sommet(p9);
        Sommet s10 = new Sommet(p10);
        Sommet s11 = new Sommet(p11);
        Sommet s12 = new Sommet(p12);
        Sommet s13 = new Sommet(p13);
        Sommet s14 = new Sommet(p14);
        Sommet s15 = new Sommet(p15);
        Sommet s16 = new Sommet(p16);
        Sommet s17 = new Sommet(p17);
        Sommet s18 = new Sommet(p18);
        Sommet s19 = new Sommet(p19);
        Sommet s20 = new Sommet(p20);
        Sommet s21 = new Sommet(p21);

        // Voisin
        Sommet[] voisin21 = new Sommet[4];
        voisin21[0] = s17;
        voisin21[1] = s18;
        voisin21[2] = s19;
        voisin21[3] = s20; 
        s21.setVoisins(voisin21);

        Sommet[] voisin20 = new Sommet[4];
        voisin21[0] = s15;
        voisin21[1] = s17;
        voisin21[2] = s19;
        voisin21[3] = s21; 
        s20.setVoisins(voisin20);

        Sommet[] voisin19 = new Sommet[4];
        voisin21[0] = s14;
        voisin21[1] = s20;
        voisin21[2] = s21;
        voisin21[3] = s18; 
        s19.setVoisins(voisin19);

        Sommet[] voisin18 = new Sommet[4];
        voisin21[0] = s13;
        voisin21[1] = s21;
        voisin21[2] = s19;
        voisin21[3] = s17; 
        s18.setVoisins(voisin18);

        Sommet[] voisin17 = new Sommet[4];
        voisin21[0] = s16;
        voisin21[1] = s21;
        voisin21[2] = s18;
        voisin21[3] = s20; 
        s17.setVoisins(voisin17);

        Sommet[] voisin16 = new Sommet[4];
        voisin21[0] = s17;
        voisin21[1] = s10;
        voisin21[2] = s11;
        voisin21[3] = s12; 
        s16.setVoisins(voisin16);


        
        Sommet[] listSommet = new Sommet[21];
        listSommet[0] = s1;
        listSommet[1] = s2;
        listSommet[2] = s3;
        listSommet[3] = s4;
        listSommet[4] = s5;
        listSommet[5] = s6;
        listSommet[6] = s7;
        listSommet[7] = s8;
        listSommet[8] = s9;
        listSommet[9] = s10;
        listSommet[10] = s11;
        listSommet[11] = s12;
        listSommet[12] = s13;
        listSommet[13] = s14;
        listSommet[14] = s15;
        listSommet[15] = s16;
        listSommet[16] = s17;
        listSommet[17] = s18;
        listSommet[18] = s19;
        listSommet[19] = s20;
        listSommet[20] = s21;
        
        // Mobile
        Police police1 = new Police(s20);
        Police police2 = new Police(s18);
        Police police3 = new Police(s19);
        Voleur voleur1 = new Voleur(s21);
        
        Mobile[] listMobile = new Mobile[4];
        listMobile[0] = police1;
        listMobile[1] = police2;
        listMobile[2] = police3;
        listMobile[3] = voleur1;
        // Terrain
        
        Terrain t = new Terrain(listSommet, listMobile);
        
        // Display
        Display d = new Display(t);
        d.setVisible(true);

    }
}
