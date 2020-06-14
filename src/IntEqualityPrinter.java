public class IntEqualityPrinter
{
    public static void printEqual(int x, int y, int z)
    {
        if(x < 0 || y < 0 || z < 0)
        {
            System.out.print("Invalid Value");
        }
        else if(x == y && y == z)
        {
            System.out.print("All numbers are equal");
        }
        else if(x != y && y !=z && z != x)
        {
            System.out.println("All numbers are different");
        }
        else
        {
            System.out.println("Neither all are equal or different");
        }
    }
}
