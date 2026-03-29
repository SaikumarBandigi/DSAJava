package leetcode.stringconcept;

public class CheckifBinaryStringHasatMostOneSegmentofOnes {

    public static void main(String[] args) {
        String s = "10";
        System.out.println(new CheckifBinaryStringHasatMostOneSegmentofOnes().checkOnesSegment(s));
    }

    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

}
