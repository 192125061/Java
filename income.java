import java.io.*;
import java.util.Scanner;
class income
{
public static void main(String args[])
{
double in,tax;
System.out.println("enter your annual income: ");
Scanner sh=new Scanner(System.in);
in=sh.nextFloat();
if(in<500000)
{
tax=0;
}
else if(in>500000 && in<750000)
{
tax=in*0.05;
}
else if(in>750000 && in<1000000)
{
tax=in*0.10;
}
else if(in>1000000 && in<1500000)
{
tax=in*0.12;
}
else
{
tax=in*0.15;
}

System.out.println("Your Tax = "+tax);
}
}
