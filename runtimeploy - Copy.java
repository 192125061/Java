import java.io.*;
import java.util.*;

class student
{
public void display()
{
System.out.println("Roll No:192125071");
}
}

class marks extends student
{
public void display1()
{
System.out.println("Derived class");
}
}

class runtimeploy
{
public static void main(String args[])
{
derived d=new derived();
d.display();
method d1=new method();
d1.display();
}
}