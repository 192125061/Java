import java.io.*;
import java.util.*;
class prime
{
public static void main(String atgs[])
{
int[] arr=new int[10];
int i,j,n,c,flag=0,prime=0,nonprime=0;
System.out.println("Enter any 10 numbers: ");
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}

for(i=0;i<10;i++)
{
n=arr[i];
c=n/2;
for(j = 2; j <= c; j++)  
{  
if(n % j == 0)  
  
{  
flag=1;    
} 
}
if(flag==1)
{
nonprime+=1;
}
else
{
prime+=1;
}
flag=0;   
}

System.out.println("No of prime : "+prime);
System.out.println("no of non prime: "+nonprime);
}
}



  
      

