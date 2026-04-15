package leetcode.stringconcept;

public class LicenseKeyFormatting {
    public static void main(String[] args) {


        String s = "5F3Z-2e-9-w";
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting(s, 4));

    }

    public String licenseKeyFormatting(String s, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        String sWord = sb.toString().toUpperCase();  // 5F3Z 2E9W


        StringBuilder sBuilder = new StringBuilder(); // W9E2-Z3F5
        int count = 0;

        for (int i = sWord.length() - 1; i >= 0; i--) {

            if (count == k) {
                sBuilder.append('-');
                count = 0;
            }

            sBuilder.append(sWord.charAt(i));
            count++;
        }

        return sBuilder.reverse().toString();
    }

}

