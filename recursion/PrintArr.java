public class PrintArr {
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int index=0;
    print(arr,index);
 }   
 static void print(int arr[],int index){
    if(index==arr.length){
        return;
    }
    System.out.print(arr[index]+"  ");
    print(arr, index+1);
 }
}
