public class ArrayOfObject {
  public static void main (String[] args){
    Date [] dates;
    dates = new Date[3];
    dates[0] = new Date(2014,1,1);
    dates[1] = new Date(2014,2,2);
    dates[2] = new Date(2014,3,3);
    for (Date d : dates) {
      d.PrintDate();
    }

    // second way to establish object array
    Date  dates2[] = {new Date(2013,1,1),new Date(2013,2,2),new Date(2013,3,3)};

    for (Date d : dates2) {
      d.PrintDate();
    }
  }
}
class Date {
  private int year;
  private int month;
  private int day;

  Date(int year,int month,int day){
       this.year = year;
       this.month = month;
       this.day = day;
  }
  public void PrintDate(){
    System.out.println("The date is " + this.year + "-" + this.month + "-" + this.day);
  }
}
