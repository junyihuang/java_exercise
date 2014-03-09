public  class BubbleSort {

      public static void main(String [] args) {

           int [] Array = { 2, 5, 5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,9, 3, 0, 10, 50,25,40,30,20,1,8,7,0};
           System.out.println("Before sort:");
           for (int i:Array) {
              System.out.print(i+" ");
           }
           System.out.println();

           sort(Array) ; 

           System.out.println("After sort:");
           for (int i:Array) {
              System.out.print(i+" ");
           }
           System.out.println();


      }
   
      public static void sort(int [] a) {

            if (a.length <= 1) {
                return ;
            }

            int n = a.length;
            boolean swap = true;
            int j = 0;
            while (swap) {
                 j++;
                 swap = false ; 
                 for (int i=0; i<n-j; i++ ) {
                    if (a[i] > a[i+1]) {
                         int temp = a[i+1];
                         a[i+1] = a[i];
                         a[i] = temp;
                         swap = true;
                    }
                } 
            }

      }
}
