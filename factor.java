import java.io.*;
import java.util.*;
class factor
{
public static void main(String args[])
{
int[] a=new int[20];
int num,i,k,n,j=0;
Scanner sr=new Scanner(System.in);
System.out.println("Enter the the number: ");
num=sr.nextInt();
for(i=1;i<num;i++)
{
if(num%i==0)
{
a[j]=i;
j++;
}
}
System.out.println("factor of the given number = ");
for(k=0;k<j;k++)
{
System.out.print(a[k]+" ");
}
System.out.print("Enter the Nth number = ");
n=sr.nextInt();
System.out.println("\nThe Nth number = "+a[n-1]);
}
}
