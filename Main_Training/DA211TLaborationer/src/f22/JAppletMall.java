package f22;
import java.applet.*; // AudioClip
import java.net.*;    // URL, MalformedURLException
import javax.swing.*; // JApplet, ImageIcon, SwingUtilities

public class JAppletMall extends JApplet {

    private void constructGUI() {
        // setSize( width, height ); // Run in Eclipse
        // add( ClassExtendsJPanel( this ) );
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

    /* ------------- getImageIcon och getAudioClip ---------------- */
    /*
     * Läser bild från server. Bildens lagringsplats ska anges relativt
     * "Codebase", dvs. relativt appletens lagringsplats.
     */
    public ImageIcon getImageIcon(String path) {
        ImageIcon newIcon = null;
        try {
            newIcon = new ImageIcon(new URL(this.getCodeBase().toString() + path));
        } catch (MalformedURLException e) {
        }
        return newIcon;
    }

    /*
     * Läser ljud från server. Ljudets lagringsplats ska anges relativt
     * "Codebase", dvs. relativt appletens lagringsplats.
     */
    public AudioClip getAudioClip(String path) {
        AudioClip newClip = null;
        try {
            newClip = getAudioClip(new URL(this.getCodeBase().toString() + path));
        } catch (MalformedURLException e) {
        }
        return newClip;
    }
}
