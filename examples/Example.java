import com.github.kyleburton.JBit;

public class Example {
  public static void main (String [] args ) {
    JBit bitSet = new JBit();
    bitSet.set( 2L * (long)Integer.MAX_VALUE );
    for (int ii = -5; ii <= 5; ++ii ) {
      long jj = (long)ii + (2L * (long)Integer.MAX_VALUE);
      System.out.println("set?[" + ii + "/" + jj + "]" + bitSet.get(jj));
    }
  }
}
