class Sum {
 
   
    boolean findN(int A[], int arr_size, int sum)
    {
        int l, r;
 
       
        for (int i = 0; i < arr_size - 2; i++) 
        {
 
            for (int j = i + 1; j < arr_size - 1; j++)
            {
 
                for (int k = j + 1; k < arr_size; k++)
                {
                    if (A[i] + A[j] + A[k] == sum)
                     { 
                        System.out.print("Output is " + A[i] + ", " + A[j] + ", " + A[k]);
                       
                        return true;
                    }
                }
            }
        }
 
     
       return false;
    }
 
   
   
    public static void main(String[] args)
    {
        Sum triplet = new Sum();
        int A[] = { 1,2,6,9,3 };
        int sum = 13;
        int arr_size = A.length;
 
        triplet.findN(A, arr_size, sum);
    }
}