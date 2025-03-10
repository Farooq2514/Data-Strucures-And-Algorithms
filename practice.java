class practice{
    public static void main(String[] args) {
        int A[] = {-3 ,6,2,4,5,2,8,-9,3,1};
        int mat[][] = {{4 , 8} , {3,7}, {1,3},{7,7},{3,6},{0,4}};
        int ans[] = rangesum(A, mat);
        //System.out.println(ans+" ");
        for(int i = 0 ; i < mat.length ; i++){
            System.out.println(i+" "+ans[i]+" ");
        }
       
    }
    public static int[] rangesum(int A[] , int mat[][]){
        int n = A.length;
        int m = mat.length;
        int ans[] = new int[m];
        for(int i = 0 ; i < m ; i++){
            ///
           int start = mat[i][0];
           int end = mat[i][1];
           int sum = 0;
           for(int j = start ; j <= end ; j++){
            sum = sum + A[j];
           }
           ans[i] = sum ;
        }
        return ans;
    }

    public static int[] prefix(int A[]){
        int n = A.length;
        int psum[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                psum[0] = A[0];
            }else{
                psum[i] = psum[i-1] + A[i];
            }
        }
        return psum;
    }
}