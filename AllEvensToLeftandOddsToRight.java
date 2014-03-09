public class AllEvensToLeftandOddsToRight {

      public static void main(String[] args) {
         move(new int[]{1,4,3,4,3,4,1,4,1,3,5,9,8,19,20});
         move(new int[]{2,3,5,8,10,1,3,5,6});
         move(new int[]{1,3,5,2,4,6});
         move(new int[]{2,4,6,1,3,5});

      }

      public static void move(int[] array) {
        int i=0;
        int j=array.length - 1;
        System.out.print("\n Before moves: \n");
        for (int input : array) {
            System.out.print(input + " ");
        }
        System.out.println();
        while ( i < j) {
           while ( array[i] % 2 == 0) {
               i++;
           }
           while ( array[j] % 2 != 0) {
               j--;
           }
           if (i < j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
           }
         }
         System.out.println("\n After moves: \n");

         for (int out : array) {
              System.out.print( out+" " );
         }

         System.out.println();
      } 

}
