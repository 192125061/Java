import java.io.*;
import java.util.*;
class perfect
{
public static void main(String args[])
{
int num,sum=0,i=1;
System.out.println("Enter the NUmber:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(i<num)
{
if(num%i==0)
sum=sum+i;
i++; 
}
if(sum==num)
{
System.out.println("Enter the number is perfect number");
}
else
{
System.out.println("Enter number is not a perfect number");
}
}
}
