// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SecondLargest 
{
    static int sencondLargest(int arr[])
    {
        int max=-1;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                sMax=max;
                max=arr[i];
            }
            else if(sMax<arr[i] && arr[i]!=max)
            {
                sMax=arr[i];
            }
        }
        return sMax;
    }
    
    public static void main(String[] args) 
    {
        int arr[]={12,35,1,10,34,1};
        
         int min=smallest(arr);
        System.out.println("Min: "+min);
        
        int sMax=sencondLargest(arr);
        System.out.println("sMax: "+sMax);
    }
}
