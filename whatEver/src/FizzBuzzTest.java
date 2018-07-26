import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void oneNumberReturn1() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(1);
        assertEquals("1", result);  
    }
    
    @Test
    public void oneNumberReturn2() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(2);
        assertEquals("2", result);  
    }
    
    @Test
    public void oneNumberReturn3() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(3);
        assertEquals("Fizz", result);  
    }
    
    @Test
    public void oneNumberReturn4() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(4);
        assertEquals("4", result);  
    }
    
    @Test
    public void oneNumberReturn5() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(5);
        assertEquals("Buzz", result);  
    }
    
    @Test
    public void oneNumberReturn6() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(6);
        assertEquals("Fizz", result);  
    }
    
    @Test
    public void oneNumberReturn7() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(7);
        assertEquals("7", result);  
    }
    
    @Test
    public void oneNumberReturn8() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(8);
        assertEquals("8", result);  
    }
    
    @Test
    public void oneNumberReturn9() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(9);
        assertEquals("Fizz", result);  
    }
    
    @Test
    public void oneNumberReturn10() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(10);
        assertEquals("Buzz", result);  
    }
    
    @Test
    public void oneNumberReturn11() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(11);
        assertEquals("11", result);  
    }
    
    @Test
    public void oneNumberReturn12() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(12);
        assertEquals("Fizz", result);  
    }
    
    @Test
    public void oneNumberReturn13() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(13);
        assertEquals("13", result);  
    }
    
    @Test
    public void oneNumberReturn14() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(14);
        assertEquals("14", result);  
    }
    
    @Test
    public void oneNumberReturn15() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);  
    }
    
    @Test
    public void oneNumberReturn16() {
        FizzBuzz fz = new FizzBuzz();
        String result =  fz.sendAndReturn(16);
        assertEquals("16", result);  
    }

}
