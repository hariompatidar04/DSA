// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SmallestAndLargest {
    static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
     static int smallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) 
    {
        int arr[]={10,20,30,40,50};
        int max=largest(arr);
        System.out.println("Max: "+max);
        
         int min=smallest(arr);
        System.out.println("Min: "+min);
    }
}
