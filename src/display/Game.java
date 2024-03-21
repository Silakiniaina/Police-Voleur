package display;

import java.awt.Color;
import javax.swing.JFrame;

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
