public class convertStringToNum{

      public static void  main(String[] args){

           String n1="1234";
           String n2="0";
           String n3="-23";
           String n4="-1";
           String n5="ABCD";

           System.out.println( convertToNum(n1) );
           System.out.println( convertToNum(n2) );
           System.out.println( convertToNum(n3) );
           System.out.println( convertToNum(n4) );
           System.out.println( convertToNum(n5) );
      }

      public static int convertToNum(String n) {
          // if n is empty
          if (n.length()<0) {
            System.out.println("No string to convert");
            return -1;
          }

          boolean IsNegative = false;
          // if n is negative 
          if (n.charAt(0) == '-') {
              IsNegative = true;
              n = n.substring(1,n.length());
          } 
 
          int temp = 0;
          int factor = (int) Math.pow(10,n.length()-1);

          for (int i = 0; i<n.length();i++) {
               //test if char is digit in the string

               if (Character.isDigit(n.charAt(i))) {
                   temp = Character.getNumericValue(n.charAt(i)) * factor + temp;
                   factor = factor/10;
               } else {

                  System.out.println("please input digit only");
                  return(-1);
              }
          }
          if (IsNegative) {
               temp = - temp;
          }

          return temp;

      }

}
