abstract class Op
{
abstract void sum();
}
class Isum extends Op
{ 
int a,b,c;
void sum()
{
a=25;
b=35;
c=a+b;
System.out.println("The sum is ="+c);
}
}
class Fsum extends Isum
{
float f1,f2,f3;
void sum()
{
f1=2.5f;
f2=3.2f;
f3=f1+f2;
System.out.println("the float sum is ="+f3);
}
}
class AbDemo1
{
public static void main(String []args)
{
Op o=new Isum();
o.sum();
Op o1=new Fsum();
o1.sum();
}
}