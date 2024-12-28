public class BreakDemo {
    public static void main(String[] args)
    {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
        int i;
        int j;
        for(i = 0; i < a.length; i += 1)
        {
            for(j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
                if (a[i].contains("horse")) {
                    break;
                }
            }
        }
    }
}
