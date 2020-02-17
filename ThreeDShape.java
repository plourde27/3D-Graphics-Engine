import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ThreeDShape {
    ThreeDPoint[] points;
    Color col;
    
    public ThreeDShape() {
        
    }
    
    public void drawShape(Graphics g, int[][] pts, int tx, int ty, int ang, Color c) {
        points = new ThreeDPoint[pts.length];
        for (int i = 0 ; i < pts.length ; i++) {
            points[i] = new ThreeDPoint(rot(pts[i][0] - tx, pts[i][1] - ty, ang)[0], rot(pts[i][0] - tx, pts[i][1] - ty, ang)[1], pts[i][2]);
        }
        col = c;
        Polygon poly = new Polygon();
        
        for (int i = 0 ; i < points.length ; i++) {
           poly.addPoint(points[i].convertTo2D()[0], points[i].convertTo2D()[1]);
        }
        
        g.setColor(col);
        g.fillPolygon(poly);
    }
    
    public int[] rot(int x, int y, int ang) {
        double dst = Math.sqrt((x - 300) * (x - 300) + (y + 200) * (y + 200));
        double oang = Math.atan(((double) (y - (-200))) / (((double) (x - 300)) + 0.01));
        System.out.println(oang);
        double nang = oang + ang * (Math.PI / 180);
        return new int[]{300 + (int) (Math.cos(nang) * dst), -200 + (int) (Math.sin(nang) * dst)};
    
   
    }
}