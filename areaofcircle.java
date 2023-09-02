import java.io.*;
import java.util.Scanner;
class areaofcircle
{
public static void main(String args[])
{
double x,y,z,g = 3.14;
System.out.println("Enter the radius of Circle=");
Scanner sr = new Scanner(System.in);
x=sr.nextFloat();
y=g*x*x;
z=2*g*x;
System.out.println("Area of Circle:"+y+"\n"+"Circumference of Circle:"+z);
}
}