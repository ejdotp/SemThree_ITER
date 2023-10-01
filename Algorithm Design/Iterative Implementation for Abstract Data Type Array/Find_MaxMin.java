//to find maximum and minimum element in an array

public class Find_MaxMin
{

	public static void main(String[] args)
	{
		
		int[] Arr = {20, 3, 2400, 1, 69, 320};
		
		int Max = Arr[0];
		for(int i=1; i<Arr.length; i++)
			if(Max<Arr[i])
				Max = Arr[i];
		
		int Min = Arr[0];
		for(int i=1; i<Arr.length; i++)
			if(Min>Arr[i])
				Min = Arr[i];

		System.out.println("Max element is: "+Max+" & Min element is: "+Min);
		
	}

}
