import java.io.*;
import java.util.Scanner;
class largest_no
{
public static void main(String[]  args)
{
int[] arr = {3,6,8,2,9};
int large;

large = arr[0];

for(int j:arr)
{
if(j>large)
{
large = j;
}
}

System.out.println("Largeset in array: "+large);
}
}