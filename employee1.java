import java.io.*;
import java.util.*;
class Employee
{
double bp,hra,ta,da,pf,lic,ns,d,gs;
int emno;
String Name;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter the employee No:");
emno=sc.nextInt();
System.out.println("Enter the employee basic pay:");
bp=sc.nextInt();
System.out.println("Enter your Name: ");
Name=sc.nextLine();
}
void calculate()
{
hra=bp*0.10;
ta=bp*0.20;
da=bp*0.15;
pf=bp*0.12;
lic=bp*0.20;
ns=bp+hra+ta+da;
d=pf+lic;
gs=ns-d;
}
void ouput()
{
System.out.println("Employee No: "+emno);
System.out.println("Employee Name: "+Name);
System.out.println("Employee Basic pay: "+bp);
System.out.println("Employee Net Salay "+ns);
System.out.println("Employee dectation "+d);
System.out.println("Employee gross pay "+gs);
}
}
class employee1
{
public static void main(String args[])
{
Employee  obj =new Employee();
obj.input();
obj.calculate();
obj.ouput();
}
}

