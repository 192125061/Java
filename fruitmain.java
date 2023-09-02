import java.io.*;
import java.util.*;

class apple
{
public void apple1()
{
int a=19;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of apples: ");
a=sc.nextInt();
}
}
class mango extends apple
{
public void total()
{
int m=19;
int a=10;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of mango ");
m=sc.nextInt();
int total;
total=m+a;
System.out.println("No of apple: "+m);
System.out.println("No of mango: "+a);
System.out.println("No of total: "+total);
}
}



class fruitmain
{
public static void main(String args[])
{
mango f1=new mango();
apple a=new apple();
a.apple1();
f1.total();
}
}