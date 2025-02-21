import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class SnacheDisplay extends JPanel implements ActionListener, KeyListener{
    int timer = 0;
    Graphics2D g2;
    Timer refreshRate = new Timer(2, this);
    boolean right, left, up, down;
    int x, y, size=1, velX, velY;
    JLabel sLabel = new JLabel("Score: ");
    ArrayList<Integer> partsX = new ArrayList(), partsY = new ArrayList(), foodX = new ArrayList(), foodY = new ArrayList();
    
    public SnacheDisplay(JFrame j){
        refreshRate.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        sLabel.setAlignmentX(0);
        sLabel.setAlignmentY(0);
        add(sLabel);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
    }
    public void right(){
        velX=7;
        if(x<1575){
            x+=velX;
        }
    }
    public void left(){
        velX=-7;
        if(x>0){
            x+=velX;
        }
    }
    public void up(){
        velY=-7;
        if(y>0){
            y+=velY;
        }
    }
    public void down(){
        velY=7;
        if(y<865){
            y+=velY;
        }
    }
}
