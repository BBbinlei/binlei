public class DrawTriangle {
    public static void DrawingTriangle(int N)
    {
        int i = 0;
        int j = 0;
        while(i < N)
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

    public static void main(String[] args)
    {
        DrawingTriangle(10);
    }
}
