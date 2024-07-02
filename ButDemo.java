import java.awt.*; 
import java.awt.event.*; 
class But extends Frame implements ActionListener
{ 
 Button b1,b2,b3,b4; 
 Label l1; 
 But() 
 { 
 setTitle("button example"); 
 setSize(200,200); 
 b1=new Button("ok"); 
 b2=new Button("cancel"); 
 b3=new Button("help"); 
 b4=new Button("exit"); 
 l1=new Label(); 
 l1.setAlignment(Label.CENTER); 
 add(b1,"North"); 
 add(b2,"South"); 
 add(b3,"East"); 
 add(b4,"West"); 
 add(l1); 
 b1.addActionListener(this); 
 b2.addActionListener(this); 
 b3.addActionListener(this); 
 b4.addActionListener(this); 
 setVisible(true); 
 } 
 public void actionPerformed(ActionEvent ae) 
 { 
 if (ae.getSource()==b1) 
 { 
 String lab=b1.getLabel(); 
 l1.setText(lab); 
 } 
 if (ae.getSource()==b2) 
 { 
 String lab=b2.getLabel(); 
 l1.setText(lab); 
 } 
 if (ae.getSource()==b3) 
 { 
 String lab=b3.getLabel(); 
 l1.setText(lab); 
 } 
 if (ae.getSource()==b4) 
 { 
 System.exit(0); 
 } 
 } 
} 
class ButDemo 
{ 
 public static void main(String[]args) 
 { 
 But bo=new But(); 
} 
} 

