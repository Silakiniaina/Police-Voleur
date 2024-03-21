package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame{
    Map terrain;

    
    public Game(){
        this.initComponent();
    }

    public Game(Map t){
        this.initComponent();
        this.setMap(t);
    }

    public Map getMap() {
        return terrain;
    }

    public void setMap(Map terrain) {
        this.getContentPane().add(terrain);
        this.terrain = terrain;
    }
    
    public void initComponent(){
        this.setTitle("Police Voleur");
        this.setSize(620,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        // this.setResizable(false);
        this.setBackground(Color.WHITE);
    }
}
