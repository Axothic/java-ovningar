package se.inceptive;

import java.util.ArrayList;

public class indexMenu
{
    public static void main( String[] args )
    {

    }

    public static String indexMenuFunc(ArrayList<String> input)
    {
        int counter = 0;
        String ret = "";
        for (String parts : input){
            counter++;
            ret += counter + ". " + parts + "\n";
        }

        return ret;
    }
}