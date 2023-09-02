import java.io.*;
import java.util.Scanner;
class address
{
public static void main(String args[])
{
String N,FN,DN,SN,AN,C,P;
System.out.println("Enter the Name: ");
Scanner sc=new Scanner(System.in);
N=sc.nextLine();
System.out.println("Enter the Father Name: ");
Scanner sd=new Scanner(System.in);
FN=sd.nextLine();
System.out.println("Enter the Door No: ");
Scanner sr=new Scanner(System.in);
DN=sr.nextLine();
System.out.println("Enter the Street Name: ");
Scanner st=new Scanner(System.in);
SN=st.nextLine();
System.out.println("Enter the Area Name: ");
Scanner sv=new Scanner(System.in);
AN=sv.nextLine();
System.out.println("Enter the City Name: ");
Scanner sy=new Scanner(System.in);
C=sy.nextLine();
System.out.println("Enter the Pincode: ");
Scanner sp=new Scanner(System.in);
P=sp.nextLine();
System.out.println(" Name:"+N+"\n Father Name:"+FN+"\n Door No:"+DN+"\n Street Name:"+SN+"\n Area Name:"+AN+"\n City Name:"+C+"\n Pincode:"+P);
}
}



