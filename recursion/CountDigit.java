public class CountDigit {

    public static void main(String[] args) {
        int n=234;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return 1+sum(n/10);
    }
}