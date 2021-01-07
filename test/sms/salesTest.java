/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abscyssa
 */
public class salesTest {
    
    /**
     *
     */
    public salesTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of Connect method, of class sales.
     */
    @Test
    public void testConnect() {
        System.out.println("Connect");
        sales instance = new sales();
        instance.Connect();
       
    }

    /**
     * Test of load method, of class sales.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        sales instance = new sales();
        instance.load();
     
    }

    /**
     * Test of main method, of class sales.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        sales.main(args);   
    }  
}
