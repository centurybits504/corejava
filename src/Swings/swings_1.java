package Swings;

import java.awt.Color;

import javax.swing.*;  

 
public class swings_1 {

	JFrame f;  
	
	swings_1(){  
	      
	f=new JFrame();  
	          
	JButton b=new JButton("sai");  
	b.setBounds(100,10,60,30);  
	b.setBorder(BorderFactory.createBevelBorder(0,Color.CYAN, Color.CYAN));
	 
	 
	
	
	          
	f.add(b);  
	          
	f.setSize(400,500);  
	f.setLayout(null);  
	f.setVisible(true);
	
	}  
	  
	public static void main(String[] args) {  
	new swings_1();  
	}  
}
