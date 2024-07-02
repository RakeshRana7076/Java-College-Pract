class Def
{
void Def()
{
int a,b,sum;
a=89;
b=76;
sum=a+b;
System.out.println("The sum of number is :"+sum);
}
void Def(int x,int y)
{
int a=x;
int b=y;
int mul=a*b;
System.out.println("The result is:"+mul);
}
}
class Demo
{
public static void main(String [] args)
{
Def d=new Def();
}

}