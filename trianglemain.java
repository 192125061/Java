import java.io.*;
import java.util.*;
class Triangle
{
int s1,s2,s3;
Triangle(int si1,int si2,int si3)
{
s1=si1;
s2=si2;
s3=si3;
}
boolean isRight()
{
int a=s1*s1;
int b=s2*s2;
int c=s3*s3;
return(a+b==c) || (a+c==b) || (b+c==a);
}
boolean isScalane()
{
return(s1!=s2) && (s1!=s3) && (s2!=s3);
}
boolean isIsosceles()
{
return(s1==s2) && (s1==s3) && (s2==s3);
}
boolean isEquilateral()
{
return(s1==s2) && (s1==s3);
}
}
class Triangle1
{
public static void main(String args[])
{
Triangle x=new Triangle(4,4,4);
System.out.println(x.isRight());
System.out.println(x.isScalane());
System.out.println(x.isIsosceles());
System.out.println(x.isEquilateral());
}
}