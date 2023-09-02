import java.io.*;
import java.util.Scanner;
class simple
{
public static void main(String args[])
{
double p,n,age,in;
System.out.println("enter the Principle Amount: ");
Scanner sh=new Scanner(System.in);
p=sh.nextFloat();
System.out.println("enter the no of years ");
Scanner sc=new Scanner(System.in);
n=sc.nextFloat();
System.out.println("enter age ");
Scanner sd=new Scanner(System.in);
age=sd.nextFloat();
if(age>=60)
{
in=p*n*0.10/100;
System.out.println("Simple Interest = "+in);
}
else
{
in=p*n*0.12/100;
System.out.println("Simple Interest = "+in);
}
}
}
