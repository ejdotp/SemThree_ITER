enum level
{
    LOW, MEDIUM, HIGH, E_HIGH
}
public class EnumLoop
{
    public static void main(String[] args) {
        for(level myvar:level.values())
        {
            System.out.println(myvar);
        }
    }
}
