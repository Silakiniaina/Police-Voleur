package display;

import java.awt.Color;

import javax.swing.JFrame;

public class Display extends JFrame{
    Terrain terrain;

    public void initComponent(){
        this.setTitle("Police Voleur");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(Color.WHITE);
    }
}