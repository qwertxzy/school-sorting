import java.util.Arrays;

public class BogoSort extends Algorithm {
  public static int[] sort(int[] array) {
    while (!isSorted(array)) { 
      shuffle(array);
    }
    return array;
  }
}
