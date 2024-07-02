class InheritanceEx1
{ 
 int a; 
 void disp() 
 { 
 System.out.println("display method of base class"); 
 } 
}// end ofinheritance1 base class
class DcInheritance1 extends InheritanceEx1
{ 
 int b; 
 void assign() 
 { 
 System.out.println("assign() of derived class"); 
 a=10; 
 b=20; 
 System.out.println("value of a from base class"+a); 
 System.out.println("value of b from derived class"+b); 
 } 
 void show() 
 { 
 System.out.println("show () from derived special"); 
 } 
 
}//end of DcInheritance1 derived class
class InheritanceEx1Demo
{ 
 public static void main(String[]args) 
 { 
 System.out.println("with respect to derived class"); 
 DcInheritance1 d=new DcInheritance1(); 
 d.disp(); 
 d.assign(); 
 d.show(); 
 System.out.println("with respect to base class"); 
 InheritanceEx1 i=new InheritanceEx1(); 
 i.disp(); 
 //i.assign(); invalid because assign isnt exist in base class
 //i.show();invalid because show isnt exist in base class
 } 
} 
