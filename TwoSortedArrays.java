public class TwoSortedArrays {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = {6,7,8,9,15};
        TwoSortedArrays ts = new TwoSortedArrays();
        int ans[] = ts.mergetwoSortedArrays(A, B);
        for(int num : ans){
            System.out.print(num+" ");
        }


    }
    public int[] mergetwoSortedArrays(int A[] , int B[]){
        int n = A.length;
        int m = B.length;
        int ans[] = new int[n+m];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while(p1 < n && p2 < m){
         if(A[p1] <= B[p2]){
            ans[p3] = A[p1]; 
            p3++;
            p1++;
         }else{
            ans[p3] = B[p2];
            p2++;
            p3++;
         }
        }
        while(p1 < n ){
            ans[p3] = A[p1];
            p1++;
            p3++;
        }
        while(p2 < m){
            ans[p3] = B[p2];
            p2++;
            p3++;
        }
        return ans;
    }
}
