
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.IOException;
import javax.sound.sampled.*;

public class Game implements ActionListener, ChangeListener {
	public JFrame frame = new JFrame("Sliding Puzzle"); 
	JLabel label;
	JButton buttonGame; JButton backGame; JButton buttonOptions; JButton backOptions; JButton easyButton; JButton mediumButton; JButton hardButton; JButton backEasy; 
	JButton backMedium; JButton backHard; JButton ExitMenu; JButton buttonCredits;
	CardLayout card ;
	JPanel plane; JPanel planeMenu;  JPanel planeGame; JPanel planeOptions; JPanel planeEasy; JPanel planeMedium; JPanel planeHard; JPanel planeCredits;
	JSlider SoundSlider;
	File music; File page;
	Clip clip;  Clip clip2;
	FloatControl gainControl;
	AudioInputStream stream;
	Image image;
	JButton backCredits;
	
	
	
	public Game() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		 
	ImageIcon logoIcon = new ImageIcon("arka2.jpg");
	 frame.setIconImage(logoIcon.getImage());
	 
	 planeMenu = new Menu();
	 planeGame = new GameMenu();
	 planeOptions = new OptionsMenu();
	 plane = new JPanel();
	 planeEasy = new EasyMenu();
	 planeMedium = new MediumMenu();
	 planeHard = new HardMenu(); 
	 planeCredits = new CreditsMenu();		 
	 
	 planeMenu.setLayout(null);
	 planeGame.setLayout(null);
	 planeOptions.setLayout(null);
	 planeEasy.setLayout(null);
	 planeMedium.setLayout(null);
	 planeHard.setLayout(null);
	 planeCredits.setLayout(null);
	 
	 music = new File("Music.wav");
	 stream = AudioSystem.getAudioInputStream(music);
     clip = AudioSystem.getClip();
	 clip.open(stream);
	 gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	 clip.loop(999999);
	 
	 page = new File("page.wav");
	 AudioInputStream stream1 = AudioSystem.getAudioInputStream(page);
	 clip2 = AudioSystem.getClip();
	 clip2.open(stream1);
	 
	 
	 
	 SoundSlider = new JSlider(0,100,100);
	 SoundSlider.setPreferredSize(new Dimension(400,200));
	 SoundSlider.setPaintTrack(true);
	 SoundSlider.setMajorTickSpacing(20);
	 SoundSlider.setPaintLabels(true);
	 SoundSlider.setBounds(1000,100,800,30);
	 SoundSlider.setBackground(Color.yellow);
	 SoundSlider.setForeground(Color.WHITE);
	 SoundSlider.addChangeListener(this);
	
	  
		 
	 label = new JLabel();
	 label.setText("SOUND");
	 label.setFont(new Font("TimesRoman", Font.ITALIC, 40));
	 label.setBounds(650,60,1050,30);
	 
	 buttonGame = new JButton("New game");
	 backGame = new JButton("Back");
	 buttonOptions = new JButton("Options");
	 backOptions = new JButton("Back");
	 easyButton = new JButton("Easy");
	 mediumButton = new JButton("Medium");
	 hardButton = new JButton("Hard");
	 backEasy = new JButton("Back");
	 backMedium = new JButton("Back");
	 backHard = new JButton("Back");
	 ExitMenu = new JButton("Quit");
	 buttonCredits = new JButton("Credits");
	 backCredits = new JButton("Back");
	 
	 buttonGame.addActionListener(this);
	 backGame.addActionListener(this);
	 buttonOptions.addActionListener(this);
	 backOptions.addActionListener(this);
	 easyButton.addActionListener(this);
	 mediumButton.addActionListener(this);
	 hardButton.addActionListener(this);
	 backEasy.addActionListener(this);
	 backMedium.addActionListener(this);
	 backHard.addActionListener(this);
	 ExitMenu.addActionListener(this);
	 buttonCredits.addActionListener(this);
	 backCredits.addActionListener(this);
	 
	 buttonGame.setBounds(50,540,300,40);
	 buttonOptions.setBounds(50,590,300,40);
	 buttonCredits.setBounds(50,640,300,40);
	 ExitMenu.setBounds(50,690,300,40);
	 backGame.setBounds(50,50,100,20);
	 backOptions.setBounds(50,50,100,20);
	 easyButton.setBounds(1300,100,200,40);
	 mediumButton.setBounds(1300,160,200,40);
	 hardButton.setBounds(1300,220,200,40);
	 backEasy.setBounds(50,50,100,20);
	 backMedium.setBounds(50,50,100,20);
	 backHard.setBounds(50,50,100,20);	
	 backCredits.setBounds(50,50,100,20);
	 
	 ImageIcon icon0 = new ImageIcon("mesa.jpeg");
	 buttonCredits.setText("Credits");
	 buttonCredits.setIcon(icon0);
	 buttonCredits.setHorizontalTextPosition(JButton.CENTER);
	 buttonCredits.setVerticalTextPosition(JButton.CENTER);
	 buttonCredits.setForeground(Color.black);
	 buttonCredits.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon = new ImageIcon("mesa.jpeg");
	 buttonGame.setText("New Game");
	 buttonGame.setIcon(icon);
	 buttonGame.setHorizontalTextPosition(JButton.CENTER);
	 buttonGame.setVerticalTextPosition(JButton.CENTER);
	 buttonGame.setForeground(Color.black);
	 buttonGame.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 
	 ImageIcon icon1 = new ImageIcon("mesa.jpeg");
	 buttonOptions.setText("Options");
	 buttonOptions.setIcon(icon1);
	 buttonOptions.setHorizontalTextPosition(JButton.CENTER);
	 buttonOptions.setVerticalTextPosition(JButton.CENTER);
	 buttonOptions.setForeground(Color.black);
	 buttonOptions.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon2 = new ImageIcon("mesa.jpeg");
	 ExitMenu.setText("Quit");
	 ExitMenu.setIcon(icon2);
	 ExitMenu.setHorizontalTextPosition(JButton.CENTER);
	 ExitMenu.setVerticalTextPosition(JButton.CENTER);
	 ExitMenu.setForeground(Color.black);
	 ExitMenu.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon3 = new ImageIcon("sayfa.png");
	 backGame.setText("Back");
	 backGame.setIcon(icon3);
	 backGame.setHorizontalTextPosition(JButton.CENTER);
	 backGame.setVerticalTextPosition(JButton.CENTER);
	 backGame.setForeground(Color.black);
	 backGame.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon4 = new ImageIcon("sayfa.png");
	 backOptions.setText("Back");
	 backOptions.setIcon(icon4);
	 backOptions.setHorizontalTextPosition(JButton.CENTER);
	 backOptions.setVerticalTextPosition(JButton.CENTER);
	 backOptions.setForeground(Color.black);
	 backOptions.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon5 = new ImageIcon("sayfa.png");
	 easyButton.setText("Easy");
	 easyButton.setIcon(icon5);
	 easyButton.setHorizontalTextPosition(JButton.CENTER);
	 easyButton.setVerticalTextPosition(JButton.CENTER);
	 easyButton.setForeground(Color.black);
	 easyButton.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon6 = new ImageIcon("sayfa.png");
	 mediumButton.setText("Medium");
	 mediumButton.setIcon(icon6);
	 mediumButton.setHorizontalTextPosition(JButton.CENTER);
	 mediumButton.setVerticalTextPosition(JButton.CENTER);
	 mediumButton.setForeground(Color.black);
	 mediumButton.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon7 = new ImageIcon("sayfa.png");
	 hardButton.setText("Hard");
	 hardButton.setIcon(icon7);
	 hardButton.setHorizontalTextPosition(JButton.CENTER);
	 hardButton.setVerticalTextPosition(JButton.CENTER);
	 hardButton.setForeground(Color.black);
	 hardButton.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon8 = new ImageIcon("sayfa.png");
	 backEasy.setText("Back");
	 backEasy.setIcon(icon8);
	 backEasy.setHorizontalTextPosition(JButton.CENTER);
	 backEasy.setVerticalTextPosition(JButton.CENTER);
	 backEasy.setForeground(Color.black);
	 backEasy.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon9 = new ImageIcon("sayfa.png");
	 backMedium.setText("Back");
	 backMedium.setIcon(icon9);
	 backMedium.setHorizontalTextPosition(JButton.CENTER);
	 backMedium.setVerticalTextPosition(JButton.CENTER);
	 backMedium.setForeground(Color.black);
	 backMedium.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon10 = new ImageIcon("sayfa.png");
	 backHard.setText("Back");
	 backHard.setIcon(icon10);
	 backHard.setHorizontalTextPosition(JButton.CENTER);
	 backHard.setVerticalTextPosition(JButton.CENTER);
	 backHard.setForeground(Color.black);
	 backHard.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 ImageIcon icon11 = new ImageIcon("sayfa.png");
	 backCredits.setText("Back");
	 backCredits.setIcon(icon10);
	 backCredits.setHorizontalTextPosition(JButton.CENTER);
	 backCredits.setVerticalTextPosition(JButton.CENTER);
	 backCredits.setForeground(Color.black);
	 backCredits.setFont(new Font("Serif",Font.ITALIC,20));
	 
	 
     
	 
	 planeCredits.add(backCredits);
	 planeMenu.add(buttonGame);
	 planeMenu.add(buttonOptions);
	 planeMenu.add(ExitMenu);
	 planeMenu.add(buttonCredits);
	 planeGame.add(backGame);
	 planeOptions.add(backOptions);
	 planeOptions.add(SoundSlider);
	 planeOptions.add(label);
	 planeGame.add(easyButton);
	 planeGame.add(mediumButton);
	 planeGame.add(hardButton);
	 planeEasy.add(backEasy);
	 planeMedium.add(backMedium);
	 planeHard.add(backHard);
	
	 card = new CardLayout();
	 plane.setLayout(card);
	 
	 plane.add(planeCredits,"0");
	 plane.add(planeMenu,"1");
	 plane.add(planeGame,"2");
	 plane.add(planeOptions,"3");
	 plane.add(planeEasy,"4");
	 plane.add(planeMedium,"5");
	 plane.add(planeHard,"6");
	 
	 card.show(plane, "1");
	 	 
	 frame.add(plane);
	 
	 frame.setSize(750,750);	 
	 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	 frame.setUndecorated(true);
	 frame.setVisible(true);	
	 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	 
	 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== buttonGame) {
			card.show(plane,"2");
			clip2.setFramePosition(0);
			clip2.start();
			
		}
		if (e.getSource()== backGame) {
			card.show(plane,"1");
			clip2.setFramePosition(0);
			clip2.start();
		}
		 if (e.getSource()== buttonOptions) {
			card.show(plane,"3");
			clip2.setFramePosition(0);
			clip2.start();
	}
		 if(e.getSource()== backOptions) {
			 card.show(plane, "1");
			 clip2.setFramePosition(0);
		     clip2.start();
		 }
		 if(e.getSource()== easyButton) {
			 card.show(plane, "4");
			 clip2.setFramePosition(0);
			 clip2.start();
		 }
		 if(e.getSource()== mediumButton) {
			 card.show(plane, "5");
			 clip2.setFramePosition(0);
			 clip2.start(); 
		 }
		 if(e.getSource()== hardButton) {
			 card.show(plane,"6");
			 clip2.setFramePosition(0);
			 clip2.start();
		 }
		 if(e.getSource()== backEasy) {
			 card.show(plane, "2");
			 clip2.setFramePosition(0);
			 clip2.start();
		 }
		 if(e.getSource()== backMedium) {
			 card.show(plane, "2");
			 clip2.setFramePosition(0);
			 clip2.start();
		 }
		 if(e.getSource()== backHard) {
			 card.show(plane, "2");
			 clip2.setFramePosition(0);
			 clip2.start();
		}        
		if(e.getSource()==ExitMenu) {
			frame.dispose();
			clip.stop();
		}
		if(e.getSource()== buttonCredits) {
			card.show(plane,"0");
			clip2.setFramePosition(0);
			clip2.start();
		}
	   if(e.getSource()== backCredits) {
		   card.show(plane,"1");
		   clip2.setFramePosition(0);
		   clip2.start();
	   }
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()== SoundSlider) {
			gainControl.setValue((float) ((-1)*(100-SoundSlider.getValue())/1.5));
		}
		
	}
	
}//class
