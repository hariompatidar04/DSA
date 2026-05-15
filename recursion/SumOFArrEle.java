public class SumOFArrEle {
    public static void main(String[] args) {
      int arr[]={1,3,4,5,6};
      int i=0;
      System.out.println(sum(arr,i));

    }    
    static int sum(int []arr,int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i]+sum(arr,i+1);

    }
}
