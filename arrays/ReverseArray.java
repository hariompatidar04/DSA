import java.util.Arrays;
import java.util.Stack;

public class ReverseArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
     public  static void reverseArray(int arr[]) 
    {
        //Approch 1 using Stack
        Stack<Integer> e=new Stack<>();
        for(int i:arr)
        {
            e.push(i);
        }
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=e.peek();
            e.pop();
        }
        
        
        //Approch 2 using swapping
        
        // int i=0;
        // int j=arr.length-1;
        // while(i<j)
        // {
        //     int temp=arr[j];
        //     arr[j]=arr[i];
        //     arr[i]=temp;
        //     i++;j--;
        // }
    }
}