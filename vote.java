import java.io.*;
import java.util.Scanner;
class vote
{
public static void main(String args[])
{
int age,r;
System.out.println("enter your age: ");
Scanner sn = new Scanner(System.in);
age=sn.nextInt();
if(age>=18)
{
System.out.print("your are eligible to vote!");
}
else
{
r=18-age;
System.out.println("you are eligible to vote after "+r+" years");
}
}
}
