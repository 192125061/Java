import java.io.*;
import java.util.Scanner;
class leap
{
public static void main(String args[])
{
int year,r,i;
System.out.println("Enter the Year: ");
Scanner sc=new Scanner(System.in);
year=sc.nextInt();
if(year%4==0)
{
System.out.println("It is a Leap Year!!");
}
else
{
for(i=0;i<4;i++)
{
year +=1;
if(year%4==0)
{
System.out.println("the next leap year="+year);
break;
}
}
}
}
}