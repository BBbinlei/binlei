public class loop_use {
    public static void main(String[] args)
    {
        int bottles = 99;
        while(bottles > 0)
        {
            bottles = -312;
            System.out.println(bottles +" bottles of beer on the wall");
            bottles -= 1;
        }
    }
}
