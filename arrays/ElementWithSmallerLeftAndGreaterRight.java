import java.util.*;
class ElementWithSmallerLeftAndGreaterRight 
{
  static boolean isValidPrev(int c,int arr[],int prev){
      if(prev==-1)
      {
          return true;
      }
      if(arr[c]<arr[prev])
      {
          return false;
      }
      return isValidPrev(c,arr,prev-1);
  }
  
  static boolean isValidNext(int c,int arr[],int next){
      if(next>arr.length-1)
      {
          return true;
      }
      if(arr[c]>arr[next])
      {
          return false;
      }
      return isValidNext(c,arr,next+1);
  }
  
  static int isValid(int []arr)
  {
      for(int i=0;i<arr.length;i++)
        {
            //check for smallest
           if(isValidPrev(i,arr,i-1))
           {
               if(isValidNext(i,arr,i+1)){
                   return arr[i];
               }
           } 
        }
        return -1;
  }
    public static void main(String[] args) 
    {           
        int arr[]={5};
        int res=isValid(arr);
        if(res!=-1){
            System.out.println("ANS: "+res);
        }
        else{
            System.out.println("no such element exists");
        }
        
    }
}
