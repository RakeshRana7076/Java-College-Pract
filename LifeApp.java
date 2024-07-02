import java.applet.Applet; 
import java.awt.*; 
/*<applet code="LifeApp"height=500 width=500>
</applet> */
public class LifeApp extends Applet
{ 
 String s=""; 
 public void init() 
 {   
 s=s+""; 
 } 
 public void start() 
 { 
 s=s+"start"; 
 } 
 public void stop() 
 { 
 s=s+"stop"; 
 } 
 public void destroy() 
 { 
 s=s+"destroy"; 
 } 
 public void paint(Graphics g) 
 { 
 Font f=new Font("arial", Font.BOLD,25); 
 g.setFont(f); 
 g.drawString(s,100,100); 
 } 
} 


