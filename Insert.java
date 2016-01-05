/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M Waheed Rashad
 */
public class BSTTest {
    
    public BSTTest() {
        public BSTTest<Integer> a=null;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
      a=new BSTTest<Integer>();
 	}

    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestInsert() {
 	         a.insert(12);
 	         a.insert(14);
                 a.insert(16);
                 a.insert(18);
                 assertTrue( a.search(12));
                 assertTrue( a.search(14));
 	         assertTrue( a.search(16));
 	         assertTrue( a.search(18));
 		
 	}