import java.util.HashMap;
import java.util.HashSet;

public class A {
    public static void main(String[] args) {
       int A[] = {1,2,1,1};
       int B[] = {1,2};
       int ans [] = hashMapImplementation(A, B);
       for(int i = 0 ; i < B.length ; i++){
         System.out.print(ans[i]+" ");
       } 
       System.out.println();

       int C[] = {1,2,3,1,2 , 4}; //8
       int distinct = implementHashset(C);
       System.out.println(distinct);
    }
    //public static int[] findFrequency(int A[] , int B[]){
        // int n = A.length;
        // int m = B.length;
        // int ans[] = new int[m];

        // for(int i = 0 ; i < m ; i++){//1 2 O(M)
        //     int count= 0 ; 
        //     for(int j = 0 ; j < n ; j++){//1 2 1 1--O(N)-----O(N*M) ---O(N*N)
        //         if(B[i] == A[j]){
        //             count++;
        //         }
        //     }
        //     ans[i] = count;//3
        // }
        // return ans;
    public static int[] hashMapImplementation(int A[] , int B[]){
        int n = A.length;
        int m = B.length;
        int ans[] = new int[m];
        //ArrayList<Integer> al = new ArrayList<(); -- > Data Structure
        //1. Creating a hashmap
        HashMap <Integer , Integer> hm = new HashMap<>();
        //2. insert the elements in the hashmap
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(A[i])){
                int val = hm.get(A[i]);//1 , 1----> 1-->A[i] , 1+1;
                hm.put(A[i] , val+1);
            }else{
                //3. if the element is not present in the hashmap then we need to insert the element inside the hashmap
               hm.put(A[i] , 1);
            }
        }
        
       for(int i = 0 ; i < m ; i++){
        int count = 0;
        if(hm.containsKey(A[i])){
         count = hm.get(A[i]);
       }
       ans[i] = count;
       }

       return ans;   
    }
    public static int printdistinct(int A[]){
        int n = A.length;
        // 1221 --> 2
        int size = 0;
        for(int i = 0 ; i < n ; i ++){
            int j ;
            for(j = 0 ; j < i ; j++)
              if(A[i]  == A[j]){
                break;
              }
            if(i == j){
              size++;  
            }
        
    }
        return size;
    }

    public static int implementHashset(int A[]){
        HashSet<Integer>hs = new HashSet<>();
        for(int i = 0 ; i < A.length ; i++){
         hs.add(A[i]);
        }
        return hs.size();
    }
}
