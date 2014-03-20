package f22;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ColorPanel extends JPanel implements ChangeListener {
    private JSlider red = new JSlider(0, 255, 128);
    private JSlider green = new JSlider(0, 255, 128);
    private JSlider blue = new JSlider(0, 255, 128);
    private Color color;

    public ColorPanel() {
        setPreferredSize(new Dimension(300, 150));
        setLayout(new GridLayout(3, 1, 20, 20));
        red.setBackground(Color.red);
        green.setBackground(Color.green);
        blue.setBackground(Color.blue);
        red.addChangeListener(this);
        green.addChangeListener(this);
        blue.addChangeListener(this);
        color = new Color(red.getValue(), green.getValue(), blue.getValue());
        setBackground(color);
        add(red);
        add(blue);
        add(green);
    }

    public Color getColor() {
        return color;
    }

    public void stateChanged(ChangeEvent e) {
        color = new Color(red.getValue(), green.getValue(), blue.getValue());
        setBackground(color);
    }

    public static void main(String[] args) {
        ColorPanel panel = new ColorPanel();
        JOptionPane.showMessageDialog(null, panel);
        System.out.println(panel.getColor());
    }
}
