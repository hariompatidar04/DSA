public class NToPowP {
    public static void main(String[] args) {
       int n=5;
       int p=2;
       System.out.println(pow(n,p));   
    }    
    static int pow(int n,int p)
    {
        if(p==1){
            return n;
        }
        return n*pow(n,p-1);
    }
}
