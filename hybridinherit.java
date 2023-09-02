import java.io.*;
import java.util.*;

class staff
{
public void name()
{
System.out.println("Name: Praveen");
}
}


class teacher extends staff
{
public void subject()
{
name();
System.out.println("Subject name: Java");
}
}


class typist extends staff
{
public void speed()
{
name();
System.out.println("Speed = 14 Words per min");
}
}

class officer extends staff
{
public void grade()
{
System.out.println("grade = A");
}
}

class regular extends typist
{
public void Salary()
{
System.out.println("Salary = 100000");
}
}

class casual extends typist
{
public void Daily()
{
System.out.println("Daily rate = 1000");
}
}



class hybridinherit
{
public static void main(String args[])
{
teacher T = new teacher();
officer O = new officer();
T.subject();
O.grade();

regular R = new regular();
R.Salary();
casual C = new casual();
C.Daily();
}
}
