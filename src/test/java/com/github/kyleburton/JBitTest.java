package com.github.kyleburton;

import org.junit.Test;
import static org.junit.Assert.*;


public class JBitTest {
  @Test
  public void testSmall () {
    JBit bset = new JBit();
    assertFalse( bset.get(0) );
    assertFalse( bset.get(1) );
    assertFalse( bset.get(2) );
    assertFalse( bset.get(3) );
    bset.set(255);
    assertTrue( bset.get(255) );
  }

  @Test
  public void testLarge() {
    JBit bset = new JBit();
    bset.set(2147483647L);
    bset.set(4294967294L);

    assertTrue(  bset.get(2147483647L) );
    assertTrue(  bset.get(4294967294L) );
    assertFalse( bset.get(7L * 4294967294L) );
    assertTrue(  bset.getNumSetsAllocated() > 1 );
  }

}
