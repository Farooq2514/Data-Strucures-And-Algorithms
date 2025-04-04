import java.util.*;
import java.util.HashSet;
import java.util.Comparator;

public class distinct {
    public static void main(String[] args) {
        int A[] = {1,2,3,5,4};
        int B = 10;
        int pair = pairsum(A, B);
       // System.out.println(pair);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Before Sorting the normal order");
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);;
    
       Runnable runnable = ()->{
        //  System.out.println("hello umar");
       };
       Thread t = new Thread(runnable);
       t.start();
       System.out.println("After the Sorting");
       Collections.sort(al , (a , b) ->{
        if(a > b){
            return -1;
        }else if(a < b){
            return 1;

        }else{
            return 0;
        }
       });
       System.out.println(al+" ");
    
    }
    

    public static int pairsum(int A[] , int B){
      int n = A.length;
    //   for(int i = 0 ; i < n ; i++){
    //     for(int j = i + 1 ; j < n ; j++){
    //         if(A[i] + A[j] == B){
    //             return 1;
    //         }
    //     }
    //   }
    //   return 0;
     HashSet <Integer> hs = new HashSet();
       for(int i = 0 ; i < n ; i++){
        if(hs.contains(B - A[i])){//- > 1 2 3 4 5 6 --10 -------->
            return 1;
        }else{
            hs.add(A[i]);//------------------>1 2 3 4 5 return 1;
        }
       }
       return 0;

    }
}
