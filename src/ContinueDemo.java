public class ContinueDemo {
    public static void main(String[] args)
    {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        int i;
        int j;
        for(i = 0; i < a.length; i += 1)
        {
            if(a[i].contains("horse"))
            {
                continue;
            }
            for(j = 0; j < 3; j += 1)
            {
                System.out.println(a[i]);
            }
        }
    }
}
