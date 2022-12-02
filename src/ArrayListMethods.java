import java.util.ArrayList;
public class ArrayListMethods
{
    public static String addLastValues(ArrayList<Integer> list)
    {
        double start = System.nanoTime();
        for (int i = 0; i < 50000; i++)
        {
            list.add(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return String.format("%.4f", result);
    }
    public static String addValues(ArrayList<Integer> list)
    {
        double start = System.nanoTime();
        for (int i = 0; i < 50000; i++)
        {
            list.add(500, i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return String.format("%.4f", result);
    }
    public static String deleteValues(ArrayList<Integer> list)
    {
        double start = System.nanoTime();
        int edge = list.size() - 50000;
        for (int i = list.size() - 1; i >= edge; i--)
        {
            list.remove(500);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return String.format("%.4f", result);
    }
    public static String deleteLastValues(ArrayList<Integer> list)
    {
        double start = System.nanoTime();
        int edge = list.size() - 50000;
        for (int i = list.size() - 1; i >= edge; i--)
        {
            list.remove(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return String.format("%.4f", result);
    }
    public static String getValues(ArrayList<Integer> list)
    {
        double start = System.nanoTime();
        for (int i = 0; i < 50000; i++)
        {
            list.get(i);
        }
        double finish = System.nanoTime();
        double result = (finish - start)/1000000;
        return String.format("%.4f", result);
    }
}