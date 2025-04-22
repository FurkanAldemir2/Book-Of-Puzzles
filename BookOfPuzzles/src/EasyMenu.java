import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
public class EasyMenu extends JPanel implements ActionListener  {	
Image back,wood;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bc1,bc2,bc3,bc4,bc5,bc6,bc7,bc8,bc9;   
JLabel woodPlate;
ImageIcon icon,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
Timer timer;
Point point,point1,point2,point3,point4,point5,point6,point7,point8,p1,p2,p3,p4,p5,p6,p7,p8,p9; Point animFrame; 
int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8,x9,y9,xr8,yr8;
static int ShuffleConstant,RandomConstant;
int[][] array =  {{1, 2, 3},{4, 5, 6},{7, 0, 8}};;
File error; File slide;
Clip clip;  Clip clip2;
FloatControl gainControl;
AudioInputStream stream; 

 EasyMenu()throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	 
	 
    back = new ImageIcon("saife.jpg").getImage();
    wood = new ImageIcon("wood").getImage();
    r1 = new ImageIcon("1,3.jpeg"); r5 = new ImageIcon("5.jpeg"); r9 = new ImageIcon("tahta.jpeg");  
    r2 = new ImageIcon("2.jpeg");   r6 = new ImageIcon("6.jpeg"); 
    r3 = new ImageIcon("3.jpeg");   r7 = new ImageIcon("7.jpeg");
    r4 = new ImageIcon("4.jpeg");   r8 = new ImageIcon("8,4.jpeg"); 
    
        
    b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3"); b4 = new JButton("4"); b5 = new JButton("5");
    b6 = new JButton("6"); b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("0"); b10 = new JButton("Shuffle"); b11 = new JButton("←");
    
    bc1 = new JButton("1"); bc2 = new JButton("2"); bc3 = new JButton("3"); bc4 = new JButton("4"); bc5 = new JButton("5");
    bc6 = new JButton("6"); bc7 = new JButton("7"); bc8 = new JButton("8"); bc9 = new JButton("0"); 
    
    bc1.setVisible(false); bc2.setVisible(false); bc3.setVisible(false); bc4.setVisible(false); bc5.setVisible(false); 
    bc6.setVisible(false); bc7.setVisible(false); bc8.setVisible(false); bc9.setVisible(false);
    
    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this); 
    b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);b10.addActionListener(this);
    b11.addActionListener(this);
    
    this.add(b1); this.add(b2); this.add(b3); this.add(b4); this.add(b5); this.add(b6); this.add(b7); this.add(b8); this.add(b9); this.add(b10);  
    b9.setVisible(false); this.add(b11);
    
    this.add(bc1); this.add(bc2); this.add(bc3); this.add(bc4); this.add(bc5); this.add(bc6); this.add(bc7); this.add(bc8); this.add(bc9);
    
    x1 = 1200; x2 = 1340; x3 = 1480; x4 = 1200; x5 = 1340; x6 = 1480; x7 = 1200; x8 = 1340; x9 = 1480; 
    y1 = 270;  y2 = 270;  y3 = 270;  y4 = 410;  y5 = 410;  y6 = 410;  y7 = 550;  y8 = 550;  y9 = 550;  
    
    b1.setBounds(x1,y1,140,140); b2.setBounds(x2,y2,140,140); b3.setBounds(x3,y3,140,140); b4.setBounds(x4,y4,140,140); b5.setBounds(x5,y5,140,140);
    b6.setBounds(x6,y6,140,140); b7.setBounds(x7,y7,140,140); b8.setBounds(x8,y8,140,140); b9.setBounds(x9,y9,140,140); b10.setBounds(1340,160,140,70);
    b11.setBounds(1500,166,60,60);
    
    bc1.setBounds(x1,y1,140,140); bc2.setBounds(x2,y2,140,140); bc3.setBounds(x3,y3,140,140); bc4.setBounds(x4,y4,140,140); bc5.setBounds(x5,y5,140,140);
    bc6.setBounds(x6,y6,140,140); bc7.setBounds(x7,y7,140,140); bc8.setBounds(x8,y8,140,140); bc9.setBounds(x9,y9,140,140); 
    
    b1.setIcon(r1); b2.setIcon(r2); b3.setIcon(r3); b4.setIcon(r4); b5.setIcon(r5); b6.setIcon(r6); b7.setIcon(r7); b8.setIcon(r8); //b1.setIcon()r9;
     
     ImageIcon icon = new ImageIcon("sayfa.png");
     b10.setText("Shuffle"); b10.setIcon(icon); b10.setHorizontalTextPosition(JButton.CENTER);
	 b10.setVerticalTextPosition(JButton.CENTER);
	 b10.setForeground(Color.black);  b10.setFont(new Font("Serif",Font.ITALIC,20));
    
	 ImageIcon icon1 = new ImageIcon("sayfa.png");
     b11.setText("←"); b11.setIcon(icon1); b11.setHorizontalTextPosition(JButton.CENTER);
	 b11.setVerticalTextPosition(JButton.CENTER);
	 b11.setForeground(Color.black);  b11.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 
	 point = new Point(b9.getBounds().x,b9.getBounds().y);
     point2 = new Point(x8,y8);
    //timer = new Timer(10,this);
    p1 = new Point(x1,y1); p2 = new Point(x2,y2); p3 = new Point(x3,y3); p4 = new Point(x4,y4); p5 = new Point(x5,y5); 
    p6 = new Point(x6,y6); p7 = new Point(x7,y7); p8 = new Point(x8,y8); p9 = new Point(x9,y9);
  /* do {
	   shuffle();
   }*/
    Random r = new Random();
    ShuffleConstant = r.nextInt(100)+1;
    
  System.out.println(ShuffleConstant);
 
     error = new File("error.wav");
	 AudioInputStream stream = AudioSystem.getAudioInputStream(error);
	 clip = AudioSystem.getClip();
	 clip.open(stream);
	 
	 slide = new File("slide.wav");
	 AudioInputStream stream2 = AudioSystem.getAudioInputStream(slide);
	 clip2 = AudioSystem.getClip();
	 clip2.open(stream2);
	 
	  Random k = new Random();
	  RandomConstant = k.nextInt(100)+1;
	  
	     if(RandomConstant%5==1) {
	    	 b1.setBounds(x5, y5, 140, 140); b2.setBounds(x3,y3,140,140); b3.setBounds(x2,y2,140,140); b4.setBounds(x8,y8,140,140); b5.setBounds(x1,y1,140,140);
	    	 b6.setBounds(x6,y6,140,140); b7.setBounds(x4,y4,140,140); b8.setBounds(x7,y7,140,140); b9.setBounds(x9,y9,140,140);
	    	
	    	 bc1.setBounds(x5,y5,140,140); bc2.setBounds(x3,y3,140,140); bc3.setBounds(x2,y2,140,140); bc4.setBounds(x8,y8,140,140); bc5.setBounds(x1,y1,140,140);
	    	 bc6.setBounds(x6,y6,140,140); bc7.setBounds(x4,y4,140,140); bc8.setBounds(x7,y7,140,140); bc9.setBounds(x9,y9,140,140);    
	    	 
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	     }
	      else if(RandomConstant%5==2) {
	    	
	    	  b1.setBounds(x9, y9, 140, 140); b2.setBounds(x1,y1,140,140); b3.setBounds(x4,y4,140,140); b4.setBounds(x5,y5,140,140); b5.setBounds(x3,y3,140,140);
	 	     b6.setBounds(x8,y8,140,140); b7.setBounds(x7,y7,140,140); b8.setBounds(x6,y6,140,140); b9.setBounds(x2,y2,140,140);
	 	   
	 	     bc1.setBounds(x9,y9,140,140); bc2.setBounds(x1,y1,140,140); bc3.setBounds(x7,y7,140,140); bc4.setBounds(x5,y5,140,140); bc5.setBounds(x3,y3,140,140);
	 	     bc6.setBounds(x8,y8,140,140); bc7.setBounds(x4,y4,140,140); bc8.setBounds(x6,y6,140,140); bc9.setBounds(x2,y2,140,140); 
	 	   
	 	     arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
        	 arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	     
	      }else if(RandomConstant%5==3) {
	    	 
	    	 b1.setBounds(x3, y3, 140, 140); b2.setBounds(x4,y4,140,140); b3.setBounds(x7,y7,140,140); b4.setBounds(x5,y5,140,140); b5.setBounds(x9,y9,140,140);
	 	     b6.setBounds(x1,y1,140,140); b7.setBounds(x6,y6,140,140); b8.setBounds(x2,y2,140,140); b9.setBounds(x8,y8,140,140);
	 	     
	 	    bc1.setBounds(x3,y3,140,140); bc2.setBounds(x4,y4,140,140); bc3.setBounds(x7,y7,140,140); bc4.setBounds(x5,y5,140,140); bc5.setBounds(x9,y9,140,140);
	 	    bc6.setBounds(x1,y1,140,140); bc7.setBounds(x6,y6,140,140); bc8.setBounds(x2,y2,140,140); bc9.setBounds(x8,y8,140,140); 
	 	  
	 	    arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
       	    arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	     
	     
	     
	     }else if(RandomConstant%5==4) {
	    	 b1.setBounds(x5, y5, 140, 140); b2.setBounds(x9,y9,140,140); b3.setBounds(x2,y2,140,140); b4.setBounds(x3,y3,140,140); b5.setBounds(x7,y7,140,140);
	 	     b6.setBounds(x1,y1,140,140); b7.setBounds(x6,y6,140,140); b8.setBounds(x4,y4,140,140); b9.setBounds(x8,y8,140,140);
	 	     
	 	    bc1.setBounds(x5,y5,140,140); bc2.setBounds(x9,y9,140,140); bc3.setBounds(x2,y2,140,140); bc4.setBounds(x3,y3,140,140); bc5.setBounds(x7,y7,140,140);
	 	    bc6.setBounds(x1,y1,140,140); bc7.setBounds(x6,y6,140,140); bc8.setBounds(x4,y4,140,140); bc9.setBounds(x8,y8,140,140); 
	 	    
	 	   arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
           arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
           
	     }else if(RandomConstant%5==0) {
	    	 b1.setBounds(x9, y9, 140, 140); b2.setBounds(x6,y6,140,140); b3.setBounds(x3,y3,140,140); b4.setBounds(x5,y5,140,140); b5.setBounds(x4,y4,140,140);
	 	     b6.setBounds(x8,y8,140,140); b7.setBounds(x2,y2,140,140); b8.setBounds(x1,y1,140,140); b9.setBounds(x7,y7,140,140);
	 	     
	 	    bc1.setBounds(x9,y9,140,140); bc2.setBounds(x6,y6,140,140); bc3.setBounds(x3,y3,140,140); bc4.setBounds(x5,y5,140,140); bc5.setBounds(x4,y4,140,140);
	 	    bc6.setBounds(x8,y8,140,140); bc7.setBounds(x2,y2,140,140); bc8.setBounds(x1,y1,140,140); bc9.setBounds(x7,y7,140,140); 
	     
	 	   arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
       	   arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	     }
       
	    
 } //panel deta1ils
 
     
 
@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics g2D = (Graphics2D)g;
    g.drawImage(back, 0, 0, null);    
   // g.drawImage(r8, x8, y8, null);  
}

 
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()== b8) {
         if(isNextTo(b8,b9)) {
        	 
        	 point = new Point(b9.getBounds().x,b9.getBounds().y);
        	 animate(b8,point,140,1);
        	 bc8.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
        	 b9.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
        	 arrayMaker(bc8); arrayMaker(b9);
        	 clip2.setFramePosition(0);
			 clip2.start();
        	 winning(array);
            	
             }
         else { 
        	clip.setFramePosition(0);
			clip.start();
         }
        }
    
         if(e.getSource()== b7) {
           
        	 if(isNextTo(b7,b9)) {
             
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
            	 animate(b7,point,140,1);
            	 bc7.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
            	 b9.setBounds(b7.getBounds().x,b7.getBounds().y,140,140); 
            	 arrayMaker(bc7); arrayMaker(b9);
            	 clip2.setFramePosition(0);
    			 clip2.start();
        	    } 
        	 else { 
             	clip.setFramePosition(0);
     			clip.start();
              }
         }
    
         if(e.getSource()== b6) {
            
          	 if(isNextTo(b6,b9)) {
                  
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b6,point,140,1);
              	 bc6.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b6.getBounds().x,b6.getBounds().y,140,140); 
              	arrayMaker(bc6); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
    			 winning(array);
          	     }
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
         }
             
         if(e.getSource()== b5) {
             
          	 if(isNextTo(b5,b9)) {
                   
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b5,point,140,1);
              	 bc5.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b5.getBounds().x,b5.getBounds().y,140,140); 
              	 arrayMaker(bc5); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
              	 } 
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
         }
   
         if(e.getSource()== b4) {
             
          	 if(isNextTo(b4,b9)) {
                   
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b4,point,140,1);
              	 bc4.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b4.getBounds().x,b4.getBounds().y,140,140); 
              	 arrayMaker(bc4); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
          	     } 
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
         }
         
         
         if(e.getSource()== b3) {
             
          	 if(isNextTo(b3,b9)) {
                   
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b3,point,140,1);
              	 bc3.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140); 
              	 arrayMaker(bc3); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
          	     } 
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
         }
         
         
         if(e.getSource()== b2) {
             
          	 if(isNextTo(b2,b9)) {
                   
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b2,point,140,1);
              	 bc2.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b2.getBounds().x,b2.getBounds().y,140,140); 
              	 arrayMaker(bc2); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
          	     } 
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
         }
         
         if(e.getSource()== b1) {
             
          	 if(isNextTo(b1,b9)) {
                 ;  
                 point = new Point(b9.getBounds().x,b9.getBounds().y);
              	 animate(b1,point,140,1);
              	 bc1.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
              	 b9.setBounds(b1.getBounds().x,b1.getBounds().y,140,140); 
              	 arrayMaker(bc1); arrayMaker(b9);
              	 clip2.setFramePosition(0);
    			 clip2.start();
          	       }
          	else { 
            	clip.setFramePosition(0);
    			clip.start();
             }
              }
         
         if(e.getSource() == b10) {
            ShuffleAllower();
        	
        	arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
        	arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
        	 clip2.setFramePosition(0);
			 clip2.start();
        	convertToString(array); 
        	 b10.setEnabled(false); 
        	 /*while(isSolvable(array)==false) {
        		   System.out.println("a");
        		   shuffle();}*/
        	   
        	if(isSolvable(array)==false) {
        		  System.out.println("b");
        	  }
        	 }
           
         if(e.getSource()==b11) {
        	 b10.setEnabled(true);
         
         }
}
       
        	 
        	 
         //shuffle

 


public void winning(int[][] array) {
    
    if(array[0][0]==1 && array[0][1]==2 &&array[0][2]==3 &&array[1][0]==4 &&array[1][1]==5 &&array[1][2]==6 
   		 &&array[2][0]==7 &&array[2][1]==8 &&array[2][2]==0) {
   	
    	  JOptionPane.showOptionDialog(null, "Congradulations! You won! ", 
    	    		"Secret Passage",JOptionPane.DEFAULT_OPTION , JOptionPane.INFORMATION_MESSAGE, null, null,null);
    	    ShuffleAllower();
    	    }
   	 
   		}




    
    


      public boolean isNextTo(JButton a, JButton b) {
	  double k = ((b.getBounds().x)-(a.getBounds().x))*((b.getBounds().x)-(a.getBounds().x))+ 
			  ((b.getBounds().y)-(a.getBounds().y))*((b.getBounds().y)-(a.getBounds().y));
			
    	if(Math.sqrt(k) == 140) {
		  return true;
	  }
    	  return false;
      }



 public void animate(final JComponent component, Point newPoint, final int frames, int interval) {
	    final Rectangle compBounds = component.getBounds();

	    final Point oldPoint = new Point(compBounds.x, compBounds.y);
		final Point animFrame = new Point((newPoint.x - oldPoint.x) / frames , (newPoint.y - oldPoint.y) / frames);

	    new Timer(interval, new ActionListener() {
	        int currentFrame = 0;
	        public void actionPerformed(ActionEvent e) {
  component.setBounds(oldPoint.x + (animFrame.x * currentFrame), oldPoint.y + (animFrame.y * currentFrame), compBounds.width, compBounds.height);

	            if (currentFrame != frames) {
	               currentFrame+=10;
	            }
	            else {
	                
	            	((Timer)e.getSource()).stop();
	            	}
	        }
	    }).start();
	}

 public void ShuffleAllower() {
	ShuffleConstant++;
	
	 if(ShuffleConstant%4==1) {
		 bc1.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);  
		 bc3.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 bc2.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
		 bc7.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 bc4.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 bc8.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 bc5.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 bc9.setBounds(b5.getBounds().x,b5.getBounds().y,140,140); 
		 bc6.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 
		arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
     	arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
		 
		 if(isSolvable(array)==false) {
			 System.out.println("a1");
			 ShuffleAllower();
			 return;	}
		 else {
			 System.out.println("1");
			 shuffle();
			 return;}
		    
		  
	  }
	 if(ShuffleConstant%4==2) {
		 bc2.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 bc8.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 bc3.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
		 bc7.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
		 bc4.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 bc5.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 bc1.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 bc9.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 bc6.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 
		 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
		 
		 if(isSolvable(array)==false) {
			 System.out.println("a2");
			 ShuffleAllower();
			 return;
			 }
		 else {
			 System.out.println("2");
			 shuffle();
			 return;
			 }
	 }
	 if(ShuffleConstant%4==3) {
		 bc4.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 bc1.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 bc5.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 bc2.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 bc6.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 bc8.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 bc3.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 bc9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140); 
		 bc7.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
		 
		 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	 
	     if(isSolvable(array)==false) {
			 System.out.println("a3");
	    	 ShuffleAllower();
	    	 return;
	    	 }
		 else {
			 System.out.println("3");
			 shuffle();
	          return;}
	     }
	 if(ShuffleConstant%4==0) {
		 bc1.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 bc5.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 bc2.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 bc6.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 bc4.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 bc8.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 bc7.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 bc9.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);  
		 bc3.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
		 
		 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9);
	 
	     if(isSolvable(array)==false) {
			 System.out.println("a4");
	    	 ShuffleAllower();
	    	 return;
	    	 }
		 else {
			 System.out.println("4");
			 shuffle();
	          return;}
	     }
 }
 
 
 
 
 
 public void shuffle() {
		
	
 	
	 point1 =  new Point(b1.getBounds().x,b1.getBounds().y);
	 point2 =  new Point(b2.getBounds().x,b2.getBounds().y);
	 point3 =  new Point(b3.getBounds().x,b3.getBounds().y);
	 point4 =  new Point(b4.getBounds().x,b4.getBounds().y);
	 point5 =  new Point(b5.getBounds().x,b5.getBounds().y);
	 point6 =  new Point(b6.getBounds().x,b6.getBounds().y);
	 point7 =  new Point(b7.getBounds().x,b7.getBounds().y);
	 point8 =  new Point(b8.getBounds().x,b8.getBounds().y);
	  point = new Point(b9.getBounds().x,b9.getBounds().y); //beware of this line
	 
	  
	  
	  
	  
	 if(ShuffleConstant%4==1) {
		 animate(b1,point3,140,1);
		 bc1.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
		 animate(b3,point1,140,1);
		 bc3.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 animate(b2,point7,140,1);
		 bc2.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
		 animate(b7,point2,140,1);
		 bc7.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 animate(b4,point8,140,1);
		 bc4.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 animate(b8,point4,140,1);
		 bc8.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 animate(b5,point,140,1);
		 bc5.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 
		 b9.setBounds(b5.getBounds().x,b5.getBounds().y,140,140); 
		 bc9.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);}
	 
	 if(ShuffleConstant%4==2) {
		 animate(b2,point8,140,1);
		 bc2.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 animate(b8,point2,140,1);
		 bc8.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 animate(b3,point7,140,1);
		 bc3.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
		 animate(b7,point3,140,1);
		 bc7.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
		 animate(b4,point5,140,1);
		 bc4.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 animate(b5,point4,140,1);
		 bc5.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 animate(b1,point,140,1);
		 bc1.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 
		 b9.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 bc9.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);}
	 
	 
	 if(ShuffleConstant%4==3) {
		 animate(b4,point1,140,1);
		 bc4.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 animate(b1,point4,140,1);
		 bc1.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 animate(b5,point2,140,1);
		 bc5.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 animate(b2,point5,140,1);
		 bc2.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 animate(b6,point8,140,1);
		 bc6.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 animate(b8,point6,140,1);
		 bc8.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 animate(b3,point,140,1);
		 bc3.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 
		 b9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140); 
		 bc9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
	 }
	 if(ShuffleConstant%4==0) {
		 animate(b1,point5,140,1);
		 bc1.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
		 animate(b5,point1,140,1);
		 bc5.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 animate(b2,point6,140,1);
		 bc2.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
		 animate(b6,point2,140,1);
		 bc6.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
		 animate(b4,point8,140,1);
		 bc4.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		 animate(b8,point4,140,1);
		 bc8.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
		 animate(b7,point,140,1);
		 bc7.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
		 
		 b9.setBounds(b7.getBounds().x,b7.getBounds().y,140,140); 
		 bc9.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
	 }
   }
 

 
 
  
 
 
 public void arrayMaker(JButton b) {
 	
	if(b.getBounds().x == x1 && b.getBounds().y == y1 ) {
		array[0][0] = Integer.parseInt(b.getText());
		
	}
	
	if(b.getBounds().x == x2 && b.getBounds().y == y2 ) {
		array[0][1] = Integer.parseInt(b.getText());
	}
	
	if(b.getBounds().x == x3 && b.getBounds().y == y3 ) {
		array[0][2] = Integer.parseInt(b.getText());
	} 
	
	if(b.getBounds().x == x4 && b.getBounds().y == y4 ) {
		array[1][0] = Integer.parseInt(b.getText());
	}
    
	if(b.getBounds().x == x5 && b.getBounds().y == y5 ) {
		array[1][1] = Integer.parseInt(b.getText());
	}
	
	if(b.getBounds().x == x6 && b.getBounds().y == y6 ) {
		array[1][2] = Integer.parseInt(b.getText());
	}
	
	if(b.getBounds().x == x7 && b.getBounds().y == y7 ) {
		array[2][0] = Integer.parseInt(b.getText());
	}
	
	if(b.getBounds().x == x8 && b.getBounds().y == y8 ) {
		array[2][1] = Integer.parseInt(b.getText());
	}
	
	if(b.getBounds().x == x9 && b.getBounds().y == y9 ) {
		array[2][2] = Integer.parseInt(b.getText());
	}
 
 }
 
 static int getInvCount(int[] arr)
 {
     int inv_count = 0;
     for (int i = 0; i < 9; i++)
         for (int j = i + 1; j < 9; j++)
          
             // Value 0 is used for empty space
             if (arr[i] > 0 &&
                             arr[j] > 0 && arr[i] > arr[j])
                 inv_count++;
     return inv_count;
 }
 static boolean isSolvable(int[][] puzzle)
 {
     int linearPuzzle[];
     linearPuzzle = new int[9];
     int k = 0;
      
   // Converting 2-D puzzle to linear form
     for(int i=0; i<3; i++)
         for(int j=0; j<3; j++)
             linearPuzzle[k++] = puzzle[i][j];
      
     // Count inversions in given 8 puzzle
     int invCount = getInvCount(linearPuzzle);
  
     // return true if inversion count is even.
     return (invCount % 2 == 0);
 }
 public static void convertToString(int arr[][]) 
 { 

     for (int n = 0 ; n < arr.length ; n++)
     {
         System.out.println(Arrays.toString(arr[n])); 
     } 
}// class
}











