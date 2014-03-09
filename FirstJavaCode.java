public class FirstJavaCode {

   public static void main ( String [] args ) {
   	   
        Demo d = new Demo();
        d.printMessage();
        
        switch (7) {
        case 3: 
        	System.out.println("input is 3");
        	break;
        case 4:
        	System.out.println("input is 4");
                break;
        	
        default :
                System.out.println("input no match");
                break;
                	
        case 5: 
        	System.out.println("input is 5");
        	break;
        
        case 6:
        	System.out.println("input is 6");
        	break;
        }
        
}
}

class Demo {
   String message = "hello, this is my first Java code" ;
   
   public void printMessage() {
   
       System.out.println(message);
   }
       
}



