public class PrintAbsoluteValue {
    public static void main(String[] args)
    {
        int x = -5;
        if(x < 0)
        {
            System.out.println("I shall negate x");
            x = -x;
        }
        System.out.println(x);
    }
}
