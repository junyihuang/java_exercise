public class TestSubArrayInArray {


      public static void main(String[] args) {
          int[] Array1 = { 1,2,3,4,5,7,10,11,12,32 };
          int[] Array2 = { 1,2,3,4,5,7,10,11,12,32,33 };
          int[] Array3 = {1,2,3,4,5};

          if ( TestSubArray(Array2,Array1) >= 0) {

              System.out.println("\nArray: ");
              for (int i:Array1) {
                    System.out.print(i+" ");
              }
              System.out.println("\nSub Array: ");
              for (int i:Array2) {
                    System.out.print(i+" ");
              }
          }
          if ( TestSubArray(Array3,Array1) >= 0) {

              System.out.println("Array: ");
              for (int i:Array1) {
                    System.out.print(i+" ");
              }
              System.out.println("\nSub Array: ");
              for (int i:Array3) {
                    System.out.print(i+" ");
              }
           }
       }

       public static int TestSubArray(int[] SubArray, int[] Array) {
          // if the length of subarray is larger than the one of array, return failure
           if (SubArray.length > Array.length ) {
               return -1;
           }

          // if either one of arrays are empty , return failure
           if (SubArray.length < 1 || Array.length < 1 ) {
              return -1 ;
           }
          // Start_Index of Array to match 
           int i = 0 ; //use to traverse Array
           int start_index = -1; //use to mark the start index of matching subarray
           
           while ( i < Array.length) {
              // only match first element of subarray, will start to match it
              if (SubArray[0] == Array[i]) {
                  start_index = i; // mark down the start point of i
                  int j=1 ; //use to traverse subarray to see if rest of Array match
                  while ( j <  SubArray.length  && (i+j) < Array.length) {
                      if ( SubArray[j] == Array[i+j] ) {
                           j++;
                      } else {
                           break;
                      }
                  }
                  // if now j = SubArray.length-1, that said SubArray has matched
                  if (j == SubArray.length ) {
                     return start_index;
                  } 
              }
              i++;
             }
             return -1;
        }

}
