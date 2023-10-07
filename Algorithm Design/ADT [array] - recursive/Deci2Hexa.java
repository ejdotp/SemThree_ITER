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
        int dec, rem, q;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        dec=sc.nextInt();
        System.out.println("Hexadecimal number is : ");
        String h=d.hexadecimal(dec);    	       
        System.out.print(h);

     }    
}
