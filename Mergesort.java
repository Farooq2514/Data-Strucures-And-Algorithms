public class Mergesort {
    public static void main(String[] args) {
        int A[] = {5,4,3,1,2,6,9,11,10,7,8};
        mergesort(A, 0, A.length-1);
        for(int num : A){
            System.out.print(num+" ");
        }


    }
    public static void mergesort(int A[] , int s , int e){
       if(s < e){
        int mid = (s+e)/2;
        mergesort(A , s , mid);
        mergesort( A, mid+1, e);
        merge(A, s, mid, e);
    }
}
    public static int[] merge(int A[] , int s , int mid , int e){
        int p1 = s;
        int p2 = mid+1;
        int temp[] = new int[A.length];
        int p3 = 0;
        while(p1 <= mid && p2 <= e){
            if(A[p1] <= A[p2]){
                temp[p3] = A[p1];
                p1++;
                p3++;
            }else{
                temp[p3] = A[p2];
                p2++;
                p3++;
            }
        }
        while(p1 <= mid){
            temp[p3] = A[p1];
            p1++;
            p3++;
        }
        while(p2 <= e){
            temp[p3] = A[p2];
            p2++;
            p3++;
        }
        for(int i = s ; i <= e ; i++){
            A[i] = temp[i - s];
        }
        return A;
    }
}
