class AllInOneConst 
{ 
 int a,b; 
 AllInOneConst() 
 { 
 System.out.println(" default constructor"); 
 a=20; 
 b=30; 
 System.out.println("value of a="+a); 
 System.out.println("value of b="+b); 
 } 
 AllInOneConst(int x) 
 { 
 System.out.println("single parameterised constructor"); 
 a=x; 
 b=x; 
 System.out.println("value of a="+a); 
 System.out.println("value of b="+b); 
 } 
 AllInOneConst(int x,int y) 
 { 
 System.out.println("double parameterised constructor"); 
 a=x; 
 b=y; 
 System.out.println("value of a="+a); 
 System.out.println("value of b="+b); 
 } 
 AllInOneConst(AllInOneConst Ai) 
 { 
 System.out.println("object parameterised constructor"); 
 a=Ai.a; 
 b=Ai.b; 
 System.out.println("value of a="+a); 
 System.out.println("value of b="+b); 
 } 
} 
class AllInOneConstDemo
{ 
 public static void main(String [] args) 
 { 
 AllInOneConst Ai1= new AllInOneConst(); 
 AllInOneConst Ai2=new AllInOneConst(150); 
 AllInOneConst Ai3=new AllInOneConst(150,300); 
 AllInOneConst Ai4=new AllInOneConst(Ai3); 
 //AllInOneConst Ai4=new AllInOneConst(Ai2);
 } 
} 
