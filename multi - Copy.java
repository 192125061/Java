import java.io.*;
import java.util.Scanner;
class multi
{
public static void main(String args[])
{
int i=1,s=0;
do
{
if(i%2!=0)
{
s+=i;
}
i+=1;   
}while(i<=100);
System.out.println("The Sum="+s);
}
}


