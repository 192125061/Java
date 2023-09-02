import java.io.*;
import java.util.Scanner;
class find
{
public static void main(String[] args)
{
String a,b;
System.out.println("Enter the username:");
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
System.out.println("retype username:");
Scanner sh=new Scanner(System.in);
b=sh.nextLine();
if(a.equals(b))
{
System.out.println("Enter username is valid!");
}
else
{
System.out.println("enter username is Invalid!");
}
}
}
