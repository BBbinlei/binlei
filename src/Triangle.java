public class Triangle {
    public static void main(String[] args)
    {
        int i, j;;
        i = j = 0;
        while(i < 5)
        {
            i += 1;
            j = 0;
            while(j < i)
            {
               System.out.print("*");
               j += 1;
            }
            System.out.print("\n");
        }
    }
}
