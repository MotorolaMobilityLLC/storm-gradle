package com.corp.base.lang;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ObjectUtilTest {

  private static final String STRING = "String";

  @Test
  public void valueElseDefault_int() {
    Integer num = 5;
    assertEquals(num, ObjectUtil.valueElseDefault(num, null));
    assertEquals(num, ObjectUtil.valueElseDefault(null, num));
  }

  @Test(expected = NullPointerException.class)
  public void valueElseDefault_nulls() {
    assertEquals(STRING, ObjectUtil.valueElseDefault(null, null));
  }

  @Test
  public void valueElseDefault_string() {
    assertEquals(STRING, ObjectUtil.valueElseDefault(STRING, null));
    assertEquals(STRING, ObjectUtil.valueElseDefault(null, STRING));
  }
}
