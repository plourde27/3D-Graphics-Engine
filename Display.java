import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.Math.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Display extends JComponent{
    Game game;
    Mouse mouse;
    Keyboard kb;
    
    
    public Display(Game g, Mouse m, Keyboard k) {
        game = g;
        mouse = m;
        kb = k;
    }
    
    
    
    public void draw(){
        super.repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Polygon poly = new Polygon();
        
        poly.addPoint(100, 100);
        poly.addPoint(500, 300);
        poly.addPoint(200, 600);
        poly.addPoint(100, 100);
        g.setColor(Color.green);
        g.fillPolygon(poly);
    }
}