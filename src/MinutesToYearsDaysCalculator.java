public class MinutesToYearsDaysCalculator
{
    public static void printYearsAndDays(long minutes)
    {
        long years;
        long days;

        if(minutes >= 0)
        {
            if(minutes >= 525600)
            {
                years = minutes / 525600;
                days = ((minutes % 525600) / 1440);

                System.out.println(minutes + " min = " + years + " y and " + days + " d" );

            }
            else
            {
                years = 0;
                days = minutes / 1440;
                System.out.println(minutes + " min = " + years + " y and " + days + " d" );
            }
        }
        else
            {
                System.out.println("Invalid Value");
            }
    }
}
