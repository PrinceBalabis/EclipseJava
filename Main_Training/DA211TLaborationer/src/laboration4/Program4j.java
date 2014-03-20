package laboration4;
import java.awt.*;
import javax.swing.*;

/* Program 4j1
 *  private Line leftEye = new Line(50,70,70,100,Color.magenta);
 *	private Line rightEye = new Line(100,100,120,70,Color.magenta);
 *  private Line mouth  = new Line(70,130,100,130,Color.red);
 *  
 * Program 4j2
 *  private Line leftEye = new Line(50,100,70,70,Color.black);
 *  private Line rightEye = new Line(100,70,120,100,Color.black);
 *  private Line nose  = new Line(85,100,85,120,Color.black);
 *  private Line mouth  = new Line(70,130,100,130,Color.white);
 *  private Ellipse head = new Ellipse(85,100,60,60,Color.red);
 *  
 * Program 4j3
 * private Ellipse head = new Ellipse(85,100,60,140,Color.orange);
 */

public class Program4j extends JLabel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Head h = new Head();

    public Program4j(Color color) {
        setBackground(color);
        setOpaque(true);
        setPreferredSize(new Dimension(170,200));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        h.show(g);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Head");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Program4j(Color.yellow));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}

class Head {
    private Line leftEye = new Line(50,100,70,70,Color.magenta);
    private Line rightEye = new Line(100,70,120,100,Color.magenta);
    private Line nose  = new Line(85,100,85,120,Color.black);
    private Line mouth  = new Line(70,130,100,130,Color.red);
    //private Ellipse head = new Ellipse(85,100,60,60,Color.orange);
    private Ellipse head = new Ellipse(85,100,60,140,Color.orange);

    
    public Head() {}

    public void show(Graphics g) {
        head.show(g);
        leftEye.show(g);
        rightEye.show(g);
        nose.show(g);
        mouth.show(g);
    }
}

class Line {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public Line(int x1,int y1,int x2,int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public void show(Graphics g) {
        g.setColor(color);
        g.drawLine(x1,y1,x2,y2);
    }
}

class Ellipse {
    private int x;
    private int y;
    private int xRadius;
    private int yRadius;
    private Color color;

    public Ellipse(int x,int y,int xRadius,int yRadius,Color color) {
        this.x = x;
        this.y = y;
        this.xRadius = xRadius;
        this.yRadius = yRadius;
        this.color = color;
    }

    public void show(Graphics g) {
        g.setColor(color);
        g.fillOval(x-xRadius,y-yRadius,2*xRadius,2*yRadius);
    }
}
