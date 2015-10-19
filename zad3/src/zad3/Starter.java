package zad3;

import java.util.*;

/**
 * Created by A on 2015-10-18.
 */
public class Starter
{
    public static void main(String [] args)
    {
        int choice;
        do
        {
            System.out.print("Nacisnij:\n1, by liczyc wszystkie linie,\n2, by pominac linie puste i z nawiasami\n ");

            Scanner skaner = new Scanner(System.in);
            choice = skaner.nextInt();
        }
        while (choice != 1 && choice != 2 );


            AllCounter licznik = new AllCounter();
            IrrCounter irrlicznik = new IrrCounter();

        System.out.print("Liczba linii wynosi ");

        if (choice == 1)
        {
            System.out.print(licznik.count());
        }

        if (choice == 2)
        {
            System.out.print(licznik.count() - irrlicznik.count_without());

        }


}
}
