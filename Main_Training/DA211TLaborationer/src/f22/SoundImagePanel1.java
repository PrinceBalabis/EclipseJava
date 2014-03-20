package f22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // ActionListener, MouseListener
import java.net.*;       // URL, MalformedURLException
import java.applet.*;    // AudioClip

public class SoundImagePanel1 extends JPanel implements ActionListener {
    private JButton btnChange = new JButton("Byt bild");
    private JLabel lblImage = new JLabel();
    private AudioClip clip;
    private ImageIcon image1;
    private ImageIcon image2;

    public SoundImagePanel1() {
        this.setPreferredSize(new Dimension(350, 280));
        this.setLayout(new BorderLayout());

        readImagesAndSound();
        lblImage.setIcon(image1);
        lblImage.setHorizontalAlignment(JLabel.CENTER);
        btnChange.addActionListener(this);
        this.add(new JScrollPane(lblImage), BorderLayout.CENTER);
        this.add(btnChange, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private void readImagesAndSound() {
        image1 = new ImageIcon("C:/bilder/Orkanen.jpg");
        image2 = new ImageIcon("C:/bilder/Stationen.jpg");
        try {
            clip = JApplet.newAudioClip(new URL("file:/C:/ljud/chimes.wav"));
        } catch (MalformedURLException e) {}
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
