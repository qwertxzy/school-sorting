public class Algorithm {
  //Method for easy swapping of ints in array
  public static void swap(int[] a, int x, int y) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
  }
  
  //Sorting
  public static boolean isSorted(int[] array){
    for(int i = 0; i < array.length-1; i ++){ 
      if (array[i] > array[i+1]) {
        return false;
      }
    }
    return true;
  }
  
  //Fisher-Yates-Shuffle, abgewandelt
  public static void shuffle(int[] array) {
    int len = array.length;
    for (int i = 0; i < array.length; i++) {
      int random = i + (int) (Math.random() * (len - i));
      int re = array[random];
      array[random] = array[i];
      array[i] = re;
    }
  }
  
  public static void generateMaxHeap(int[] a) {
    for(int i = (a.length / 2) - 1; i >= 0 ; i--) {
      sink(a, i, a.length);
    }
  }
  
  public static void sink(int[] a, int i, int n) {
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
}   
