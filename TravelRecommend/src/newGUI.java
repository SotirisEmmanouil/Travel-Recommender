import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class newGUI extends JFrame implements ActionListener {

	public static JTextArea result;
	JButton buttone,buttone2,buttone3,buttone4;
	public static String [] emptyAr = {};
	JLabel label;
	Desktop desk = Desktop.getDesktop();		//allows desktop control
	
	
  public newGUI(String [] arr, String [] arr2){		//GUI
	  	result = new JTextArea("Your recommendations:\n\n");
	  	result.setFont(new Font("Arial",Font.BOLD,20));
	  	result.setForeground(Color.BLUE);
	  	result.setEditable(false);
	  	result.setBackground(getForeground());
	  	result.setVisible(true); 
	  	result.setSize(300,300);
	  	result.setLayout(null);
	  	
	  	for(int i =0; i<arr.length; i++) {	//append the recommendations to the left hand side of the GUI
	  		result.append(arr[i]);
	  		result.append("\n\n"); 
	  			}	
	  
	    label = new JLabel();
	    label.setBounds(150, 250, 100, 100);
		label.setVisible(false);
		
		buttone = new JButton();
		buttone.setBounds(500, 50, 150, 50); 
		buttone.setText(arr[0]);
		buttone.addActionListener(this);
		buttone.setFocusable(false);
		buttone.setHorizontalTextPosition(JButton.CENTER);
		buttone.setVerticalTextPosition(JButton.BOTTOM);
		buttone.setFont(new Font("Times New Roman",Font.PLAIN,15));
		buttone.setIconTextGap(-15);
		buttone.setForeground(Color.black);
		buttone.setBackground(Color.lightGray);
		buttone.setBorder(BorderFactory.createEtchedBorder());
		buttone.setBackground(Color.RED);
		buttone.setOpaque(true);
		
		buttone2 = new JButton();
		buttone2.setBounds(500, 100, 150, 50); 
		buttone2.setText(arr[1]);
		buttone2.addActionListener(this);
		buttone2.setFocusable(false);
		buttone2.setHorizontalTextPosition(JButton.CENTER);		//creates button 
		buttone2.setVerticalTextPosition(JButton.BOTTOM);
		buttone2.setFont(new Font("Times New Roman",Font.PLAIN,15));
		buttone2.setIconTextGap(-15);
		buttone2.setForeground(Color.black);
		buttone2.setBackground(Color.lightGray);
		buttone2.setBorder(BorderFactory.createEtchedBorder());
		buttone2.setBackground(Color.BLUE);
		buttone2.setOpaque(true);
		
		buttone3 = new JButton();
		buttone3.setBounds(500, 150, 150, 50); 
		buttone3.setText(arr[2]);
		buttone3.addActionListener(this);
		buttone3.setFocusable(false);
		buttone3.setHorizontalTextPosition(JButton.CENTER);
		buttone3.setVerticalTextPosition(JButton.BOTTOM);
		buttone3.setFont(new Font("Times New Roman",Font.PLAIN,15));
		buttone3.setIconTextGap(-15);
		buttone3.setForeground(Color.black);
		buttone3.setBackground(Color.lightGray);
		buttone3.setBorder(BorderFactory.createEtchedBorder());
		buttone3.setBackground(Color.GREEN);
		buttone3.setOpaque(true);
		
		buttone4 = new JButton();
		buttone4.setBounds(500, 200, 150, 50); 
		buttone4.setText(arr[3]);
		buttone4.addActionListener(this);
		buttone4.setFocusable(false);
		buttone4.setHorizontalTextPosition(JButton.CENTER);
		buttone4.setVerticalTextPosition(JButton.BOTTOM);
		buttone4.setFont(new Font("Times New Roman",Font.PLAIN,15));
		buttone4.setIconTextGap(-15);
		buttone4.setForeground(Color.black);
		buttone4.setBackground(Color.lightGray);
		buttone4.setBorder(BorderFactory.createEtchedBorder());
		buttone4.setBackground(Color.ORANGE);
		buttone4.setOpaque(true);
		
	  	
		emptyAr = arr2.clone();
	  	
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,400);
		this.setTitle("Results!");
		this.add(result);
		this.setLayout(null);
		this.add(buttone);
		this.add(buttone2);
		this.add(buttone3);
		this.add(buttone4);
		this.setVisible(true);
		
	}
  
  public void actionPerformed(ActionEvent event) {		
	  
	 if(event.getSource()==buttone) {
	//opens the link that is located in the first entry in the array
	     try {
			desk.browse(new URI(emptyAr[0]));		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 	}
 if(event.getSource()==buttone2) {
		 
	     try {
			desk.browse(new URI(emptyAr[1]));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
 }
 if(event.getSource()==buttone3) {
	 
     try {
		desk.browse(new URI(emptyAr[2]));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
  
 }
 
 if(event.getSource()==buttone4) {
	 
     try {
		desk.browse(new URI(emptyAr[3]));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
  
      }
 
  }
 
}
