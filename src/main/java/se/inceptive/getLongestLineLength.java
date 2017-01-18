package se.inceptive;

import java.util.ArrayList;

public class getLongestLineLength {


    public static int getLongestLineLengthFunc(ArrayList<String> input)
    {
        int length = 0;
        for (String s : input) {
            if (s.length() > length) {
                length = s.length();
            }
        }
        return length;
    }


    public static void main(String[] args)
    {

        //Logest test
        ArrayList<String> input = new ArrayList<String>();
        input.add("1");
        input.add("123456");
        int expected = 6;
        System.out.print(input);

    }
}
