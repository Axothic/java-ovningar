package se.inceptive;

public class recursion
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        System.out.println(factorialloop(5));
    }

    public static int factorial(int n) {
        if(n < 1){
            return 1;
        } else{
            return (n*factorial(n - 1));
        }
    }

    public static int factorialloop(int n)
    {
        int retur = 1;
        for (; 1 <= n; n--)
        {
            retur = retur * n;
        }

        return retur;
    }
}
