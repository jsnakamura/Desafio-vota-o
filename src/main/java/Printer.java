public class Printer {

    public void print(String line)
    {
        System.out.println(line);
    }

    public static void clearScreen()
    {
        for(int tmp = 0; tmp < 50; tmp ++)
            System.out.println();
    }

}
