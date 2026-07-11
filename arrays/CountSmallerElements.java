import java.util.*;
class CountSmallerElements 
{
    static int countSmallest(int c,int[] arr,int i,int count)
    {
        if(i>arr.length-1)
        {
            return count;
        }
        if(arr[c]>arr[i])
        {
            count++;  
        }
        return countSmallest(c,arr,i+1,count);
    }
    
    public static void main(String[] args) 
    {           
        int arr[] ={12,1,2,3,0,11,4};
        int index[] =new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            int res=countSmallest(i,arr,i+1,count);
            System.out.println(res);
            index[i]=res;
            
        }
        
        System.out.println(Arrays.toString(index));
        
    }
}
