public class BubbleSort extends Algorithm {
  // Main Sorting Method
  public static int[] sort(int[] a) {
    for (int x = a.length; x > 1; x--) {
      for (int y = 0; y < x - 1; y++) {
        if (a[y] > a[y + 1]) {
          swap(a, y, y + 1);
        }
      }
    }
    return a;
  }
}
