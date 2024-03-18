package components;

import java.awt.Color;
import java.awt.Graphics;

public class Police extends Mobile {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect((int)this.getSommet().getPosition().getX(), (int)this.getSommet().getPosition().getY(), 50, 50);  
    }
    
}
