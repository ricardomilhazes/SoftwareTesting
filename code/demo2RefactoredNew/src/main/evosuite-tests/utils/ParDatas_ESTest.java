/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 16 20:01:55 GMT 2020
 */

package utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import utils.ParDatas;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParDatas_ESTest extends utils.ParDatas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas((GregorianCalendar) null, (GregorianCalendar) null);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-29), (-29), 1536, 3414);
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setLenient(false);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertEquals(0, gregorianCalendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(680, 317, 317, 1116, 2156);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1));
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertTrue(gregorianCalendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(555, (-1458), 1);
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setFirstDayOfWeek(0);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setFirstDayOfWeek((-34));
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataInicio();
      assertEquals((-34), gregorianCalendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas((GregorianCalendar) null, (GregorianCalendar) null);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataFim();
      assertNull(gregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-29), (-29), 1536, 3414);
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setLenient(false);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataFim();
      assertFalse(gregorianCalendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      TimeZone timeZone0 = TimeZone.getTimeZone("");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek(0);
      parDatas0.setDataFim(mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataFim();
      assertTrue(gregorianCalendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(680, 317, 317, 1116, 2156);
      mockGregorianCalendar0.setMinimalDaysInFirstWeek((-1));
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataFim();
      assertEquals(1, gregorianCalendar0.getFirstDayOfWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      mockGregorianCalendar0.setFirstDayOfWeek((-34));
      GregorianCalendar gregorianCalendar0 = parDatas0.getDataFim();
      assertSame(gregorianCalendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      // Undeclared exception!
      try { 
        parDatas0.isAvailable((ParDatas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("utils.ParDatas", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      parDatas0.setDataInicio((GregorianCalendar) null);
      ParDatas parDatas1 = new ParDatas(parDatas0);
      // Undeclared exception!
      try { 
        parDatas1.equals(parDatas0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("utils.ParDatas", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParDatas parDatas0 = null;
      try {
        parDatas0 = new ParDatas((ParDatas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("utils.ParDatas", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      ParDatas parDatas1 = new ParDatas();
      assertTrue(parDatas1.equals((Object)parDatas0));
      
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 6, 6, 6);
      parDatas1.setDataFim(mockGregorianCalendar0);
      boolean boolean0 = parDatas1.equals(parDatas0);
      assertFalse(parDatas1.equals((Object)parDatas0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2950, 2950, 1, 0, 2419);
      ParDatas parDatas1 = new ParDatas(parDatas0);
      assertTrue(parDatas1.equals((Object)parDatas0));
      
      parDatas1.setDataInicio(mockGregorianCalendar0);
      boolean boolean0 = parDatas0.equals(parDatas1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      ParDatas parDatas1 = new ParDatas(parDatas0);
      boolean boolean0 = parDatas0.equals(parDatas1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      boolean boolean0 = parDatas0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      boolean boolean0 = parDatas0.equals(parDatas0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-29), (-29), 1536, 3414);
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      boolean boolean0 = parDatas0.equals("m@N%Kg");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas((GregorianCalendar) null, (GregorianCalendar) null);
      parDatas0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(680, 317, 317, 1116, 2156);
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      parDatas0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-16), (-16), (-16), (-16), (-16));
      ParDatas parDatas0 = new ParDatas(mockGregorianCalendar0, mockGregorianCalendar0);
      ParDatas parDatas1 = new ParDatas();
      boolean boolean0 = parDatas1.isAvailable(parDatas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2950, 2950, 1, 0, 2419);
      ParDatas parDatas1 = new ParDatas(parDatas0);
      parDatas1.setDataInicio(mockGregorianCalendar0);
      boolean boolean0 = parDatas0.isAvailable(parDatas1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      ParDatas parDatas1 = new ParDatas();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2408), (-2408), (-2408), (-2408), (-2408));
      parDatas1.setDataInicio(mockGregorianCalendar0);
      parDatas0.setDataFim(mockGregorianCalendar0);
      boolean boolean0 = parDatas1.isAvailable(parDatas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2950, 2950, 1, 0, 2419);
      ParDatas parDatas1 = new ParDatas(parDatas0);
      parDatas1.setDataInicio(mockGregorianCalendar0);
      boolean boolean0 = parDatas1.isAvailable(parDatas0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      String string0 = parDatas0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ParDatas parDatas0 = new ParDatas();
      ParDatas parDatas1 = parDatas0.clone();
      assertNotSame(parDatas1, parDatas0);
  }
}