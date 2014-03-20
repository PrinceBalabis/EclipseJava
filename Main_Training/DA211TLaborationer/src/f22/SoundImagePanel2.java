package f22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // ActionListener, MouseListener
import java.net.*;       // URL, MalformedURLException
import java.applet.*;    // AudioClip

public class SoundImagePanel2 extends JPanel implements ActionListener {
    private JButton btnChange = new JButton("Byt bild");
    private JLabel lblImage = new JLabel();
    private AudioClip clip;
    private ImageIcon image1;
    private ImageIcon image2;
    private SoundImageApplet applet;                      // Lägg till instansvariabel

    public SoundImagePanel2(SoundImageApplet applet) {    // Lägg till parameter
        this.applet = applet;                             // Lagra referensen till applet-klassen
//        this.setPreferredSize(new Dimension(350, 280)); // Påverkar ej appletens storlek
        this.setLayout(new BorderLayout());

        readImagesAndSound();
        lblImage.setIcon(image1);
        lblImage.setHorizontalAlignment(JLabel.CENTER);
        btnChange.addActionListener(this);
        this.add(new JScrollPane(lblImage), BorderLayout.CENTER);
        this.add(btnChange, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private void readImagesAndSound() { // Ändra metod för inläsning av bilder
        image1 = applet.getImageIcon("bilder/Orkanen.jpg"); // Eclipse: I bin-katalogen i projektet
        image2 = applet.getImageIcon("bilder/Stationen.jpg");
        clip = applet.getAudioClip("/ljud/chimes.wav");
    }

    public void actionPerformed(ActionEvent e) {
        clip.play();
        if (lblImage.getIcon() == image1) {
            lblImage.setIcon(image2);
        } else {
            lblImage.setIcon(image1);
        }
    }
} 
