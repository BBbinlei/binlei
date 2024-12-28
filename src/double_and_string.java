public class double_and_string {
    public static void main(String[] args)
    {
        String a = "Achilles";
        String b = "Tortoise";
        double aPos = 0;
        double bPos = 100;
        double aSpeed = 20;
        double bSpeed = 10;
        double totalTime = 0;
        while(aPos < bPos)
        {
            System.out.println("At time :" + totalTime);
            System.out.println("   " + a + "is at position" + aPos);
            System.out.println("   " + b + "is at position" + bPos);
            double TimeToReach = (bPos - aPos) / aSpeed;
            totalTime += TimeToReach;
            aPos += aSpeed * TimeToReach;
            bPos += bSpeed * TimeToReach;
        }
    }
}
