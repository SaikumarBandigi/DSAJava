package stringTut;

public class VowelChange {
    public static void main(String[] args) {
        String input = "AEIOU aeio u";
        String result = changeEveryVowelToNextVowel(input);
        //  System.out.println(result);  // Output: EIOUA eio a

        System.out.println(isCharacterIsVowel('a'));
    }

    private static String changeEveryVowelToNextVowel(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : input.toCharArray()) {
            if (isCharacterIsVowel(c)) {
                switch (c) {
                    case 'a' -> stringBuilder.append('e');
                    case 'e' -> stringBuilder.append('i');
                    case 'i' -> stringBuilder.append('o');
                    case 'o' -> stringBuilder.append('u');
                    case 'u' -> stringBuilder.append('a');
                    case 'A' -> stringBuilder.append('E');
                    case 'E' -> stringBuilder.append('I');
                    case 'I' -> stringBuilder.append('O');
                    case 'O' -> stringBuilder.append('U');
                    case 'U' -> stringBuilder.append('A');
                }
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    private static boolean isCharacterIsVowel(Character c) {
        if ("aeiouAEIOU".indexOf(c) != -1) {
            return true;
        } else {
            return false;
        }
    }

}
