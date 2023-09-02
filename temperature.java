import java.io.*;
import java.util.Scanner;
class temperature
{
public static void main(String args[])
{

double c,f;
System.out.println("Enter the fahrenheat :");
Scanner sc=new Scanner(System.in);
f=sc.nextFloat();
c=(f-32)/1.8;
System.out.println("Celcious ="+c);
}
}