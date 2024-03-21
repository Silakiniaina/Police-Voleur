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
        Sommet s1 = new Sommet(1);
        Sommet s2 = new Sommet(2);
        Sommet s3 = new Sommet(3);
        Sommet s4 = new Sommet(4);
        Sommet s5 = new Sommet(5);
        Sommet s6 = new Sommet(6);
        Sommet s7 = new Sommet(7);
        Sommet s8 = new Sommet(8);
        Sommet s9 = new Sommet(9);
        Sommet s10 = new Sommet(10);
        Sommet s11 = new Sommet(11);
        Sommet s12 = new Sommet(12);
        Sommet s13 = new Sommet(13);
        Sommet s14 = new Sommet(14);
        Sommet s15 = new Sommet(15);
        Sommet s16 = new Sommet(16);
        Sommet s17 = new Sommet(17);
        Sommet s18 = new Sommet(18);
        Sommet s19 = new Sommet(19);
        Sommet s20 = new Sommet(20);
        Sommet s21 = new Sommet(21);

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
