public  class InsertionSort{

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

            for (int i=1;i<n;i++) {
                 int temp = a[i];
                 int j = i - 1;
                 while ( j>=0 && a[j] > temp) {
                         a[j+1] = a[j];
                         j--;
                 }
                 a[j+1] = temp;
            } 

     }
}
