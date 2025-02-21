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
    int x, y, size;
    JLabel slabel = new JLabel("Score: ");
    ArrayList<Integer> partsX = new ArrayList(), partsY = new ArrayList(), foodX = new ArrayList(), foodY = new ArrayList();
    
    
}
