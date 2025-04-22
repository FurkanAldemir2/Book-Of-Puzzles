import java.awt.*;
import javax.swing.*;

public class CreditsMenu extends JPanel {
	Image back;
	 CreditsMenu (){
        back = new ImageIcon("saife3.png").getImage();	
	
        
        
        
        
        
        
        
	}
     public void paint(Graphics g) {
    	 super.paintComponent(g);
    	 Graphics g2D = (Graphics2D)g;
    	 
         g.drawImage(back, 0, 0, null);    	
    	 
    	 
}
}
