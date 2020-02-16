import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.Math.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.lang.Math.*;

public class Display extends JComponent{
    Game game;
    Mouse mouse;
    Keyboard kb;
    Color[][] prec;
    
    
    public Display(Game g, Mouse m, Keyboard k) {
        game = g;
        mouse = m;
        kb = k;
        prec = new Color[6][60];
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < 60 ; j++) {
                prec[i][j] = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            }
        }
    }
    
    
    
    public void draw(){
        super.repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        ThreeDShape tr = new ThreeDShape();
        
        for (int i = 0 ; i < 720 ; i += 120) {
            for (int j = 0 ; j < 7200 ; j += 120) {
                tr.drawShape(g, new int[][]{{i, j, 720}, {i + 120, j, 720}, {i + 120, j + 120, 720}, {i, j + 120, 720}}, prec[i/120][j/120]);            
            }
        }
    }
}