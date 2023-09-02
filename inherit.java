import java.io.*;
import java.util.*;

class p
{
int x=10;
public void display()
{
System.out.println("from parent");
}
}

interface g
{
public void display1();
}


interface b
{
public void display2();
}

class c implements b,g
{
int y=20;
public void display2()
{
System.out.println("From interface");
}
public void display1()
{
System.out.println("from second interface");
}

}


class inherit
{
public static void main(String args[])
{
c d = new c();

d.display1();
d.display2();
}
}