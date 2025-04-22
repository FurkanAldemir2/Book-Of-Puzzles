import java.awt.*;
import javax.swing.*;
public class OptionsMenu extends JPanel {
	Image back;
	OptionsMenu(){
        back = new ImageIcon("sayfa3.png").getImage();	
	
	}
     @Override    
     public void paint(Graphics g) {
    	 super.paintComponent(g);
    	 Graphics g2D = (Graphics2D)g;
    	 
         g.drawImage(back, 0, 0, null);    	
    	 
    	 
}
}