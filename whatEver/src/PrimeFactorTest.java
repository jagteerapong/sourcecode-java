import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void testPrimeFactorOf2() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void testPrimeFactorOf3() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void testPrimeFactorOf4() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(4);
        assertEquals("22", result);
    }
    
    @Test
    public void testPrimeFactorOf6() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(6);
        assertEquals("23", result);
    }
    
    @Test
    public void testPrimeFactorOf8() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(8);
        assertEquals("222", result);
    }
    
    @Test
    public void testPrimeFactorOf10() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(10);
        assertEquals("25", result);
    }
    
    @Test
    public void testPrimeFactorOf12() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(12);
        assertEquals("223", result);
    }
    
    @Test
    public void testPrimeFactorOf34() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(34);
        assertEquals("217", result);
    }
    
    @Test
    public void testPrimeFactorOf9() {
        PrimeFactor primeFactor = new PrimeFactor();
        String result = primeFactor.of(9);
        assertEquals("33", result);
    }

}
