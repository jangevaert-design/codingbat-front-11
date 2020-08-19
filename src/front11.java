public class front11 {
  public int[] front11(int[] a, int[] b) {

    if (a.length > 0 && b.length > 0) {
      int[] c = new int[2];
      c[0] = a[0];
      c[1] = b[0];
      return c;
    }
    if (a.length > 0 && b.length == 0) {
      int[] c = new int[1];
      c[0] = a[0];
      return c;
    }
    if (b.length > 0 && a.length == 0) {
      int[] c = new int[1];
      c[0] = b[0];
      return c;
    }
    int[] c = new int[0];
    return c;
  }
}
