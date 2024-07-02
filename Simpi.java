class Simpi
{
public static void main(String[] args)
{
int choice=Integer.parseInt(args[0]);
switch(choice)
{
case 1:
{
float p,r,t,si;
p=24000.0f;
r=23.0f;
t=7.0f;
si=(p*r*t)/100;
System.out.println("The Simple Interest is :"+si);
break;
}
case 2:
{
int a=19;
System.out.println("The age is :"+a);
if(a>=18)
{
System.out.print("You are elligible for voting");
}
else
{
System.out.print("you are not elligiblr for voting");
}
break;
}
default :
{
System.out.println("Wrong input");
break;
}

}
}
}