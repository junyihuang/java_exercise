class Exe1 {

   int v_int;
   byte v_byte;
   char v_char;
   short v_short;
   long v_long;
   float v_float;
   double v_double;
   boolean v_boolean;
   private static int numbers;
   
   public Exe1 () {
   
    //v_int = 2147483647;
    //v_byte = 127;
    //v_char = 'a';
    //v_short = 32767;
    //	v_long = 922337203685477580L;
    //v_float = 0.111f;
    //v_double = 0.222d;
    //v_boolean = false;
    numbers++;
     
   }
   
   public void print() {
   	   
      System.out.println("v_int="+v_int);
      System.out.println("v_byte="+v_byte);
      System.out.println("v_short="+v_short);
      System.out.println("v_long="+v_long);
      System.out.println("v_float="+v_float);
      System.out.println("v_double="+v_double);
      System.out.println("v_boolean="+v_boolean);   	   
      System.out.println("number of instance is " + numbers ); 	   
   }
   
}

class Exe1Main{
   
   public static void main(String[] args) {
   
    Exe1 v= new Exe1();
    
    v.print();
    //System.out.println("number of instance is " + Exe1.numbers );
      
   
   }



}
