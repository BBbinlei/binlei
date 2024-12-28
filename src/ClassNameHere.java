public class ClassNameHere {
//    public static void main(String[] args)
//    {
//        int x = 5;
//        if(x < 10)
//        {
//            x += 10;
//        }
//        if(x < 10)
//        {
//            x += 10;
//        }
//        System.out.println(x);
//    }
    public static int max(int[] numbers)
    {
        int max;
        int i = 1;
        max = numbers[0];
//        while(i < numbers.length)
//        {
//            if(i < numbers[i])
//            {
//                max = numbers[i];
//            }
//            i += 1;
//        }
        for(i = 1; i < numbers.length; i++)
        {
            if(max < numbers[i])
            {
                max = numbers[i];
            }
        }

        return max;
    }


    public static void main(String[] args)
    {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int j = 0;
        int sum = 0;
        //System.out.println(max(numbers));
//        while(j < numbers.length)
//        {
//            sum += numbers[j];
//            j += 1;
//
//        }
        for(j = 0; j < numbers.length; j++)
        {
            sum += numbers[j];
        }
        System.out.println(sum);
    }
}
