package com.github.kyleburton;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * JBit - bit set with a Long.MAX_VALUE upper limit.
 * @author Kyle Burton <kyle.burton@gmail.com>
 */
public class JBit {
  private long width = 0;
  private List<BitSet> _bitSets;

  public JBit ( ) {
    _bitSets = new ArrayList<BitSet>();
  }

  public void set ( long bitNum ) {
    int offset    = (int) ( bitNum / (long)Integer.MAX_VALUE );
    int remainder = (int) ( bitNum % (long)Integer.MAX_VALUE );

    while ( _bitSets.size() <= offset ) {
      _bitSets.add( new BitSet() );
    }

    BitSet target = _bitSets.get(offset);
    target.set(remainder);
  }

  public boolean get ( long bitNum ) {
    int offset    = (int) ( bitNum / (long)Integer.MAX_VALUE );
    int remainder = (int) ( bitNum % (long)Integer.MAX_VALUE );

    if ( _bitSets.size() <= offset ) {
      return false;
    }

    BitSet target = _bitSets.get(offset);
    return target.get(remainder);
  }

  public int getNumSetsAllocated() {
    return _bitSets.size();
  }
}
