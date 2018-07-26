import static org.junit.Assert.*;

import org.junit.Test;

public class WorkWithArrayTest {

    @Test
    public void sent1() {
        WorkWithArray workWithArray = new WorkWithArray();
        int[] input = {1};
        int[] sorted = workWithArray.of(input);
        assertArrayEquals(new int[] {1}, sorted);
    }
    
    @Test
    public void sent12() {
        WorkWithArray workWithArray = new WorkWithArray();
        int[] input = {1,2};
        int[] sorted = workWithArray.of(input);
        assertArrayEquals(new int[] {1,2}, sorted);
    }
    
    @Test
    public void sent21() {
        WorkWithArray workWithArray = new WorkWithArray();
        int[] input = {5,4,3,2,1};
        int[] sorted = workWithArray.of(input);
        assertArrayEquals(new int[] {1,2,3,4,5}, sorted);
    }

}
