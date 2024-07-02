class Def
{
Def()
{
int a,b,sum;
a=89;
b=76;
sum=a+b;
System.out.println("The sum of number is :"+sum);
}
Def(int x,int y)
{
int mul=x*y;
System.out.println("The result is:"+mul);
}
}
class Demo
{
public static void main(String[] args)
{
Def d=new Def();
Def d1=new Def(56,24);
}
}