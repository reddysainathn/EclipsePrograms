package Arrays;

public class IntroToArrays {
public static void main(String[] args) {
	//int is a primitive type
	int value = 7;
    int[] values;
	values = new int[5];
	//int[] values = new int[5];
	System.out.println(values[0]);
	
	values[0]=10;
	values[1]=20;
	values[2]=30;
	
	/*System.out.println(values[0]);
	System.out.println(values[1]);
	System.out.println(values[2]);
	*/
	for(int i =0;i < values.length;i++)
	{
		System.out.println(values[i]);

	}
	//using loop in Arrays
int[]  numbers = {5,6,7};

for(int i=0; i < numbers.length; i++)
{	
	System.out.println(numbers[i]);
}

	
}
}
