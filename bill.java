import java.io.*;
import java.util.Scanner;
class bill
{
public static void main(String args[])
{
int ch,CN,cmr,lmr,con;
String name;
Scanner sh =new Scanner(System.in);
System.out.println("Enter your name: ");
name=sh.nextLine();
System.out.println("Enter your Customer No: ");
CN=sh.nextInt();
System.out.println("Enter your Current mouth reading: ");
cmr=sh.nextInt();
System.out.println("Enter your Last Mouth Reading: ");
lmr=sh.nextInt();
System.out.println("Enter your opation"+"/n"+ "1:Industry"+"/n"+"2:Domestic");
ch=sh.nextInt();
con=cmr-lmr;

switch(ch)
{
case 1:
	if(con<=100)
	{
	System.out.println("Your Bill: Rs 0");
	}
	else if(con>=101 && con<=200)
	{
	System.out.println("Your Bill: Rs " + con*125);
	}
	else if(con>=201 && con<=300)
	{
	System.out.println("Your Bill: Rs " + con*250);
	}
	else if(con>=301 && con<=500)
	{
	System.out.println("Your Bill: Rs " + con*400);
	}
	else
	{
	System.out.println("Your Bill: Rs " + con*540);
	}
case 2:
	if(con<=100)
	{
	System.out.println("Your Bill: Rs 0");
	}
	else if(con>=101 && con<=200)
	{
	System.out.println("Your Bill: Rs " + con);
	}
	else if(con>=201 && con<=300)
	{
	System.out.println("Your Bill: Rs " + con*2);
	}
	else if(con>=301 && con<=500)
	{
	System.out.println("Your Bill: Rs " + con*3);
	}
	else
	{
	System.out.println("Your Bill: Rs " + con*5);
	}
}
}
}