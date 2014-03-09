import java.util.HashMap;

public class FindAllPairs {

void findPair(int[] a,int Sum) {
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i=0;i<a.length;i++) {
           if(hm.get(a[i])==null) {
                    hm.put(a[i], Sum-a[i]);
           }
    }
    System.out.println(hm);
    for(int i=0;i<a.length;i++) {
           if(hm.get(a[i])!=null && hm.get(hm.get(a[i]))!=null) {
                   System.out.println("Pair Values are : "+a[i]+" "+hm.get(a[i]));
                   hm.remove(a[i]);
                   hm.remove(Sum-a[i]);
           }
    }
}

public static void main(String[] args) {
     int[] a={2,2,4,6,4,7};
     FindAllPairs gpv=new FindAllPairs();
     gpv.findPair(a,8);
}

}

