public class BreakContinue {
    public static void windowPossum(int[] a, int n)
    {
        int i;
        int j;
        int sum ;
        for(i = 0; i < a.length; i += 1)
        {
            if(a[i] < 0)
            {
                continue;
            }
            sum = 0;
            for(j = i; j <= i + n; j += 1)
            {
              if(j >= a.length)
              {
                  break;
              }
              sum += a[j];
            }
            a[i] = sum;
        }

    }

    public static void main(String[] args)
    {
        int[] a = new int[]{1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPossum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }

}
