import java.io.*;
import java.util.*;
class sumofperfect
{
public static void main(String args[])
{
int num,i=1,j,sum=0,k=0,temp=0,total=0,m;
int[] a=new int[10];
Scanner sr=new Scanner(System.in);
for(j=2;j<10;j++)
{
num=j;
while(i<num)
{
if(num%i==0)
sum=sum+i;
i++; 
}
if(sum==num)
{
a[k]=num;
k++;
}
}

for(m=0;m<10;m++)
{
System.out.println(a[m]);
}

System.out.println("Sum of Perfect Square number less than 10 =" +total);
}
}


