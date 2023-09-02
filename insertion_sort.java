import java.io.*;
import java.util.Scanner;
class insertion_sort
{
public static void main(String[] args)
{
int[] arr = {4,6,7,1,2};
int len = 5;
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

for(int k=0;k<5;k++)
{
System.out.print(arr[k] + " ");
}

}
}