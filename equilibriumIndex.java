import java.util.HashMap;

public class equilibriumIndex {
    public static void main(String[] args) {
     int A[] = {1,2,3,6,5};
     int n = A.length;
     System.out.println(A[n-2]);
     //5 --> n == 4

    }
    public static int[] reverseArray(int A[]){
         int n = A.length;
         int end = n-1;
         int ans[] = new int[n];
         for(int i = 0 ; i < n ; i++){
           ans[i] = A[end];
           end--;
         }
         return ans;
    }
}
