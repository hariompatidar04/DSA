class IsPalindrome 
{
    static boolean isPalindrome(int n)
    {
        int org=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev==org;
    }
    public static void main(String[] args) 
    {               
        int arr[]={101, 200, 303, 401104, 500};
         for(int i:arr){
             if(isPalindrome(i)){
                 System.out.println(i+" Palindrome");
             }
             else{
                 System.out.println(i+" Not Palindrome");
             }
         }
    }
}
