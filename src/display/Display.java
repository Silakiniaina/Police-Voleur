package display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JFrame{
    Terrain terrain;
    JPanel information;
    
    public Display(){
        this.initComponent();
    }

    public Display(Terrain t,HashMap<String,String> p){
        this.initComponent();
        this.setTerrain(t);
        this.setInformation(p);
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.getContentPane().add(terrain);
        this.terrain = terrain;
    }

    public JPanel getInformation() {
        return information;
    }

    public void setInformation(HashMap<String,String> map) {
        JPanel p = new JPanel();
        p.setBounds(0,600,610,60);
        p.setLayout(new BorderLayout());

        JLabel player1 = new JLabel(map.get("p1"));
        player1.setOpaque(true);
        player1.setHorizontalAlignment(JLabel.CENTER);
        player1.setFont(new Font("Arial", Font.BOLD, 18));
        player1.setPreferredSize(new Dimension(200,50));
        player1.setBackground(Color.BLUE);

        JLabel vs = new JLabel("VS");
        vs.setOpaque(true);
        vs.setHorizontalAlignment(JLabel.CENTER);
        vs.setFont(new Font("Arial", Font.BOLD,24));
        vs.setPreferredSize(new Dimension(200,50));
        vs.setBackground(Color.GRAY);

        JLabel player2 = new JLabel(map.get("p2"));
        player2.setOpaque(true);
        player2.setHorizontalAlignment(JLabel.CENTER);
        player2.setFont(new Font("Arial", Font.BOLD, 18));
        player2.setPreferredSize(new Dimension(200,50));
        player2.setBackground(Color.RED);

        p.add(player1,BorderLayout.WEST);
        p.add(vs,BorderLayout.CENTER);
        p.add(player2,BorderLayout.EAST);
        p.setBackground(Color.GRAY);
        this.getContentPane().add(p);
        this.information = p;
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
