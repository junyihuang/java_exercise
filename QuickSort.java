public class QuickSort {

   private int[] inputArray;
   private int length;

   public int[] sort(int[] values) {
     if (values == null || values.length == 0) {
       return values;
     }

     this.inputArray = values;
     length = values.length;
     quicksort (0,length - 1);
     return values;
   }

   private void quicksort(int low, int high) {

     int i = low, j = high;
     // get the pivot element from the middle of the list
     int pivot = inputArray[low + (high - low)/2];
    
     //dive into two lists
     while (i <= j) {

       while (inputArray[i] < pivot) {
         i++;
       }

       while (inputArray[j] > pivot) {
         j--;
       }

       if (i<=j) {
         int temp = inputArray[j];
         inputArray[j] = inputArray[i];
         inputArray[i] = temp;

         i++;
         j--;
       }

       //recursion
       if (low < j) {
         quicksort(low,j);
       }

       if (i < high){
         quicksort(i,high);
       }
     }


   }

  public static void main(String [] args) {

   int [] Array = { 2, 5, 5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,9, 3, 0, 10, 50,25,40,30,20,1,8,7,0};
   System.out.println("Before sort:");
   for (int i:Array) {
        System.out.print(i+" ");
   }
   System.out.println();
   QuickSort QS = new QuickSort();

   int [] Array_B;
   Array_B  = QS.sort(Array) ;
   System.out.println("After sort:");
   for (int i:Array_B) {
       System.out.print(i+" ");
   }
   System.out.println();

  }


}
