enum level
{
    LOW, MEDIUM, HIGH
}
public class EnumSwitchCase
{
    public static void main(String[] args)
    {
        level my_var1 = level.LOW;
        switch(my_var1)
        {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
        }
    }
}