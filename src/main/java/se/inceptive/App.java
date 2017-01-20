package se.inceptive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        String str = counterString(100000);
        long endTime = System.nanoTime();

        System.out.println(str);

        long duration = (endTime - startTime);

        System.out.println(duration / 1000000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int xx = Integer.parseInt(br.readLine());
        System.out.println(counterString(xx));

    }

    public static String counterString(int input) {
        String ret = "";
        for (int i = input; i > 0;) {
            ret = i + ret;
            if (i > 1) {
                ret = "*" + ret;
            }
            i = i - (int) Math.log10(i) - 2;
        }
        return ret;
    }

    public static String repeatChar(char input1, int input2) {
        String retur = "";
        for (; 0 < input2; input2--) {
            retur = retur + input1;
        }

        return retur;
    }

    public static String indexMenu(ArrayList<String> input) {
        int counter = 1;
        String ret = "";
        for (String parts : input) {
            ret += counter + ". " + parts + "\n";
            counter++;
        }
        return ret;
    }

    public static int getLongestLineLength(ArrayList<String> input) {
        int length = 0;
        for (String s : input) {
            if (s.length() > length) {
                length = s.length();
            }
        }
        return length;
    }

    public static ArrayList<String> split(String input1, String input2) {
        ArrayList<String> stringer = new ArrayList<String>();
        String[] ret = input1.split(input2);
        stringer.addAll(Arrays.asList(ret));
        return stringer;
    }
}
