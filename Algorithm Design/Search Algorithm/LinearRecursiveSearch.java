//Linear Search with Recursion

public class LinearRecursiveSearch
{
	public static boolean Search(int[] a, int x, int i)
    {
        if (i == a.length)
            return false;
        if(a[i] == x)
            return true;                
        return Search(a,x,i+1);
    }
	public static void main(String[] args) 
    {
        int arr[] = {1, 4, 6, 9, 10};
        int key = 9;
        
        System.out.println("Element found in the array: "+Search(arr,key,0));
    }
}

/*
Output:
Element present in the array : true
*/