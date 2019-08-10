public class Palindrome {
    //Determine integer is palindrome or not without converting the integer to string.
    public static void main(String[] args) {
        System.out.println("Palindrome : "+isPalindrome(12321));
    }

    public static boolean isPalindrome(int x){
        int rev=0;
        if(x<0 || (x%10==0 && x!=0) ){
            return false;
        }

        while (x>rev){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if(x == rev || x == rev/10){
            return true;
        }
        return false;
    }
}
