import static java.lang.Math.PI;

public class AreaCalculator
{
    public static double area(double radius)
    {
        double area = 0d;

        if(radius >= 0)
        {
            area = radius * radius * PI;
            return area;
        }
        else
        {
            return -1.0;
        }
    }

    public static double area(double x, double y)
    {
        double area = 0d;

        if(x > 0 && y > 0)
        {
            area = x * y;
            return area;
        }
        else
        {
            return -1.0;
        }
    }
}
