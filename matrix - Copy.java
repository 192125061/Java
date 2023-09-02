import java.io.*;
import java.util.*;
class matrix
{
public static void main(String args[])
{
int[][] m1=new int[3][3];
int[][] m2=new int[3][3];
int[][] ans=new int[3][3];
int i,j,k,ch,disum;
Scanner sc=new Scanner(System.in);
System.out.println("enter the matrix 1 elements: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m1[i][j]=sc.nextInt();
}
}
System.out.println("enter the matrix 2 elements: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m2[i][j]=sc.nextInt();
}
}
System.out.println("enter your choise: 1:add 2:sub 3:mul 4:tras 5:sum of diagonals");
ch=sc.nextInt();

switch(ch)
{
case 1:
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[i][j] + m2[i][j];
	}
	}
	System.out.println("the sum of two matrix:");
    	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 2:
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[i][j] - m2[i][j];
	}
	}
	System.out.println("the difference of two matrix:");
    	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 3:
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=0;
	for(k=0;k<3;k++)
	{
	ans[i][j]+=m1[i][k]*m2[k][j];
	}
	}
	}
	System.out.println("the maltiplication of two matrix:");
    	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
rcase 4:
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[j][i];
	}
	}
	System.out.println("the diagonal of matrix:");
    	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;

case 5:
	disum=m1[0][0]+m1[1][1]+m1[2][2];
	System.out.println("Sum of diagonals = " + disum);

}

}
}



