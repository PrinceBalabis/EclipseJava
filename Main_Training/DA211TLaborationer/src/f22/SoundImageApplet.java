package f22;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*; // ActionListener, MouseListener
import java.net.*;       // URL, MalformedURLException
import java.applet.*;    // AudioClip

public class SoundImageApplet extends JApplet  {

    private void constructGUI() {
        this.setSize(350,270);
        this.add(new SoundImagePanel2(this)); // parameter till aktuellt JApplet-objekt som parameter
    }

    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    constructGUI();
                }
            });
        } catch (Exception e) {
        }
    }

    public ImageIcon getImageIcon(String path) {
        ImageIcon newIcon = null;
        try {
            newIcon = new ImageIcon(new URL(this.getCodeBase().toString() + path));
        } catch (MalformedURLException e) {
        }
        return newIcon;
    }

    public AudioClip getAudioClip(String path) {
        AudioClip newClip = null;
        try {
            newClip = getAudioClip(new URL(this.getCodeBase().toString() + path));
        } catch (MalformedURLException e) {
        }
        return newClip;
    }
}
