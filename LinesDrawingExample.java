//package net.codejava.graphics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BasicStroke;
import java.awt.Color;
/**
 * This program demonstrates how to draw lines using Graphics2D object.
 * @author www.codejava.net
 *
 */
public class LinesDrawingExample extends JFrame {
    public LinesDrawingExample() {
        super("Lines Drawing Demo");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        BasicStroke stroke = new BasicStroke(10f);
        Color waterColor = new Color(3, 202, 252);   
        Color sandColor = new Color(255, 216, 89);
        g2d.setStroke(stroke);
        g2d.setColor(waterColor);
        g2d.drawLine(20, 50, 20, 50);
        g2d.drawLine(30, 50, 30, 50);
        g2d.drawLine(50, 50, 50, 50);
        //g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
        //g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LinesDrawingExample().setVisible(true);
            }
        });
    }
}