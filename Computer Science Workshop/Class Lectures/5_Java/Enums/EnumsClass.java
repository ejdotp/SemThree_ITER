package Enums;
enum level
{
    LOW, MEDIUM, HIGH
}
public class EnumsClass
{
    public static void main(String[] args)
    {
        level my_var1 = level.MEDIUM;
        System.out.println("Value of my_var1: " + my_var1);
        level my_var2 = level.LOW;
        System.out.println("Value of my_var2: " + my_var2);
        level my_var3 = level.HIGH;
        System.out.println("Value of my_var3: " + my_var3);
    }
}