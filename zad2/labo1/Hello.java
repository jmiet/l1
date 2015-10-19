package labo1;
import java.util.Scanner;


/**
 * Created by A on 2015-10-17.
 */


public class Hello
{
    static String m;
    static String n[] = null;
    public static void main(String[] args)
    {
        System.out.print("Podaj liczby, oddzielone przecinkami\n");

        Scanner read = new Scanner(System.in);

        Separator sep = new Separator();
        Reorganizer reorg = new Reorganizer();


        m = read.next();
        n = m.split(",");
        int z = n.length;


        for (int i = 0; i < z; i++)
        {
            System.out.print(n[i] + "->");
            reorg.reorganize(sep.separate(n[i]));
            System.out.println("\n");
        }

    }
}

