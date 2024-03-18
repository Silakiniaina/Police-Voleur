package test;

import java.awt.Point;

import components.Mobile;
import components.Police;
import components.Voleur;
import display.Display;
import display.Terrain;
import graphe.Sommet;

public class Test {
    public static void main(String[] args) {
        // List sommet
        Point p1 = new Point(195, 10);
        Point p2 = new Point(295, 0);
        Point p3 = new Point(395, 15);
        Point p4 = new Point(555, 165);
        Point p5 = new Point(577, 265);
        Point p6 = new Point(563, 365);
        Point p7 = new Point(395, 535);
        Point p8 = new Point(295, 555);
        Point p9 = new Point(195, 540);
        Point p10 = new Point(10, 365);
        Point p11 = new Point(0, 265);
        Point p12 = new Point(20, 165);
        Point p13 = new Point(295, 57);
        Point p14 = new Point(517, 265);
        Point p15 = new Point(295, 497);
        Point p16 = new Point(60, 265);
        Point p17 = new Point(195, 265);
        Point p18 = new Point(295, 165);
        Point p19 = new Point(395, 265);
        Point p20 = new Point(295, 365);
        Point p21 = new Point(295, 265);

        Sommet s1 = new Sommet(p1, 1);
        Sommet s2 = new Sommet(p2, 2);
        Sommet s3 = new Sommet(p3, 3);
        Sommet s4 = new Sommet(p4, 4);
        Sommet s5 = new Sommet(p5, 5);
        Sommet s6 = new Sommet(p6, 6);
        Sommet s7 = new Sommet(p7, 7);
        Sommet s8 = new Sommet(p8, 8);
        Sommet s9 = new Sommet(p9, 9);
        Sommet s10 = new Sommet(p10, 10);
        Sommet s11 = new Sommet(p11, 11);
        Sommet s12 = new Sommet(p12, 12);
        Sommet s13 = new Sommet(p13, 13);
        Sommet s14 = new Sommet(p14, 14);
        Sommet s15 = new Sommet(p15, 15);
        Sommet s16 = new Sommet(p16, 16);
        Sommet s17 = new Sommet(p17, 17);
        Sommet s18 = new Sommet(p18, 18);
        Sommet s19 = new Sommet(p19, 19);
        Sommet s20 = new Sommet(p20, 20);
        Sommet s21 = new Sommet(p21, 21);

        // Voisin
        Sommet[] voisin21 = { s17, s18, s19, s20 };
        s21.setVoisins(voisin21);
        Sommet[] voisin20 = { s15, s17, s21, s20 };
        s20.setVoisins(voisin20);
        Sommet[] voisin19 = { s14, s20, s21, s18 };
        s19.setVoisins(voisin19);
        Sommet[] voisin18 = { s13, s17, s21, s19 };
        s18.setVoisins(voisin18);
        Sommet[] voisin17 = { s16, s18, s21, s20 };
        s17.setVoisins(voisin17);
        Sommet[] voisin16 = { s12, s11, s10, s17 };
        s16.setVoisins(voisin16);
        Sommet[] voisin15 = { s9, s8, s7, s20 };
        s15.setVoisins(voisin15);
        Sommet[] voisin14 = { s4, s5, s6, s19 };
        s14.setVoisins(voisin14);
        Sommet[] voisin13 = { s1, s2, s3, s18 };
        s13.setVoisins(voisin13);
        Sommet[] voisin12 = { s1, s16, s11 };
        s12.setVoisins(voisin12);
        Sommet[] voisin11 = { s12, s16, s10 };
        s11.setVoisins(voisin11);
        Sommet[] voisin10 = { s11, s16, s9 };
        s10.setVoisins(voisin10);
        Sommet[] voisin9 = { s10, s15, s8 };
        s9.setVoisins(voisin9);
        Sommet[] voisin8 = { s9, s15, s7 };
        s8.setVoisins(voisin8);
        Sommet[] voisin7 = { s8, s15, s6 };
        s7.setVoisins(voisin7);
        Sommet[] voisin6 = { s7, s14, s5 };
        s6.setVoisins(voisin6);
        Sommet[] voisin5 = { s6, s14, s4 };
        s5.setVoisins(voisin5);
        Sommet[] voisin4 = { s14, s5, s3 };
        s4.setVoisins(voisin4);
        Sommet[] voisin3 = { s4, s13, s2 };
        s3.setVoisins(voisin3);
        Sommet[] voisin2 = { s3, s13, s1 };
        s2.setVoisins(voisin2);
        Sommet[] voisin1 = { s2, s13, s12 };
        s1.setVoisins(voisin1);

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
