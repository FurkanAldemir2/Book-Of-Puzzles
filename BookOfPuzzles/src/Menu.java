
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
public class Menu extends JPanel{
      
	Image back;


	
	Menu(){
        back = new ImageIcon("arka7.png").getImage();	
     
	}
@Override   
     public void paint(Graphics g) {
    	 super.paintComponent(g);
    	 Graphics g2D = (Graphics2D)g;
    	 
         g.drawImage(back, 0, 0, null);    	
    	 
         }
         
         
         
         
       
         
         
         
         
         
         
}
