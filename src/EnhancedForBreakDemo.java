public class EnhancedForBreakDemo {
    public static void main(String[] args)
    {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        int j;
        for(String s : a)
        {
            for(j = 0; j < 3; j += 1)
            {
                System.out.println(s);
                if(s.contains("horse"))
                {
                    break;
                }
            }
        }

    }
}
