package stringTut;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {

        String s1="";

        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }

        if(s.equals(s1))
        {
            return true;
        }
        else{
            return false;
        }

    }
}
