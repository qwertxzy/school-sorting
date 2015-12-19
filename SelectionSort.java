public class SelectionSort extends Algorithm {
  public static int[] sort(int[] a){
    for (int x = 0; x < a.length - 1; x++)
    {
      int index = x;
      for (int y = x + 1; y < a.length; y++)
      if (a[y] < a[index])
      index = y;
      
      int minNumber = a[index]; 
      a[index] = a[x];
      a[x] = minNumber;
    }
    return a;
  }
}