import java.awt.*;
import javax.swing.*;

public class GameMenu extends JPanel {
	Image back;
	GameMenu(){
        back = new ImageIcon("menu1.png").getImage();	
         
        	setLayout(null);
        
         JLabel label = new JLabel();
	     JLabel label2 = new JLabel();
	     JLabel label3 = new JLabel();
	     JLabel label4 = new JLabel();
	     JLabel label5 = new JLabel();
	     
	     
	     label.setText("Welcome to the Book of Puzles! After you choose your game mode, you can start to solve the sliding puzzle." );
	     label.setBounds(50,300,1000,50);
	     
	     label2.setText("In the easy and medium modes, you need to compose the right configuration to solve the 3x3 puzzle." );
	     label2.setBounds(50,340,1000,50);
	     
	     label3.setText("In the easy mode, there are only numbers whereas in the medium mode there are several images. " );
	     label3.setBounds(50,380,1000,50);
	     
	     label4.setText("In the hard mode, you need to solve 4x4 puzzle by moving puzzle pieces to the empty space. " );
	     label4.setBounds(50,420,1000,50);
	     
	     label5.setText("Enjoy! " );
	     label5.setBounds(400,460,1000,50);
	     
	     label.setVerticalTextPosition(JLabel.CENTER);
	     label.setHorizontalTextPosition(JLabel.CENTER);
	     
	     label2.setVerticalTextPosition(JLabel.CENTER);
	     label2.setHorizontalTextPosition(JLabel.CENTER);
	     
	     label3.setVerticalTextPosition(JLabel.CENTER);
	     label3.setHorizontalTextPosition(JLabel.CENTER);
	     
	     label4.setVerticalTextPosition(JLabel.CENTER);
	     label4.setHorizontalTextPosition(JLabel.CENTER);
	     
	     label5.setVerticalTextPosition(JLabel.CENTER);
	     label5.setHorizontalTextPosition(JLabel.CENTER);
	     
	     label.setFont(new Font("Serif",Font.ITALIC,20));
	     label2.setFont(new Font("Serif",Font.ITALIC,20));
	     label3.setFont(new Font("Serif",Font.ITALIC,20));
	     label4.setFont(new Font("Serif",Font.ITALIC,20));
	     label5.setFont(new Font("Serif",Font.ITALIC,20));
	     
	     this.add(label);
	     this.add(label2);
	     this.add(label3);
	     this.add(label4);
	     this.add(label5);
        
	}
     @Override    
     public void paintComponent(Graphics g) {
    	 super.paintComponent(g);
    	 Graphics g2D = (Graphics2D)g;
    	 
         g.drawImage(back, 0, 0, getWidth(), getHeight(), this);    	
    	 
    	    
     }
     public static void main(String[] args) {
         JFrame frame = new JFrame("Game Menu"); 
         GameMenu gameMenu = new GameMenu(); 
         frame.add(gameMenu); 
         frame.setSize(1024, 768); 
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         frame.setVisible(true);
     }
}