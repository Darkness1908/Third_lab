import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        String[][] table = new String[4][6];
        table[0][0] = "ArrayList:number";
        table[1][0] = "ArrayList:time";
        table[2][0] = "LinkedList:number";
        table[3][0] = "LinkedList:time";

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 4; i += 2)
        {
            if (i == 0)
                for (int j = 1; j < 6; j++)
                {
                   table[i][j] = "    50000     ";
                }
            else
                for (int j = 1; j < 6; j++)
                {
                    table[i][j] = "   50000      ";
                }
        }

        for (int i = 1; i < 4; i += 2)
        {
            if (i == 1)
            {
                table[i][1] = "     " + ArrayListMethods.addLastValues(list1);
                table[i][2] = "      " + ArrayListMethods.addValues(list1);
                table[i][3] = "      " + ArrayListMethods.deleteValues(list1);
                table[i][4] = "        " + ArrayListMethods.getValues(list1);
                table[i][5] = "        " + ArrayListMethods.deleteLastValues(list1);
            }
            else
            {
                table[i][1] = "    " + LinkedListMethods.addLastValues(list2);
                table[i][2] = "       " + LinkedListMethods.addValues(list2);
                table[i][3] = "       " + LinkedListMethods.deleteValues(list2);
                table[i][4] = "       " + LinkedListMethods.getValues(list2);
                table[i][5] = "       " + LinkedListMethods.deleteLastValues(list2);
            }
        }

        System.out.println("\nВремя выполнения методов представлено в миллисекундах\n");
        System.out.println("                 add(в конец) add(по индексу) delete(по индексу)"
                                                      + "   get    delete(последний элемент)");

        for (int i = 0; i < 4; i++)
        {
            String str = "";
            for (int j = 0; j < 6; j++)
            {
                str += table[i][j] + " ";
            }
            System.out.println(str);
        }
    }
}