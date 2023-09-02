import java.io.*;
import java.util.*;
class daystoyear
{
public static void main(String args[])
{
double days;
double year,month,week;
System.out.print("Enter the no of days: ");
Scanner sr=new Scanner(System.in);
days=sr.nextInt();
year=days/365;
month=days/30;
week=days/7;
System.out.println("no of Year= "+Math.round(year);
System.out.println("no of month= "+month);
System.out.println("no of week= "+week);
}
}
