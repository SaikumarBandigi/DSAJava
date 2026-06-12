package leetcode.stringconcept;

public class NumberofSegmentsinaString {

    public static void main(String[] args) {

        String s = "  ";
        System.out.println(new NumberofSegmentsinaString().countSegments(s));

    }

    public int countSegments(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        return s.split("\\s+").length;
    }

}
