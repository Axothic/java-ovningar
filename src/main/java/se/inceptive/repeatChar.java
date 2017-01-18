package se.inceptive;

public class repeatChar {
    public static void main( String[] args )
    {
        repeatCharFunc('!',1);
    }

    public static String repeatCharFunc(char input1,int input2)
    {
        String retur = "";
        for (; 0 < input2; input2--)
        {
           retur = retur + input1;
        }

        return retur;
    }
}
