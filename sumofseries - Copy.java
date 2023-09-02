import java.io.*;
import java.util.*;
import java.sql.*;
class sumofseries
{
public static void main(String agrs[])
{
int i,n,sum=1,it;
double soodd=0,soeven=0,val,temp=0;
System.out.println("Enter the value of n: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
sum=sum*i;
temp+=i/sum;
if(i%2==0)
{
soeven+=i/sum;
}
else
{
soodd+=i/sum;
}
}
val=soodd-soeven;
System.out.println("The sum of series = "+temp+"  "+soodd+"  "+soeven);
}
}





