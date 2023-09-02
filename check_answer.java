import java.io.*;
import java.util.*;

class check_answer
{
public static void main(String args[])
{
String answer = "james gosling";
int i=1;
int acc=0;
String get;
while(i<=3)
{
System.out.println("Who Invented The Java Programming: ");
Scanner sc=new Scanner(System.in);
get = sc.nextLine();
acc+=1;
i++;
if(get.equals(answer))
{
System.out.println("Good");
break;
}
else
{
System.out.println("Wrong Answer, Try again");
}
}
if(acc==3)
{
System.out.println("The Corrent Answer Is James Gosling");
}
}
}
