public class CompressString {

  private String uncompress_s;

  public static void main (String[] args) {

    CompressString s1 = new CompressString("FOOFIGHTERS");

    CompressString s2 = new CompressString("AAAAABBBBBCCCCCDDDDEEEa");

    CompressString s3 = new CompressString("aaaaabbbbbccddd");

    System.out.println(s1+"-->");
    System.out.println(s1.compress());
    System.out.println(s2+"-->");
    System.out.println(s2.compress());
    System.out.println(s3+"-->");
    System.out.println(s3.compress());

  }

  CompressString (String s) {
    this.uncompress_s = s;
  }

  public String toString() {
    return this.uncompress_s;
  }

  private String compress() {
    int i = 1, count = 1;
    char next,prev;
    String s="";
    String rs="";

    if (uncompress_s.length() == 0 ) {
      return "";
    }

    prev = uncompress_s.charAt(0);

    while (i < uncompress_s.length()) {
      next = uncompress_s.charAt(i);

      if (prev == next) {
        count ++ ;
      } else {
        if (count == 1)
          s="";
        else 
          s = String.valueOf(count);
        rs += prev + s;
        //System.out.print(prev+s);
        count = 1;
      }
      prev = next;
      i++;
    }

    if (count == 1) 
      s="";
    else 
      s = String.valueOf(count);
    rs += prev + s;
   //    System.out.println(prev+s);
    
    return rs;
  } 

}


