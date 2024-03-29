/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 22 05:30:22 GMT 2019
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.ReturnMidiumNum;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReturnMidiumNum_ESTest extends ReturnMidiumNum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(530, 0, (-505));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, (-4535), 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, 1878, (-4309));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, 1731, 947);
      assertEquals(947, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, (-49), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum((-1587), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum((-1764), 0, 1731);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ReturnMidiumNum returnMidiumNum0 = new ReturnMidiumNum();
      int int0 = returnMidiumNum0.returnMidiumNum(0, 666, 0);
      assertEquals(0, int0);
  }
}
