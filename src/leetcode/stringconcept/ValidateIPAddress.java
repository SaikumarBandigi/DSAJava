package leetcode.stringconcept;

public class ValidateIPAddress {
    public static void main(String[] args) {
        System.out.println(validIPAddress("0.1.1.1"));
    }


    public static String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        } else if (queryIP.contains(":")) {
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        } else {
            return "Neither";
        }
    }

    // Check IPv4
    private static boolean isIPv4(String ip) {
        String[] parts = ip.split("\\.", -1); // keep empty parts
        if (parts.length != 4) return false;

        for (String part : parts) {
            // Empty or length > 3
            if (part.length() == 0 || part.length() > 3) return false;

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0') return false;

            // Only digits
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) return false;
            }

            // Range check 0-255
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) return false;
        }
        return true;
    }

    // Check IPv6
    private static boolean isIPv6(String ip) {
        String[] parts = ip.split(":", -1); // keep empty parts
        if (parts.length != 8) return false;

        for (String part : parts) {
            // Length 1 to 4
            if (part.length() == 0 || part.length() > 4) return false;

            for (char c : part.toCharArray()) {
                boolean digit = (c >= '0' && c <= '9');
                boolean lower = (c >= 'a' && c <= 'f');
                boolean upper = (c >= 'A' && c <= 'F');
                if (!(digit || lower || upper)) return false;
            }
        }
        return true;
    }
}
