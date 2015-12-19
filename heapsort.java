public class HeapSort extends Algorithm {
  public static int[] sort(int[] a) {
    generateMaxHeap(a);
    
    //hier wird sortiert
    for(int i = a.length -1; i > 0; i--) {
        swap(a, i, 0);
        sink(a, 0, i);
    }
    return a;
  }
} 
  
