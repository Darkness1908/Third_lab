import java.util.LinkedList;
public class LinkedListMethods
{
    public static String addLastValues(LinkedList<Integer> list)
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
    public static String addValues(LinkedList<Integer> list)
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
    public static String deleteValues(LinkedList<Integer> list)
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
    public static String deleteLastValues(LinkedList<Integer> list)
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
    public static String getValues(LinkedList<Integer> list)
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