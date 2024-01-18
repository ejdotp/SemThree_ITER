import java.util.Scanner;
public class Q10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression (e.g., 123+345 or 5*10): ");
        String n = sc.nextLine();
        char x='\0';
        int i; double res=0;
        for(i = 0; i<n.length(); i++)
        {
            if(n.charAt(i) == '+' || n.charAt(i) == '-' || n.charAt(i) == '*' || n.charAt(i) == '/')
            {
                x = n.charAt(i);
                break;
            }
        }
        String a = n.substring(0, i);
        String b = n.substring(i+1, n.length());
        Double a1 = Double.valueOf(a);
        Double b1 = Double.valueOf(b);
        switch(x)
        {
            case '+' :
                res = a1+b1;
                break;
            case '-' :
                res = a1-b1;
                break;
            case '*' :
                res = a1*b1;
                break;
            case '/' :
                res = a1/b1;
                break;
            default :
                System.out.println("Bhai kar kya raha hai tu?");
        }
        System.out.println("Your Result: "+res);
    }
}
