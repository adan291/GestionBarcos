

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test001()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(2, "AAA", 12, 1990);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1200, "BBB", 40, 2014);
        Yate yate1 = new Yate(8, 4000, "CCC", 23, 2001);
        Velero velero2 = new Velero(3, "DDD", 5, 2016);
        Cliente cliente1 = new Cliente("enrique", "5555k");
        Cliente cliente2 = new Cliente("juan", "5555D");
        Cliente cliente3 = new Cliente("cristiano", "5555F");
        Cliente cliente4 = new Cliente("gerald", "5555G");
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(4, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(5, cliente3, yate1));
        assertEquals(361600, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(27), 0.1);
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(4, cliente4, velero2));
        puerto1.verEstadoAmarres();
    }
}

