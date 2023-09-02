import java.io.*;
import java.util.*;

class method
{
int area(int x)
{
return x*x;
}
Float area(Float y)
{
return y*y;
}
Float area(int x, float y)
{
return x*y;
}
int area(int x, int y)
{
return x*y;
}
}

class polymorphism
{
public static void main(String arg[])
{
method d=new method();
System.out.println(d.area(10));
System.out.println(d.area(2.4f));

System.out.println(d.area(10,1.2f));
System.out.println(d.area(10,36));
}
}