/*
 * SpiralSuite.java
 * Create Date: Mar 12, 2019
 * Copyright: SONY MUSIC ENTERTAINMENT 
 * Initial-Author: Janos Aron Kiss
 */
package spiral;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Janos Aron Kiss
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({spiral.SpiralIterableTest.class})
public class SpiralSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
