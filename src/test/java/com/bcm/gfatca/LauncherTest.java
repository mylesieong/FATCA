package com.bcm.gfatca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

public class LauncherTest {

    private static Launcher launcher;
    @BeforeClass
    public static void runOnceBeforeClass() {
	launcher = new Launcher();
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test_method_1() {
	int s=1;
	assertEquals(1,s);
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
	int s=5;
	assertEquals(5,s);
        System.out.println("@Test - test_method_2");
    }

}
