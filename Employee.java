package dhsgsu.dcsa; 
import ns.NsalException; 
import ps.PsalException; 
public class Employee
{ 
 public static void decideSal(String s) throws NsalException,PsalException,NumberFormatException
 { 
 int sal=Integer.parseInt(s); 
 if(sal<0) 
 { 
 NsalException nse=new NsalException("invalid salary"); 
 throw(nse); 
 } 
 else
 { 
 
 PsalException pse=new PsalException("valid salary"); 
 throw(pse); 
 } 
 } 
}