import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ThreeDShape {
    ThreeDPoint[] points;
    Color col;
    
    public ThreeDShape() {
        
    }
    
    public void drawShape(Graphics g, int[][] pts, int tx, int ty, Color c) {
        points = new ThreeDPoint[pts.length];
        for (int i = 0 ; i < pts.length ; i++) {
            points[i] = new ThreeDPoint(pts[i][0] - tx, pts[i][1] - ty, pts[i][2]);
        }
        col = c;
        Polygon poly = new Polygon();
        
        for (int i = 0 ; i < points.length ; i++) {
           poly.addPoint(points[i].convertTo2D()[0], points[i].convertTo2D()[1]);
        }
        
        g.setColor(col);
        g.fillPolygon(poly);
    }
}