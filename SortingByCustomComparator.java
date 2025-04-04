import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingByCustomComparator {
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(11);
        al.add(21);
        al.add(15);
        al.add(12);
        al.add(13);
        al.add(14);
        Collections.sort(al);
        System.out.println("This is soted Array ");
        for(int num : al){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("using lamdas ");
        //using Lambdas
        Collections.sort(al , (a , b) -> b-a);
         System.out.println(al);

         //Using Streams
         System.out.println("Sorting this using lamda ");
         List<Integer> stream = al.stream().sorted((a , b) -> b-a ).collect(Collectors.toList());
         System.out.println(stream+" ");
    }
}
