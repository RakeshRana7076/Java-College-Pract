import java.awt.GraphicsEnvironment; 
class Fonts
{ 
 public static void main(String[] args) 
 { 
 GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment(); 
 String s []=ge.getAvailableFontFamilyNames(); 
 System.out.println("total number of fonts="+s.length); 
 for(int i=0;i<s.length;i++) 
 { 
 System.out.println(s[i]); 
 } 
 } 
} 