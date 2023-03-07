import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GUI extends JFrame implements ActionListener, ChangeListener{
	
	    ImageIcon image; 
		JButton button;
		JLabel label,title,title2,title3,main;
		JCheckBox checkBox;
		JComboBox comboBox;
		JSlider slider;
		JRadioButton Button1, Button2, Button3,Button4;
		JPanel e;
		
		public static int weather = 0;
		public static int direction = 0;
		public static int activity = 0;
		public static int Life = 0;
		
		public static String [] southBeach ={"Dubrovnik,Croatia", "Santorini, Greece", "Sveti Stefan, Montenegro","Varna, Bulgaria"};
		public static String [] southOnly = {"Kastoria,Greece","Bitola, North Macedonia","Belgrade, Serbia","Sofia, Bulgaria"};
		public static String [] eastOnly = {"Warsaw, Poland","Tallinn,Estonia","Vilnius, Lithuania","Riga, Latvia"};
		public static String [] eastbeach = {"Kołobrzeg, Poland","Pobierowo, Poland","Gdańsk, Poland","Gdynia, Poland"};
	    public static String [] westBeach = {"Toulon, France","Nice, France", "Antibes, France","Cannes, France"};
		public static String [] westOnly = {"Paris, France","Munich, Germany", "Rome, Italy","Milan, Italy"};	
		public static String [] northOnly = {"Reykjavík, Iceland","Edinburgh, Scotland", "Oslo, Norway", "Stockholm, Sweeden"};
	    public static String [] northBeach = {"Hastings, UK","Brighton, UK", "Bournemouth, UK", "Felixstowe, UK"};
		
	    public static String [] southBeachLinks = {"https://www.hotels.com/de11117195/hotels-dubrovnik-and-vicinity-croatia/", 
				                                    "https://www.hotels.com/de1638845/hotels-santorini-greece/",
				                                    "https://www.hotels.com/de1695406/hotels-sveti-stefan-montenegro/",
				                                    "https://www.hotels.com/de106751/hotels-varna-bulgaria/"};
		
		public static String [] southOnlyLinks = {"https://www.hotels.com/de591413/hotels-kastoria-greece/",
													"https://www.hotels.com/de864484/hotels-bitola-north-macedonia/",
													  "https://www.hotels.com/de1605942/hotels-belgrade-serbia/",
													     "https://www.hotels.com/de105012/hotels-sofia-bulgaria/"};
		
		public static String [] eastOnlyLinks = {"https://www.hotels.com/de1036999/hotels-warsaw-poland/",
													"https://www.hotels.com/de1644851/hotels-tallinn-and-vicinity-estonia/",
													  "https://www.hotels.com/de1644852/hotels-vilnius-and-vicinity-lithuania/",    
													    	"https://www.hotels.com/de805270/hotels-riga-latvia/"};
								
		public static String [] eastBeachLinks = {"https://www.hotels.com/de1037308/hotels-kolobrzeg-poland/",			
													"https://www.hotels.com/de1032900/hotels-pobierowo-poland/",
													"https://www.hotels.com/de1028414/hotels-gdansk-poland/",
													  "https://www.hotels.com/de1041863/hotels-gdynia-poland/"};
		
		public static String [] westBeachLinks = {"https://www.hotels.com/de543279/hotels-toulon-france/",
												  "https://www.hotels.com/nh1735376/hotels-in-nice-city-centre-nice-france/",									
												   "https://www.hotels.com/de1634386/hotels-antibes-france/",
												 "https://www.hotels.com/de1644378/hotels-cannes-and-vicinity-france/"};		
		
		public static String [] westOnlyLinks = {"https://www.hotels.com/de504261/hotels-paris-france/",
												"https://www.hotels.com/de384011/hotels-munich-germany/",
												"https://www.hotels.com/de712491/hotels-rome-italy/",			
												"https://www.hotels.com/de712492/hotels-milan-italy/"};
		
		public static String [] northOnlyLinks = {"https://www.hotels.com/de1641520/hotels-reykjavik-and-vicinity-iceland/",
													"https://www.hotels.com/de554344/hotels-edinburgh-united-kingdom/",
													"https://www.hotels.com/de939302/hotels-oslo-norway/",
													"https://www.hotels.com/de1704892/hotels-near-central-stockholm-stockholm-sweden/"};
	
		public static String [] northBeachLinks = {"https://www.hotels.com/de553391/hotels-hastings-united-kingdom/",
													"https://www.hotels.com/de556383/hotels-brighton-united-kingdom/",		
													"https://www.hotels.com/de544256/hotels-bournemouth-united-kingdom/",
													"https://www.hotels.com/de544879/hotels-felixstowe-united-kingdom/"	};
	   
		public GUI(){
		   
	    	image = new ImageIcon("/Users/sotirisemmanouil/git/repository4/TravelRecommend/src/image.jpg");
			label = new JLabel(image);
		    label.setBounds(300,100,300,300);
			label.setVisible(true);
			
			main = new JLabel("Welcome! Enter your preferances below:");
			main.setBounds(100, 10, 500, 100); 
			main.setFont(new Font("Times New Roman",Font.PLAIN,30));
			main.setLayout(null);
			
			title = new JLabel("Select activity:");
			title.setBounds(100, 275, 100, 200);  
			title.setLayout(null);
			
			title2 = new JLabel("Area of Europe:");
			title2.setBounds(90,175,180,50);
			title2.setLayout(null);
			
			title3 = new JLabel("Select preferred temperature (C):");
			title3.setBounds(50,80,210,50);
			title3.setLayout(null);
			 
			slider = new JSlider(25,40,30);
			slider.setBounds(50,50,200,200);
			slider.setLayout(null);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(1);
			slider.setPaintTrack(true);
			slider.setMajorTickSpacing(5);
			slider.setPaintLabels(true);
			slider.setFont(new Font("Times New Roman",Font.PLAIN,15));
			slider.setOrientation(SwingConstants.HORIZONTAL);
			slider.addChangeListener(this);
			e = new JPanel();
			e.add(slider);
			e.add(label);
			
			button = new JButton();
			button.setBounds(500, 500, 100, 100); 
			button.addActionListener(this);
			button.setText("Enter");
			button.setFocusable(false);
			button.setHorizontalTextPosition(JButton.CENTER);
			button.setVerticalTextPosition(JButton.BOTTOM);
			button.setFont(new Font("Times New Roman",Font.PLAIN,25));
			button.setIconTextGap(-15);
			button.setForeground(Color.black);
			button.setBackground(Color.lightGray);
			button.setBorder(BorderFactory.createEtchedBorder());
			
			String[] activities = {"Beach","Sightseeing","Both"};
			  
			comboBox = new JComboBox(activities);
			comboBox.setBounds(150, 320, 100, 170); 
			comboBox.addActionListener(this);
			
			 Button1 = new JRadioButton("Eastern");
			 Button1.setBounds(150,200,90,50);
			 Button1.setLayout(null);
			 
			 Button2 = new JRadioButton("Western");
			 Button2.setBounds(150,240,90,50);
			 Button2.setLayout(null);
			 
			 Button3 = new JRadioButton("Southern");
			 Button3.setBounds(150,280,90,50);
			 Button3.setLayout(null);
			 Button3.addActionListener(this);
			 
			 Button4 = new JRadioButton("Northern");
			 Button4.setBounds(150,320,90,50);
			 Button4.setLayout(null);
			 Button4.addActionListener(this);
			  
			 ButtonGroup group1 = new ButtonGroup();
			 group1.add(Button1);
			 group1.add(Button2);
			 group1.add(Button3);
			 group1.add(Button4);
			  
			 Button1.addActionListener(this);
			 Button2.addActionListener(this);
			
			checkBox = new JCheckBox();
			checkBox.setBounds(150,450,100,50);			// 1, goes right, 2, goes down, 3,length, 4 width 
			checkBox.setText("Human?");
			checkBox.setFocusable(false);
			checkBox.setFont(new Font("Consolas",Font.PLAIN,10));
			checkBox.addActionListener(this);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			this.setSize(700,700);
			this.setTitle("Summer Travel Recommender");
			this.add(Button1);
			this.add(main);
			this.add(Button2);
			this.add(Button3);
			this.add(Button4);
			this.add(button);
			this.add(checkBox);	
			this.add(title); 
			this.add(title2);
			this.add(title3);
			this.add(comboBox);
			this.add(slider);
			this.add(label);
			this.add(e);
			this.setVisible(true);
	    }

	    
		@Override
		public void actionPerformed(ActionEvent e) {
		
			    if (e.getSource()==Button1) {	
			    	direction = 1;	
			    										//east 
			      }		
			    else if(e.getSource()== Button2) {		//west
				  direction = 2;
					
				  }
			    else if(e.getSource()==Button3) {		//south 
				  direction = 3;
				 	
				  }
			    else if(e.getSource()==Button4) {		//north
				  direction = 4;
				 	
				  }
			 
			    else if(e.getSource()==checkBox) {		//night life yes
				  Life = 1;
				  
				  }
			
			    else if(((String) comboBox.getSelectedItem()).contentEquals("Beach"))	{
					activity = 1;
					
				}
			    else if(((String) comboBox.getSelectedItem()).contentEquals("Sightseeing")) {
				 	activity = 2;
				 
			 	}
			    else  if(((String) comboBox.getSelectedItem()).contentEquals("Both")) {
				    activity = 3;
				    
				}
			 
			    if(e.getSource()==button) {
				
			     if(activity == 0 || (direction == 0 && weather == 0 || Life == 0)) {
					JOptionPane.showMessageDialog(null,"Not all values have been filled!");
				}
				
				//west, hot weather, beach
				else if(activity == 1 && direction == 2 && Life == 1 && weather == 2) {
					      newGUI gui2 = new newGUI(westBeach,westBeachLinks);
				}
				//west, cooler weather, beach
				else if(activity == 1 && direction == 2 && Life == 1 && weather == 1) {
				           newGUI gui2 = new newGUI(westBeach,westBeachLinks);
					}
				//west, hot weather, sight-seeing
				else if(activity == 2 && direction == 2 && Life == 1 && weather == 2) {
				            newGUI gui2 = new newGUI(westOnly,westOnlyLinks);
					}
				//west, cooler weather, sight-seeing
				else if(activity == 2 && direction == 2 && Life == 1 && weather == 1) {
		            newGUI gui2 = new newGUI(westOnly,westOnlyLinks);
			    }
				//west, hot weather, both
				else if(activity == 3 && direction == 2 && Life == 1 && weather == 2) {
		            newGUI gui2 = new newGUI(westBeach,westBeachLinks);
			     }
				//west, cool weather, both
				else if(activity == 3 && direction == 2 && Life == 1 && weather == 1) {
		            newGUI gui2 = new newGUI(westBeach,westBeachLinks);
			     }
				
				
				
				//south, beach, warm weather 
				else if(activity == 1 && direction == 3 && Life == 1 && weather == 2) {
					   newGUI gui2 = new newGUI(southBeach,southBeachLinks);
				} 
				//south, beach, cold weather 
				else if(activity == 1 && direction == 3 && Life == 1 && weather == 1) {
					    JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				} 
				// south, sight-seeing, cooler
				else if(activity == 2 && direction == 3 && Life == 1 && weather == 1) {
						newGUI gui2 = new newGUI(southOnly,southOnlyLinks);
				}
				//south, both, hot
				else if(activity == 3 && direction == 3 && Life == 1 && weather == 2) {
					newGUI gui2 = new newGUI(southBeach,southBeachLinks);
			    }
				//south, sight-seeing, warm
				else if(activity == 2 && direction == 3 && Life == 1 && weather == 2) {
					    newGUI gui2 = new newGUI(southBeach,southBeachLinks);
				}
				//south, both, cooler
				else if(activity == 3 && direction == 3 && Life == 1 && weather == 1) {
				    newGUI gui2 = new newGUI(southBeach,southBeachLinks);
			     }
	
			
				
				
				//north,beach, cold
				else if(activity == 1 && direction == 4 && Life == 1 && weather == 1) {
						 newGUI gui2 = new newGUI(northBeach,northBeachLinks);
				}	
				//north beach, warm
				else if(activity == 1 && direction == 4 && Life == 1 && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}
				//north, sight-seeing, cold
				else if(activity == 2 && direction == 4 && Life == 1 && weather == 1) {
								newGUI gui2 = new newGUI(northOnly,northOnlyLinks);
			     }	
				//north, sight-seeing, warm
				else if(activity == 2 && direction == 4 && Life == 1 && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}	
				
				//north, both, warm
				else if(activity == 3 && direction == 4 && Life == 1 && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}
				//north, both, cold
				else if(activity == 3 && direction == 4 && Life == 1 && weather == 1) {
									newGUI gui2 = new newGUI(northBeach,northBeachLinks);
				}
				
				
				//east,beach,cold
				else if(activity == 1 && direction == 1 && Life == 1 && weather == 1) {
						 newGUI gui3 = new newGUI(eastbeach,eastBeachLinks);
				}	
				//east, beach, warm
				else if(activity == 1 && direction == 1 && Life == 1 && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}
				//east, sight-seeing, cold
				else if(activity == 2 && direction == 1 && Life == 1 && weather == 1) {
								newGUI gui2 = new newGUI(eastOnly,eastOnlyLinks);
			     }	
				//east, sight-seeing, warm
				else if(activity == 2 && direction == 1 && Life == 1  && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}	
				
				//east, both, warm
				else if(activity == 3 && direction == 1 && Life == 1 && weather == 2) {
					JOptionPane.showMessageDialog(null,"Temperature does not match region!");
				}
				//east, both, cold
				else if(activity == 3 && direction == 1 && Life == 1 && weather == 1) {
							newGUI gui2 = new newGUI(eastbeach,eastBeachLinks);
				
				}
			 }
		}
					 
			 

		@Override
		public void stateChanged(ChangeEvent e) {
			if( 25 <= slider.getValue() && slider.getValue() <= 30) {
							weather = 1;
					
					
				}
			else if(31 <= slider.getValue() && slider.getValue() <= 40) {
							weather = 2;
						
						
			}
		}
			
	}

