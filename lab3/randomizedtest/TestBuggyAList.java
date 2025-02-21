package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove()
    {
        AListNoResizing<Integer> test1= new AListNoResizing<>();
        BuggyAList<Integer> test2 = new BuggyAList<>();
        test1.addLast(4);
        test1.addLast(5);
        test1.addLast(6);
        test2.addLast(4);
        test2.addLast(5);
        test2.addLast(6);

        assertEquals(test1.size(), test2.size());
        assertEquals(test1.removeLast(), test2.removeLast());
        assertEquals(test1.removeLast(), test2.removeLast());
        assertEquals(test1.removeLast(), test2.removeLast());


    }
    @Test
    public void randomizedTest()
    {
        AListNoResizing<Integer> L = new AListNoResizing<>();

        int N = 500;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 3);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            }
            else if(L.size() == 0)
            {
                ;
            }
            else if (operationNumber == 2)
            {
                int Last = L.getLast();
                L.removeLast();
                System.out.println("Last:" + Last);
            }

        }
    }

    @Test
    public void TestBuggyAList1() {
        BuggyAList<Integer> L = new BuggyAList<>();
        int N = 500;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 3);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            } else if (L.size() == 0) {
                ;
            } else if (operationNumber == 2) {
                int Last = L.getLast();
                int removeLast = L.removeLast();
                assertEquals(Last, removeLast);
            }
        }
    }

    @Test
    public void ManyAddManyRemove()
    {
        AListNoResizing<Integer> correct = new AListNoResizing<>();
        BuggyAList<Integer> broken = new BuggyAList<>();
        int N = 5000;
        for(int i = 0; i < N; i++)
        {
            int operationNumber = StdRandom.uniform(0, 3);
            if(operationNumber == 0)
            {
                int randVal = StdRandom.uniform(0, 100);
                correct.addLast(randVal);
                broken.addLast(randVal);

            }
            else if(operationNumber == 1)
            {
                assertEquals(correct.size(), broken.size());
            }
            else if(correct.size() == 0 || broken.size() == 0)
            {
                ;
            }
            else if(operationNumber == 2)
            {
                assertEquals(correct.removeLast(), broken.removeLast());
            }
        }

    }


}
