public  class MergeSort{

      public static void main(String [] args) {

           int [] Array = { 2, 5, 5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,5, 6, 6, 6,9, 3, 0, 10, 50,25,40,30,20,1,8,7,0};
           System.out.println("Before sort:");
           for (int i:Array) {
              System.out.print(i+" ");
           }
           System.out.println();

           sort(Array,0, Array.length-1) ; 

           System.out.println("After sort:");
           for (int i:Array) {
              System.out.print(i+" ");
           }
           System.out.println();


      }
   
      public static void sort(int [] a, int low, int high) {
            if (low < high) {
                // pick N/2 as our pivot
                int mid = low + (high - low)/2;
                sort(a,low,mid);
                sort(a,mid+1,high);
                merge(a,low,mid,high);
            }


     }

     public static void merge(int []a , int low,int mid,int high) {

         // make a copy of current a, for storing the array after the combination
         int [] helper = new int[a.length] ; 
         for (int i = low; i<=high; i++) {
            helper[i] =  a[i]; 
         }

         int i = low;
         int j = mid + 1;
         int k = low;

         // combine the low part of a and its high part 
         while (i<=mid && j<=high) {
             if (helper[i] >= helper[j]){
               a[k] = helper[i];
               i++;
             } else {
               a[k] = helper[j];
               j++;
             }
             k++;
         }

         // copy the rest of low part of a if there is any
         while (i<=mid) {
           a[k] = helper[i];
           i++; k++;
         }


         // copy the rest of the high part of a if there is any
         while (j<=high) {
           a[k] = helper[j];
           j++;k++;
         }

         // out put each time we sort and let you watch the change sequence
         for (int Item:a) {
              System.out.print(Item+" ");
         }
         System.out.println();

     }


}
