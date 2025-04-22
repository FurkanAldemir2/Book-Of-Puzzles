
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
public class HardMenu extends JPanel implements ActionListener  {	
	Image back,wood;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,bg,bc1,bc2,bc3,bc4,bc5,bc6,bc7,bc8,bc9,bc10,bc11,bc12,bc13,bc14,bc15,bc16;   
	JLabel woodPlate;
	ImageIcon icon,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17;
	Timer timer;
	Point point,point1,point2,point3,point4,point5,point6,point7,point8,point9,point10,point11,point12,point13,point14,point15,p1,p2,p3,p4,p5,p6,p7,p8,p9; Point animFrame; 
	int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,x7,y7,x8,y8,x9,y9,x10,y10,x11,y11,x12,y12,x13,y13,x14,y14,x15,y15,x16,y16,x17,y17;
	static int ShuffleConstant,RandomConstant;
	int[][] array =  {{1,2,3,4}, {5,6,7,8},  {9,10,11,12}, {13,14,15,0}};
	static int invCount;
	static final int N = 4;
	File error; File slide;
	Clip clip;  Clip clip2;
	FloatControl gainControl;
	AudioInputStream stream; 
	 HardMenu() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		 
	    back = new ImageIcon("saife.jpg").getImage();
	    wood = new ImageIcon("wood").getImage();
	    r1 = new ImageIcon("1,3.jpeg"); r5 = new ImageIcon("5.jpeg");    r9 = new ImageIcon("9,3.jpeg");       r13 = new ImageIcon("13,2.jpeg");
	    r2 = new ImageIcon("2.jpeg");   r6 = new ImageIcon("6.jpeg");    r10 = new ImageIcon("10,2.jpeg");     r14 = new ImageIcon("14,2.jpeg");
	    r3 = new ImageIcon("3.jpeg");   r7 = new ImageIcon("7.jpeg");    r11 = new ImageIcon("11,2.jpeg");     r15 = new ImageIcon("15,2.jpeg");
	    r4 = new ImageIcon("4.jpeg");   r8 = new ImageIcon("8,4.jpeg");  r12 = new ImageIcon("12,2.jpeg");     
	    
	    
	    
	    b1 = new JButton("1");   b2 = new JButton("2");         b3 = new JButton("3");   b4  = new JButton("4");   b5 = new JButton("5");
	    b6 = new JButton("6");   b7 = new JButton("7");         b8 = new JButton("8");   b9  = new JButton("9");   b10 = new JButton("10");
	    b11 = new JButton("11"); b12 = new JButton("12");      b13 = new JButton("13");  b14 = new JButton("14");  b15 = new JButton("15");
	    b16 =new JButton("0");  b17 = new JButton("Shuffle");  b18 = new JButton("←");
	    
	    bc1 = new JButton("1");   bc2 = new JButton("2");   bc3 = new JButton("3");   bc4 = new JButton("4");   bc5 = new JButton("5");
	    bc6 = new JButton("6");   bc7 = new JButton("7");   bc8 = new JButton("8");   bc9 = new JButton("9");   bc10=new JButton("10");
	    bc11= new JButton("11");  bc12= new JButton("12");  bc13= new JButton("13");  bc14= new JButton("14");  bc15= new JButton("15");
	    bc16= new JButton("0");
	    
	    
	    bc1.setVisible(false); bc2.setVisible(false); bc3.setVisible(false); bc4.setVisible(false); bc5.setVisible(false); 
	    bc6.setVisible(false); bc7.setVisible(false); bc8.setVisible(false); bc9.setVisible(false); bc10.setVisible(false);
	    bc11.setVisible(false); bc12.setVisible(false); bc13.setVisible(false); bc14.setVisible(false); bc15.setVisible(false); bc16.setVisible(false); 
	    
	    
	    b1.addActionListener(this);  b2.addActionListener(this);  b3.addActionListener(this);  b4.addActionListener(this);b5.addActionListener(this); 
	    b6.addActionListener(this);  b7.addActionListener(this);  b8.addActionListener(this);  b9.addActionListener(this);b10.addActionListener(this);
	    b11.addActionListener(this); b12.addActionListener(this); b13.addActionListener(this); b14.addActionListener(this);b15.addActionListener(this);
	    b16.addActionListener(this); b17.addActionListener(this); b18.addActionListener(this);
	    
	    this.add(b1); this.add(b2); this.add(b3); this.add(b4); this.add(b5); this.add(b6); this.add(b7); this.add(b8); this.add(b9); this.add(b10);  
	     this.add(b11);this.add(b12);this.add(b13);this.add(b14);this.add(b15);this.add(b16);this.add(b17); this.add(b18);
	    //b8.setVile(tu);
	     this.add(bc1); this.add(bc2); this.add(bc3); this.add(bc4); this.add(bc5); this.add(bc6); this.add(bc7); this.add(bc8); this.add(bc9);
	     this.add(bc10); this.add(bc11); this.add(bc12); this.add(bc13); this.add(bc14); this.add(bc15); this.add(bc16);
	     
	     
	     bc1.setBounds(x1,y1,140,140);    bc2.setBounds(x2,y2,140,140);    bc3.setBounds(x3,y3,140,140);    bc4.setBounds(x4,y4,140,140); 
	     bc5.setBounds(x5,y5,140,140);    bc6.setBounds(x6,y6,140,140);    bc7.setBounds(x7,y7,140,140);    bc8.setBounds(x8,y8,140,140); 
	     bc9.setBounds(x9,y9,140,140);    bc10.setBounds(x10,y10,140,140); bc11.setBounds(x11,y11,140,140); bc12.setBounds(x12,y12,140,140); 
	     bc13.setBounds(x13,y13,140,140); bc14.setBounds(x13,y13,140,140); bc15.setBounds(x15,y15,140,140); bc16.setBounds(x16,y16,140,140); 
	     
	     
	    x1 = 1200; x2 = 1340; x3 = 1480; x4 = 1620; x5 = 1200; x6 = 1340; x7 = 1480; x8 = 1620; x9 = 1200; x10=1340; 
	    y1 = 270;  y2 = 270;  y3 = 270;  y4 = 270;  y5 = 410;  y6 = 410;  y7 = 410;  y8 = 410;  y9 = 550;  y10=550; 
	   
	    x11=1480; x12=1620; x13=1200; x14=1340; x15=1480; x16=1620; x17=1410;
	    y11=550;  y12=550;  y13=690;  y14=690;  y15=690;  y16=690;  y17=160;   
	    
	     b1.setBounds(x1,y1,140,140);     b2.setBounds(x2,y2,140,140);      b3.setBounds(x3,y3,140,140);      b4.setBounds(x4,y4,140,140); 
	     b5.setBounds(x5,y5,140,140);     b6.setBounds(x6,y6,140,140);      b7.setBounds(x7,y7,140,140);      b8.setBounds(x8,y8,140,140); 
	     b9.setBounds(x9,y9,140,140);     b10.setBounds(x10,y10,140,140);   b11.setBounds(x11,y11,140,140);   b12.setBounds(x12,y12,140,140); 
	     b13.setBounds(x13,y13,140,140);  b14.setBounds(x14,y14,140,140);   b15.setBounds(x15,y15,140,140);   b16.setBounds(x16,y16,140,140);
	     b17.setBounds(x17,y17,140,70);   b18.setBounds((x17+160),(y17+6),60,60); 
	    
	    b16.setVisible(false);
	    
	    b1.setIcon(r1); b2.setIcon(r2);   b3.setIcon(r3);   b4.setIcon(r4);   b5.setIcon(r5);   b6.setIcon(r6);   b7.setIcon(r7);  b8.setIcon(r8); 
	    b9.setIcon(r9); b10.setIcon(r10); b11.setIcon(r11); b12.setIcon(r12); b13.setIcon(r13); b14.setIcon(r14); b15.setIcon(r15); 
	    
	     ImageIcon icon = new ImageIcon("sayfa.png");
	     b17.setText("Shuffle"); b17.setIcon(icon); b17.setHorizontalTextPosition(JButton.CENTER);
		 b17.setVerticalTextPosition(JButton.CENTER);
		 b17.setForeground(Color.black);  b17.setFont(new Font("Serif",Font.ITALIC,20));
	    
		 ImageIcon icon1 = new ImageIcon("sayfa.png");
	     b18.setText("←"); b18.setIcon(icon1); b18.setHorizontalTextPosition(JButton.CENTER);
		 b18.setVerticalTextPosition(JButton.CENTER);
		 b18.setForeground(Color.black);  b18.setFont(new Font("Serif",Font.ITALIC,20));
	    
	    point  = new Point(b9.getBounds().x,b9.getBounds().y);
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
	     
	     if(RandomConstant%5 == 1) {
	    	 b1.setBounds(x4,y4,140,140); b2.setBounds(x9,y9,140,140); b3.setBounds(x15,y15,140,140); b4.setBounds(x8,y8,140,140); 
	    	 b5.setBounds(x1,y1,140,140); b6.setBounds(x16,y16,140,140); b7.setBounds(x6,y6,140,140); b8.setBounds(x7,y7,140,140);
	    	 b9.setBounds(x14,y14,140,140); b10.setBounds(x2,y2,140,140); b11.setBounds(x10,y10,140,140); b12.setBounds(x3,y3,140,140);
	    	 b13.setBounds(x5,y5,140,140); b14.setBounds(x13,y13,140,140); b15.setBounds(x11,y11,140,140); b16.setBounds(x12,y12,140,140);
	    	 
	    	 bc1.setBounds(x4,y4,140,140); bc2.setBounds(x9,y9,140,140); bc3.setBounds(x15,y15,140,140); bc4.setBounds(x8,y8,140,140); 
	    	 bc5.setBounds(x1,y1,140,140); bc6.setBounds(x16,y16,140,140); bc7.setBounds(x6,y6,140,140); bc8.setBounds(x7,y7,140,140);
	    	 bc9.setBounds(x14,y14,140,140); bc10.setBounds(x2,y2,140,140); bc11.setBounds(x10,y10,140,140); bc12.setBounds(x3,y3,140,140);
	    	 b13.setBounds(x5,y5,140,140); bc14.setBounds(x13,y13,140,140); bc15.setBounds(x11,y11,140,140); bc16.setBounds(x12,y12,140,140);
	    
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         arrayMaker(bc16);   
	     }
	     if(RandomConstant%5 == 2) {
	    	 b1.setBounds(x7,y7,140,140); b2.setBounds(x10,y10,140,140); b3.setBounds(x1,y1,140,140); b4.setBounds(x15,y15,140,140); 
	    	 b5.setBounds(x12,y12,140,140); b6.setBounds(x3,y3,140,140); b7.setBounds(x9,y9,140,140); b8.setBounds(x16,y16,140,140);
	    	 b9.setBounds(x11,y11,140,140); b10.setBounds(x4,y4,140,140); b11.setBounds(x8,y8,140,140); b12.setBounds(x2,y2,140,140);
	    	 b13.setBounds(x6,y6,140,140); b14.setBounds(x14,y14,140,140); b15.setBounds(x5,y5,140,140); b16.setBounds(x13,y13,140,140);
	    	 
	    	 bc1.setBounds(x7,y7,140,140); bc2.setBounds(x10,y10,140,140); bc3.setBounds(x1,y1,140,140); bc4.setBounds(x15,y15,140,140); 
	    	 bc5.setBounds(x12,y12,140,140); bc6.setBounds(x3,y3,140,140); bc7.setBounds(x9,y9,140,140); bc8.setBounds(x16,y16,140,140);
	    	 bc9.setBounds(x11,y11,140,140); bc10.setBounds(x4,y4,140,140); bc11.setBounds(x8,y8,140,140); bc12.setBounds(x2,y2,140,140);
	    	 bc13.setBounds(x6,y6,140,140); bc14.setBounds(x14,y14,140,140); bc15.setBounds(x5,y5,140,140); bc16.setBounds(x13,y13,140,140);
	     
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         arrayMaker(bc16);   
	     }
	     if(RandomConstant%5 == 3) {
	    	 b1.setBounds(x13,y13,140,140); b2.setBounds(x5,y5,140,140); b3.setBounds(x7,y7,140,140); b4.setBounds(x6,y6,140,140); 
	    	 b5.setBounds(x2,y2,140,140); b6.setBounds(x12,y12,140,140); b7.setBounds(x4,y4,140,140); b8.setBounds(x14,y14,140,140);
	    	 b9.setBounds(x1,y1,140,140); b10.setBounds(x9,y9,140,140); b11.setBounds(x3,y3,140,140); b12.setBounds(x16,y16,140,140);
	    	 b13.setBounds(x11,y11,140,140); b14.setBounds(x15,y15,140,140); b15.setBounds(x10,y10,140,140); b16.setBounds(x8,y8,140,140);
	    	 
	    	 bc1.setBounds(x13,y13,140,140); bc2.setBounds(x5,y5,140,140); bc3.setBounds(x7,y7,140,140); bc4.setBounds(x6,y6,140,140); 
	    	 bc5.setBounds(x2,y2,140,140); bc6.setBounds(x12,y12,140,140); bc7.setBounds(x4,y4,140,140); bc8.setBounds(x14,y14,140,140);
	    	 bc9.setBounds(x1,y1,140,140); bc10.setBounds(x9,y9,140,140); bc11.setBounds(x3,y3,140,140); bc12.setBounds(x16,y16,140,140);
	    	 bc13.setBounds(x11,y11,140,140); bc14.setBounds(x15,y15,140,140); bc15.setBounds(x10,y10,140,140); bc16.setBounds(x8,y8,140,140);
	     
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         arrayMaker(bc16);
	     }
	   if(RandomConstant%5 == 4) {
		     b1.setBounds(x9,y9,140,140); b2.setBounds(x4,y4,140,140); b3.setBounds(x5,y5,140,140); b4.setBounds(x11,y11,140,140); 
	    	 b5.setBounds(x6,y6,140,140); b6.setBounds(x13,y13,140,140); b7.setBounds(x2,y2,140,140); b8.setBounds(x14,y14,140,140);
	    	 b9.setBounds(x7,y7,140,140); b10.setBounds(x1,y1,140,140); b11.setBounds(x12,y12,140,140); b12.setBounds(x10,y10,140,140);
	    	 b13.setBounds(x15,y15,140,140); b14.setBounds(x16,y16,140,140); b15.setBounds(x8,y8,140,140); b16.setBounds(x3,y3,140,140); 
	   
	    	 bc1.setBounds(x9,y9,140,140); bc2.setBounds(x4,y4,140,140); bc3.setBounds(x5,y5,140,140); bc4.setBounds(x11,y11,140,140); 
	    	 bc5.setBounds(x6,y6,140,140); bc6.setBounds(x13,y13,140,140); bc7.setBounds(x2,y2,140,140); bc8.setBounds(x14,y14,140,140);
	    	 bc9.setBounds(x7,y7,140,140); bc10.setBounds(x1,y1,140,140); bc11.setBounds(x12,y12,140,140); bc12.setBounds(x10,y10,140,140);
	    	 bc13.setBounds(x15,y15,140,140); bc14.setBounds(x16,y16,140,140); bc15.setBounds(x8,y8,140,140); bc16.setBounds(x3,y3,140,140);
	  
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         arrayMaker(bc16);
	   }
	   if(RandomConstant%5 == 0) {
		     b1.setBounds(x11,y11,140,140); b2.setBounds(x16,y16,140,140); b3.setBounds(x8,y8,140,140); b4.setBounds(x15,y15,140,140); 
	    	 b5.setBounds(x14,y14,140,140); b6.setBounds(x7,y7,140,140); b7.setBounds(x13,y13,140,140); b8.setBounds(x9,y9,140,140);
	    	 b9.setBounds(x6,y6,140,140); b10.setBounds(x10,y10,140,140); b11.setBounds(x3,y3,140,140); b12.setBounds(x12,y12,140,140);
	    	 b13.setBounds(x4,y4,140,140); b14.setBounds(x5,y5,140,140); b15.setBounds(x2,y2,140,140); b16.setBounds(x1,y1,140,140); 
	    	 
	    	 bc1.setBounds(x11,y11,140,140); bc2.setBounds(x16,y16,140,140); bc3.setBounds(x8,y8,140,140); bc4.setBounds(x15,y15,140,140); 
	    	 bc5.setBounds(x14,y14,140,140); bc6.setBounds(x7,y7,140,140); bc7.setBounds(x13,y13,140,140); bc8.setBounds(x9,y9,140,140);
	    	 bc9.setBounds(x6,y6,140,140); bc10.setBounds(x10,y10,140,140); bc11.setBounds(x3,y3,140,140); bc12.setBounds(x12,y12,140,140);
	    	 bc13.setBounds(x4,y4,140,140); bc14.setBounds(x5,y5,140,140); bc15.setBounds(x2,y2,140,140); bc16.setBounds(x1,y1,140,140); 
	  
	    	 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         arrayMaker(bc16);
	   }
	 
	 } //panel details
	 
	 
	 
	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics g2D = (Graphics2D)g;
	    g.drawImage(back, 0, 0, null);    
	   // g.drawImage(r8, x8, y8, null);  
	}

	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if(e.getSource()== b15) {
	         if(isNextTo(b15,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b15,point,140,1);
	        	 bc15.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
	        	 arrayMaker(bc15); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	 winning(array);
	        	
	             }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
		 
		 if(e.getSource()== b14) {
	         if(isNextTo(b14,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b14,point,140,1);
	        	 bc14.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
	        	 arrayMaker(bc14); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	 winning(array);
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
		 if(e.getSource()== b13) {
	         if(isNextTo(b13,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b13,point,140,1);
	        	 bc13.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
	        	 arrayMaker(bc13); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	 winning(array);
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
		 if(e.getSource()== b12) {
	         if(isNextTo(b12,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b12,point,140,1);
	        	 bc12.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
	        	 arrayMaker(bc12); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
    			 winning(array);
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
		 if(e.getSource()== b11) {
	         if(isNextTo(b11,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b11,point,140,1);
	        	 bc11.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
	        	 arrayMaker(bc11); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start(
	     					);
	              }}
		 if(e.getSource()== b10) {
	         if(isNextTo(b10,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b10,point,140,1);
	        	 bc10.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
	        	 arrayMaker(bc10); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
		 if(e.getSource()== b9) {
	         if(isNextTo(b9,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b9,point,140,1);
	        	 bc9.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
	        	 arrayMaker(bc9); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
	    if(e.getSource()== b8) {
	         if(isNextTo(b8,b16)) {
	        	 
	        	 point = new Point(b16.getBounds().x,b16.getBounds().y);
	        	 animate(b8,point,140,1);
	        	 bc8.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	        	 b16.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
	        	 arrayMaker(bc8); arrayMaker(b16);
	        	 clip2.setFramePosition(0);
    			 clip2.start();
	        	
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
	         
	    
	         if(e.getSource()== b7) {
	           System.out.println("a");
	        	 if(isNextTo(b7,b16)) {
	                 System.out.println(isNextTo(b7,b16));
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	            	 animate(b7,point,140,1);
	            	 bc7.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	            	 b16.setBounds(b7.getBounds().x,b7.getBounds().y,140,140); 
	            	 arrayMaker(bc7); arrayMaker(b16);
	            	 clip2.setFramePosition(0);
	    			 clip2.start();
	        	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              } }
	    
	         if(e.getSource()== b6) {
	            
	          	 if(isNextTo(b6,b16)) {
	                 System.out.println(isNextTo(b6,b16));
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b6,point,140,1);
	              	bc6.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b6.getBounds().x,b6.getBounds().y,140,140); 
	              	arrayMaker(bc6); arrayMaker(b16);
	              	clip2.setFramePosition(0);
	    			clip2.start();
	              	 
	          	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
	             
	         if(e.getSource()== b5) {
	             
	          	 if(isNextTo(b5,b16)) {
	                   
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b5,point,140,1);
	              	bc5.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b5.getBounds().x,b5.getBounds().y,140,140); 
	              	 arrayMaker(bc5); arrayMaker(b16);
	              	 clip2.setFramePosition(0);
	    			 clip2.start();
	          	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              } }
	   
	         if(e.getSource()== b4) {
	             
	          	 if(isNextTo(b4,b16)) {
	                   
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b4,point,140,1);
	              	bc4.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b4.getBounds().x,b4.getBounds().y,140,140); 
	              	 arrayMaker(bc4); arrayMaker(b16);
	              	 clip2.setFramePosition(0);
	    			 clip2.start();
	          	 } else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
	         
	         
	         if(e.getSource()== b3) {
	             
	          	 if(isNextTo(b3,b16)) {
	                   
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b3,point,140,1);
	              	bc3.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b3.getBounds().x,b3.getBounds().y,140,140); 
	              	 arrayMaker(bc3); arrayMaker(b16);
	              	 clip2.setFramePosition(0);
	    			 clip2.start();
	          	 } else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              }}
	         
	         
	         if(e.getSource()== b2) {
	             
	          	 if(isNextTo(b2,b16)) {
	                   
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b2,point,140,1);
	              	bc2.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b2.getBounds().x,b2.getBounds().y,140,140); 
	              	 arrayMaker(bc2); arrayMaker(b16);
	              	 clip2.setFramePosition(0);
	    			 clip2.start();
	          	 }else { 
	              	clip.setFramePosition(0);
	     			clip.start();
	              } }
	         
	         if(e.getSource()== b1) {
	             
	          	 if(isNextTo(b1,b16)) {
	                 System.out.println(isNextTo(b1,b9));  
	                 point = new Point(b16.getBounds().x,b16.getBounds().y);
	              	 animate(b1,point,140,1);
	              	 bc1.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
	              	 b16.setBounds(b1.getBounds().x,b1.getBounds().y,140,140); 
	              	 arrayMaker(bc1); arrayMaker(b16); 
	              	 clip2.setFramePosition(0);
	    			 clip2.start();
	          	       }
	          	else { 
	             	clip.setFramePosition(0);
	     			clip.start();
	              }}
	         
	         if(e.getSource() == b17) {
	             ShuffleAllower();
	         	
	         	arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
	         	arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
	         	arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); 
	         	arrayMaker(bc16);
	         	convertToString(array);   
	         	System.out.println( invCount);
	         	clip2.setFramePosition(0);
   			    clip2.start();
   			    b17.setEnabled(false);
	         	 /*while(isSolvable(array)==false) {
	         		   System.out.println("a");
	         		   shuffle();}*/
	         	   
	         	if(isSolvable(array)==false) {
	         		  System.out.println("b");
	         	  }
	        
	        }
	         if(e.getSource()== b18) {
		        	b17.setEnabled(true);
		        	}
	}

	 


	public void winning(int[][] array) {
	    
	    if  (array[0][0]==1 && array[0][1]==2 && array[0][2]==3  && array[0][3]==4  && array[1][0]==5  && array[1][1]==6 
	   		&&array[1][2]==7 && array[1][3]==8 && array[2][0]==9 && array[2][1]==10 && array[2][2]==11 && array[2][3]==12 && array[3][0]==13
	   		&&array[3][1]==14 && array[3][2]==15 && array[3][3]==0) {
	   	
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
				array[0][3] = Integer.parseInt(b.getText());
			}
		    
			if(b.getBounds().x == x5 && b.getBounds().y == y5 ) {
				array[1][0] = Integer.parseInt(b.getText());
			}
			
			if(b.getBounds().x == x6 && b.getBounds().y == y6 ) {
				array[1][1] = Integer.parseInt(b.getText());
			}
			
			if(b.getBounds().x == x7 && b.getBounds().y == y7 ) {
				array[1][2] = Integer.parseInt(b.getText());
			}
			
			if(b.getBounds().x == x8 && b.getBounds().y == y8 ) {
				array[1][3] = Integer.parseInt(b.getText());
			}
			
			if(b.getBounds().x == x9 && b.getBounds().y == y9 ) {
				array[2][0] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x10 && b.getBounds().y == y10 ) {
				array[2][1] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x11 && b.getBounds().y == y11 ) {
				array[2][2] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x12 && b.getBounds().y == y12 ) {
				array[2][3] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x13 && b.getBounds().y == y13 ) {
				array[3][0] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x14 && b.getBounds().y == y14 ) {
				array[3][1] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x15 && b.getBounds().y == y15 ) {
				array[3][2] = Integer.parseInt(b.getText());
			}
			if(b.getBounds().x == x16 && b.getBounds().y == y16 ) {
				array[3][3] = Integer.parseInt(b.getText());
			}
			
		 
		 }

	 
	 public void ShuffleAllower() {
			ShuffleConstant++; 
			
			 if(ShuffleConstant%4==1) {
				 bc1.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);  
				 bc8.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
				 
				 bc14.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
				 bc5.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
				  
				 bc9.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
				 bc13.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
				 
				 bc4.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
				 bc12.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
				 
				 bc3.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
				 bc11.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
				 
				 bc6.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
				 bc16.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
				 
				 bc7.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
				 bc15.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
				 
				 
				 bc2.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
				 bc10.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
				 
				 
				 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
			     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
			     arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); arrayMaker(bc16);
				 
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
				 bc1.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
				 bc12.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
				 
				 bc7.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
				 bc2.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
				 
				 bc4.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
				 bc5.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
				 
				 bc6.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
				 bc10.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
				 
				 bc9.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
				 bc15.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
				 
				 bc8.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
				 bc13.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
				 
				 bc3.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
				 bc14.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
				 
				 bc11.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
				 bc16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
				 
				 
				 
				 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
			     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
			     arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); arrayMaker(bc16);
				 
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
				 bc2.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
				 bc15.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
				 
				 
				 bc6.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
				 bc11.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
				 
				 
				 bc4.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
				 bc13.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
				 
				 
				 bc3.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
				 bc9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
				 
				 
				 bc5.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
				 bc12.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
				 
				 
				 bc8.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
				 bc14.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
				 
				 
				 bc7.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
				 bc10.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
				 
				 
				 bc1.setBounds(b16.getBounds().x,b16.getBounds().y,140,140); 
				 bc16.setBounds(b1.getBounds().x,b1.getBounds().y,140,140); 
				 
				 
				 
				 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
			     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
			     arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); arrayMaker(bc16);
			 
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
				 bc1.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
				 bc2.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
				 
				 
				 bc12.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
				 bc7.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
				 
				 
				 bc13.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
				 bc3.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
				 
				 
				 bc14.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
				 bc6.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
				 
				 
				 bc15.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
				 bc4.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
				 
				 
				 bc10.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
				 bc5.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
				 
				 
				 bc8.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
				 bc9.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
				 
				 
				 bc11.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);  
				 bc16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
				 
				 arrayMaker(bc1); arrayMaker(bc2); arrayMaker(bc3); arrayMaker(bc4); arrayMaker(bc5); 
			     arrayMaker(bc6); arrayMaker(bc7); arrayMaker(bc8); arrayMaker(bc9); arrayMaker(bc10);
			     arrayMaker(bc11); arrayMaker(bc12); arrayMaker(bc13); arrayMaker(bc14); arrayMaker(bc15); arrayMaker(bc16);
			 
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
		 point9 =  new Point(b9.getBounds().x,b9.getBounds().y);
		 point10 =  new Point(b10.getBounds().x,b10.getBounds().y);
		 point11=  new Point(b11.getBounds().x,b11.getBounds().y);
		 point12=  new Point(b12.getBounds().x,b12.getBounds().y);
		 point13 =  new Point(b13.getBounds().x,b13.getBounds().y);
		 point14=  new Point(b14.getBounds().x,b14.getBounds().y);
		 point15=  new Point(b15.getBounds().x,b15.getBounds().y);
		 point = new Point(b16.getBounds().x,b16.getBounds().y); //beware of this line
		 
		  
		  
		  
		  
		 if(ShuffleConstant%4==1) {
			 animate(b1,point8,140,1);
			 bc1.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
			 animate(b8,point1,140,1);
			 bc8.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
			 animate(b14,point5,140,1);
			 bc14.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
			 animate(b5,point14,140,1);
			 bc5.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
			 animate(b9,point13,140,1);
			 bc9.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
			 animate(b13,point9,140,1);
			 bc13.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
			 animate(b4,point12,140,1);
			 bc4.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
			 animate(b12,point4,140,1);
			 bc12.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
			 animate(b3,point11,140,1);
			 bc3.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
			 animate(b11,point3,140,1);
			 bc11.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
			 
			 animate(b7,point15,140,1);
			 bc7.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
			 animate(b15,point7,140,1);
			 bc15.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
			 animate(b2,point10,140,1);
			 bc2.setBounds(b10.getBounds().x,b14.getBounds().y,140,140);
			 animate(b10,point2,140,1);
			 bc10.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
			 animate(b6,point,140,1);
			 bc6.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
			 
			 b16.setBounds(b6.getBounds().x,b6.getBounds().y,140,140); 
			 bc16.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);}
		 
		 if(ShuffleConstant%4==2) {
			 animate(b1,point12,140,1);
			 bc1.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
			 animate(b12,point1,140,1);
			 bc12.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
			 animate(b7,point2,140,1);
			 bc7.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
			 animate(b2,point7,140,1);
			 bc2.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
			 animate(b4,point5,140,1);
			 bc4.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
			 animate(b5,point4,140,1);
			 bc5.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
			 animate(b6,point10,140,1);
			 bc6.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
			 animate(b10,point6,140,1);
			 bc10.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
			 animate(b9,point15,140,1);
			 bc9.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
			 animate(b15,point9,140,1);
			 bc15.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
			 animate(b8,point13,140,1);
			 bc8.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
			 animate(b13,point8,140,1);
			 bc13.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
			 animate(b3,point14,140,1);
			 bc3.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
			 animate(b14,point3,140,1);
			 bc14.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
			 animate(b11,point,140,1);
			 bc11.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
			 
			 b16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
			 bc16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);}
		 
		 
		 if(ShuffleConstant%4==3) {
			 animate(b2,point15,140,1);
			 bc2.setBounds(b15.getBounds().x,b15.getBounds().y,140,140);
			 animate(b15,point2,140,1);
			 bc15.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
			 animate(b6,point11,140,1);
			 bc6.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
			 animate(b11,point6,140,1);
			 bc11.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
			 animate(b4,point13,140,1);
			 bc4.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
			 animate(b13,point4,140,1);
			 bc13.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
			 animate(b3,point9,140,1);
			 bc3.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
			 animate(b9,point3,140,1);
			 bc9.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
			 animate(b5,point12,140,1);
			 bc5.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
			 animate(b12,point5,140,1);
			 bc12.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
			 animate(b8,point14,140,1);
			 bc8.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
			 animate(b14,point8,140,1);
			 bc14.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);			 
			 animate(b7,point10,140,1);
			 bc7.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
			 animate(b10,point7,140,1);
			 bc10.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
			 animate(b1,point,140,1);
			 bc1.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
			 
			 b16.setBounds(b1.getBounds().x,b1.getBounds().y,140,140); 
			 bc16.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
		 }
		 if(ShuffleConstant%4==0) {
			 animate(b1,point2,140,1);
			 bc1.setBounds(b2.getBounds().x,b2.getBounds().y,140,140);
			 animate(b2,point1,140,1);
			 bc2.setBounds(b1.getBounds().x,b1.getBounds().y,140,140);
			 animate(b12,point7,140,1);
			 bc12.setBounds(b7.getBounds().x,b7.getBounds().y,140,140);
			 animate(b7,point12,140,1);
			 bc7.setBounds(b12.getBounds().x,b12.getBounds().y,140,140);
			 animate(b13,point3,140,1);
			 bc13.setBounds(b3.getBounds().x,b3.getBounds().y,140,140);
			 animate(b3,point13,140,1);
			 bc3.setBounds(b13.getBounds().x,b13.getBounds().y,140,140);
			 animate(b14,point6,140,1);
			 bc14.setBounds(b6.getBounds().x,b6.getBounds().y,140,140);
			 animate(b6,point14,140,1);
			 bc6.setBounds(b14.getBounds().x,b14.getBounds().y,140,140);
			 animate(b15,point4,140,1);
			 bc15.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
			 animate(b4,point15,140,1);
			 bc4.setBounds(b4.getBounds().x,b4.getBounds().y,140,140);
			 animate(b10,point5,140,1);
			 bc10.setBounds(b5.getBounds().x,b5.getBounds().y,140,140);
			 animate(b5,point10,140,1);
			 bc5.setBounds(b10.getBounds().x,b10.getBounds().y,140,140);
			 animate(b8,point9,140,1);
			 bc8.setBounds(b9.getBounds().x,b9.getBounds().y,140,140);
			 animate(b9,point8,140,1);
			 bc9.setBounds(b8.getBounds().x,b8.getBounds().y,140,140);
		
			 animate(b11,point,140,1);
			 bc11.setBounds(b16.getBounds().x,b16.getBounds().y,140,140);
			 
			 b16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140); 
			 bc16.setBounds(b11.getBounds().x,b11.getBounds().y,140,140);
		 }
	   }

	 static int getInvCount(int[] arr)
	    {
	        int inv_count = 0;
	        for (int i = 0; i < N * N - 1; i++) {
	            for (int j = i + 1; j < N * N; j++) {
	                // count pairs(arr[i], arr[j]) such that
	                // i < j but arr[i] > arr[j]
	                if (arr[j] != 0 && arr[i] != 0
	                    && arr[i] > arr[j])
	                    inv_count++;
	            }
	        }
	        return inv_count;
	    }
	 
	    // find Position of blank from bottom
	    static int findXPosition(int[][] puzzle)
	    {
	        // start from bottom-right corner of matrix
	        for (int i = N - 1; i >= 0; i--)
	            for (int j = N - 1; j >= 0; j--)
	                if (puzzle[i][j] == 0)
	                    return N - i;
	        return -1;
	    }
	 
	    // This function returns true if given
	    // instance of N*N - 1 puzzle is solvable
	    static boolean isSolvable(int[][] puzzle)
	    {
	        // Count inversions in given puzzle
	        int[] arr = new int[N * N];
	        int k = 0;
	        for (int i = 0; i < N; i++)
	            for (int j = 0; j < N; j++)
	                arr[k++] = puzzle[i][j];
	 
	      invCount = getInvCount(arr);
	 
	        // If grid is odd, return true if inversion
	        // count is even.
	        if (N % 2 == 1)
	            return invCount % 2 == 0;
	        else // grid is even
	        {
	            int pos = findXPosition(puzzle);
	            if (pos % 2 == 1)
	                return invCount % 2 == 0;
	            else
	                return invCount % 2 == 1;
	        }
	    }
	 public static void convertToString(int arr[][]) 
	 { 

	     for (int n = 0 ; n < arr.length ; n++)
	     {
	         System.out.println(Arrays.toString(arr[n])); 
	     } 
	}// class
	}



