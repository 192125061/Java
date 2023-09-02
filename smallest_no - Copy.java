import java.io.*;
import java.util.Scanner;
class smallest_no
{
public static void main(String[]  args)
{
int[] arr = {3,6,8,2,9};
int small;

small = arr[0];
for(int j:arr)
{
if(j<small)
{
small = j;
}
}

System.out.println("Small number = "+small);
}
}

