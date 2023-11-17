//Linear Search Algorithm without Recursive

public class LinearIterativeSearch 
{
	public static void main(String[] args) 
    {
        int arr[] = {1, 4, 6, 9, 10};
        boolean fish=false;
        int key = 2;
        
        for (int i = 0; i < arr.length; i++)
            if(arr[i]== key)
            {
                fish=true;
                break;
            }
        System.out.println("Element found in the array: "+fish);
    }
}

/*
Output:
Element found in the array: false
*/