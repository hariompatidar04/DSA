class PlaceAllZeroAtEnd
{

main(..)
{
    arr
    pushZerosToEnd(arr)
}
void pushZerosToEnd(int[] arr) {
        int i=0,j=0;
        while(j<arr.length)
        {
           if(arr[j]==0)
           {
              j++;
           }
           else if(arr[j]!=0)
           {
               arr[i]=arr[j];
               i++;
               j++;
           }
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
    }
}
