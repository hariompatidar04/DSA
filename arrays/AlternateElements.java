class AlternateElements 
{
    
    public static void print(int arr[],int i)
    {
        if(i>arr.length-1){
            return;
        }
        System.out.println(arr[i]);
        print(arr,i+2);
    }
    public static void main(String[] args) 
    {               
        int arr[]={10, 20, 30, 40, 50};
        //Approch-1 using iterative way
        //printAlternate element
        // for(int i=0;i<arr.length;i+=2)
        // {
        //     System.out.println(arr[i]);
        // }
        //Approch-2 using Recursive way
        print(arr,0);
    }
}
