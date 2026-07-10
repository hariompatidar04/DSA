class SortArrayInAssendingOrder 
{
  public static void main(String[] args)
  {
    int arr[]={10,20,30,40,50};
    if(isSorted(arr))
    {
      //is Sorted
    }
    else
    {
      //is Not sorted
    }
  }  
    public static boolean isSorted(int[] arr) 
    {
        
        //Approch 1 Iterrative
    //   for(int i=1;i<arr.length;i++)
    //   {
    //       if(arr[i]<arr[i-1])
    //       {
    //           return false;
    //       }
    //   }
    //   return true;
    
    //Approch 2 Recursive
    int n=arr.length;
    return isSortedHelper(n,arr);
    }
    
    static boolean isSortedHelper(int n,int[]arr)
    {
       if(n==1||n==0){
           return true;
       }
       return arr[n-1]>=arr[n-2]&& isSortedHelper(n-1,arr);
    }
}
