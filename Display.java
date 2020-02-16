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
        
        ThreeDShape tr = new ThreeDShape();
        
        tr.drawShape(g, new int[][]{{260, 200, 600}, {260, 400, 600}, {460, 400, 600}, {460, 200, 600}}, new Color(0, 0, 255));
        
    }
}