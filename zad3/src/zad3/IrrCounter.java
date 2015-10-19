package zad3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by A on 2015-10-19.
 */
public class IrrCounter
{
    int irr = 0;

    int count_without()

    {
        try {

            FileReader fileReader = new FileReader("test.java");


            BufferedReader bufferReader = new BufferedReader(fileReader);

            String linia;
            String leftbracket = "{";
            String rightbracket = "}";


            while((linia = bufferReader.readLine()) != null) {


                if(linia.isEmpty() || linia.equals(rightbracket) || linia.equals(leftbracket))
                {
                    irr++;
                }
            }
            fileReader.close();


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return irr;
    }


}
