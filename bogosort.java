import java.util.Arrays;
public class bogosort {
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
  
  public static int[] sort(int[] array) {
    while (!isSorted(array)) { 
      shuffle(array);
    }
    return array;
  }
  //TEST - UNPROFESSIONAL
  //public static void main(String[] args) {
  //  int[] array = {2, 9, 1, 21, 45, 5};
  //  System.out.println("The old array was: " + Arrays.toString(array));
  //  System.out.println("Now sorted: " + Arrays.toString(sort(array)));
  //  System.out.println("This array was sorted with the most efficient sorting method: BogoSort. TM.");
  //}
  //TEST
  //Und leo ist ein fgit
}
