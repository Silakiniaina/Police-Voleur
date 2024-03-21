package display;

import java.awt.Color;

import javax.swing.JFrame;

public class Display extends JFrame{
    Terrain terrain;

    public Display(){
        this.initComponent();
    }

    public Display(Terrain t){
        this.initComponent();
        this.setTerrain(t);
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.getContentPane().add(terrain);
        this.terrain = terrain;
    }

    public void initComponent(){
        this.setTitle("Police Voleur");
        this.setSize(1000,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        // this.setResizable(false);
        this.setBackground(Color.WHITE);
    }
}
