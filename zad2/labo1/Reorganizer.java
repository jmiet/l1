package labo1;

/**
 * Created by A on 2015-10-17.
 */
public class Reorganizer
{

    public char[] reorganize(char[] tab) {

        int size = tab.length;
        boolean thesame = true;

            if (tab[0] == '-')
            {
                for (int i = size - 1; i > 1; i--)
                {
                    if (tab[i] < tab[i - 1])
                    {
                        char temp = tab[i];
                        tab[i] = tab[i - 1];
                        tab[i - 1] = temp;
                        System.out.print(tab);
                        thesame = false;
                        break;
                    }
                }


        if (thesame || size < 3)
        {
            tab[0] = ' ';
            System.out.print(tab);
        }}


else {
                for (int i = size - 1; i > 0; i--)
                {

                    if (tab[i] > tab[i - 1])
                    {
                        char temp = tab[i];
                        tab[i] = tab[i - 1];
                        tab[i - 1] = temp;
                        System.out.print(tab);
                        thesame = false;
                        break;
                    }
                }


                if (thesame || size < 2)
                {
                    System.out.print("Nie ma liczby wiekszej od ");
                    System.out.print(tab);
                    System.out.print(", skladajacej sie z tych samych cyfr.");
                }
            }
        return tab;
    }
}