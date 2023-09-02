import java.io.*;
import java.util.*;
import java.lang.Exception.*;

class exception
{
public static void main(String args[])
{
int x=5,y=2,z=2;
try
{
int m=x/y-z;
throw new ArithmeticException;
}
catch(ArithmeticException e)
{
System.out.println("Error");
}
}
}
