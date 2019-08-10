public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Reverse Integer = "+reverse(1534236469));
    }
    public static int reverse(int x) {
         long modulo=0;
         long divisor=0;
         long rev=0;
         while (x!=0){
            modulo=(modulo*10)+x%10;
            divisor=x/10;
            rev=modulo+divisor;
            x=x/10;
         }
         if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
             return 0;
         }
         return (int) rev;
        }
}
