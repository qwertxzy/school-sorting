public class HeapSort {
  /**  
  * sortiert ein Array mit heapsort
  * @param a das array
  */
  public static int[] sort(int[] a) {
    generateMaxHeap(a);
    
    //hier wird sortiert
    for(int i = a.length -1; i > 0; i--) {
        swap(a, i, 0);
        sink(a, 0, i);
    }
    return a;
  }
  
  private static void generateMaxHeap(int[] a) {
    for(int i = (a.length / 2) - 1; i >= 0 ; i--) {
        sink(a, i, a.length);
    }
  }
  
  private static void sink(int[] a, int i, int n) {
    while(i <= (n / 2) - 1) {
        int kindIndex = ((i+1) * 2) - 1; // berechnet den Index des linken kind
      
        //bestimme ob ein rechtes Kind existiert
        if(kindIndex + 1 <= n -1) {
          //rechtes kind existiert
          if(a[kindIndex] < a[kindIndex+1]) {
              kindIndex++; // wenn rechtes kind größer ist nimm das 
          }
        }
        
        //teste ob element sinken muss 
        if(a[i] < a[kindIndex]) {
          swap(a,i,kindIndex); //element versenken
          i = kindIndex; // wiederhole den vorgang mit der neuen position
        } else break;
    }
  }
  
  private static void swap(int[] a, int i, int kindIndex) {
    int z = a[i];
    a[i] = a[kindIndex];
    a[kindIndex] = z;
  }   
} 
  
