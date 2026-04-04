package iitbombay.all;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {

        String haystack = "sadbutsad", needle = "sad";
        System.out.println(new FindtheIndexoftheFirstOccurrenceinaString().strStr(haystack, needle));

    }

    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}
