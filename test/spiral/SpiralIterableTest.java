/*
 * SpiralIterableTest.java
 * Create Date: Mar 12, 2019
 * Initial-Author: Janos Aron Kiss
 */
package spiral;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janos Aron Kiss
 */
public class SpiralIterableTest {
    
    public static final Integer[][] TEST_CASE_1 = new Integer[][]{
        {1,  2,  3,  4},
        {5,  6,  7,  8},
        {9, 10, 11, 12},
    };        
    public static final String TEST_RESULT_1 = "1 2 3 4 8 12 11 10 9 5 6 7";
    public static final int TEST_HASH_1 = 580;
    
    public static final String[][] TEST_CASE_2 = new String[][]{
        {"A", "B", "C"},
        {"D", "E", "F"},
        {"G", "H", "I"},
    };        
    public static final String TEST_RESULT_2 = "A B C F I H G D E";
    
    public static final Integer[][] TEST_CASE_3 = new Integer[][]{
        {1,  2,  3,  4,  5,  6,  7,  8},
        {9, 10, 11, 12, 13, 14, 15, 16},
    };        
    public static final String TEST_RESULT_3 = "1 2 3 4 5 6 7 8 16 15 14 13 12 11 10 9";
    public static final int TEST_HASH_3 = 1412;

    public static final String[][] TEST_CASE_4 = new String[][]{
        {"A", "B", "C", "D", "E"},
    };        
    public static final String TEST_RESULT_4 = "A B C D E";
    
    public static final String[][] TEST_CASE_5 = new String[][]{
        {"A"},
        {"B"},
        {"C"},
        {"D"},
        {"E"},
    };        
    public static final String TEST_RESULT_5 = "A B C D E";

    public SpiralIterableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iterator method, of class SpiralIterable.
     */
    @Test
    public void testIterator() {                
        System.out.println("iterator");
        
        assertEquals(TEST_RESULT_1, getIterationOutput(TEST_CASE_1));
        assertEquals(TEST_HASH_1, calcMatrixHash(TEST_CASE_1));
        
        assertEquals(TEST_RESULT_2, getIterationOutput(TEST_CASE_2));

        assertEquals(TEST_RESULT_3, getIterationOutput(TEST_CASE_3));        
        assertEquals(TEST_HASH_3, calcMatrixHash(TEST_CASE_3));
        
        assertEquals(TEST_RESULT_4, getIterationOutput(TEST_CASE_4));
        assertEquals(TEST_RESULT_5, getIterationOutput(TEST_CASE_5));        
    }
    
    private String getIterationOutput(Object[][] matrix) {
        StringBuilder sb = new StringBuilder();
        
        SpiralIterable si = new SpiralIterable(matrix);
        for ( Object o : si )
            sb.append(o.toString()).append(" ");
        
        return sb.toString().trim();
    }
        
    private int calcMatrixHash(Integer[][] matrix) {
        int result = 0;
        
        SpiralIterable<Integer> si = new SpiralIterable<>(matrix);
        int i = 1;
        for ( Integer n :  si ) {
            result += n * i;
            i++;
        }
        
        return result;
    }    
    
}
