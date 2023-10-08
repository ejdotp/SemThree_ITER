//covert decimal to hexadecimal using array and recursion in java?

import java.util.Scanner;
class Deci2Hexa
{
	char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int rem;
	String hexdec="";
	String hexadecimal(int q)
	{   
		if(q != 0)
		{
			rem=q%16;
			hexdec= a[rem] + hexdec;
			q= q/16;
			hexadecimal(q);  
		}

		return hexdec;
	}         
    public static void main(String args[])
    {
        Deci2Hexa d=new Deci2Hexa();
        int dec;
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a Decimal number: ");
        dec=sc.nextInt();
        System.out.print("Hexadecimal number is: ");
        String h=d.hexadecimal(dec);    	       
        System.out.print(h);
		sc.close();

     }    
}

/*Output:
Enter a Decimal number: 60
Hexadecimal number is: 3C
*/
