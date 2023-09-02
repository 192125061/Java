import java.io.*;
import java.util.*;
class duplicates
{
public static void main(String args[])
{
int i,k,l=0
int[] a=new int[10];
int[] b=new int[10];
Scanner sc=new Scanner(System.in)
for(k=0;k<5;k++)
{
a[i]=sc.nextInt();	
}
for(i=0;i<5;i++)
{
for(j=0;j<l;j++)
{
if(a[i]==b[j])
{
break;
}
} 
if(j==l)
{
b[l]=a[i];
l++;
}
}
System.out.println("After removel:");
for(i=0;i<5;i++)
{
System.out.print(b[i]+" ");
}
}
}