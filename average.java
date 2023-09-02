import java.io.*;
import java.util.Scanner;
class average
{
public static void main(String args[])
{
String SN;
int s1,s2,s3,s4,s5;
double a;
System.out.println("enter your Name: ");
Scanner sh=new Scanner(System.in);
SN=sh.nextLine();
System.out.println("Enter your Subject 1 Mark: ");
s1=sh.nextInt();
System.out.println("Enter your Subject 2 Mark: ");
s2=sh.nextInt();
System.out.println("Enter your Subject 3 Mark: ");
s3=sh.nextInt();
System.out.println("Enter your Subject 4 Mark: ");
s4=sh.nextInt();
System.out.println("Enter your Subject 5 Mark: ");
s5=sh.nextInt();
if(s1>50 && s2>50 && s3>50 && s4>50 && s5>50)
{
a=(s1+s2+s3+s4+s5)/5;
if(a>=90)
{
System.out.println("Your Grade = S");
}
else if(a>=81 && a<90)
{
System.out.println("Your Grade = A");
}
else if(a>=71 && a<=80)
{
System.out.println("Your Grade = B");
}
else if(a>=61 && a<=70)
{
System.out.println("Your Grade = C");
}
else if(a>=51 && a<=60)
{
System.out.println("Your Grade = D");}
else
{
System.out.println("Your Grade = F");
}
}

if(s1<50 || s2<50 || s3<50 || s4<50 || s5<50)
{
System.out.println("You are Fail");
}

}
}
