import java.io.*;
import java.util.Scanner;
class second_smallest_no
{
public static void main(String[]  args)
{
int[] arr = {3,6,8,2,9};
int key;

for(int i=1;i<5;i++)
{
key = arr[i];
int j = i-1;

while(j>=0 && arr[j]>key)
{
arr[j+1] = arr[j];
j--;
}

arr[j+1] = key;
}

System.out.println("Second smallest number : "+arr[1]);
}
}