import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
public class MaxSum1 {
public static void main(String[] args) throws IOException
{
String filename = "C:/Users/Sainath Reddy/Desktop/input.txt";
Scanner scanner = new Scanner(new File(filename));
List<int[]> list = new ArrayList();
int i=0;
int j=0;//columns
int[] array;//declaration of an two dimensional arrays
while(scanner.hasNextLine())
{
for(i=0;i<100;i++)
{
	
array = new int[i];
System.out.println(i);
for(j=0; j<= i ; j++)
{
array[j] = scanner.nextInt();
System.out.println(scanner.nextInt());

}
list.add(array);
i++;
}
}
for(i=99 ; i>=0 ; i--)
{
for(j=0 ; j < i ; j++)
{
if(list.get(i)[j] < list.get(i)[j+1])
{
list.get(i-1)[j] = list.get(i-1)[j] + list.get(i)[j+1];
}
else
list.get(i-1)[j] = list.get(i-1)[j] + list.get(i)[j];
}
}
scanner.close();
}
}