import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ColaTest{




    /*public static void main(String[] args)
    {
            System.out.println("Hola");
    }*/



    @Test
    public void testCuaBuida() {
        Cola c  = new ColaImpl<Integer>(10);
        System.out.println("Hola");
        // assert statements
        assertEquals("10 x 0 must be 0", 0, c.size(), 0);
    }


}