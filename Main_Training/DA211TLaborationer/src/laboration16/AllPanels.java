package laboration16;

import javax.swing.*;
import java.awt.*;

public class AllPanels extends JPanel{
	
	public AllPanels(){
	setPreferredSize(new Dimension(600, 500));
	
	CalcPanel caP = new CalcPanel();
	FCConverterPanel fCCP = new FCConverterPanel();
	ColorPanel coP = new ColorPanel();
	TransportPanel tP = new TransportPanel();
	
	add(caP);
	add(fCCP);
	add(coP);
	add(tP);
	}
}
