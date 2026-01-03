package stringTut;

public class CharacterCounterInString {
    public static void main(String[] args) {
        String input = "aa";
        System.out.println(countCharacters(input));
    }

    public static String countCharacters(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();

        int count = 1;
        char prevCharacter = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (prevCharacter == currentChar) {
                count++;
            } else {
                stringBuilder.append(count).append(prevCharacter);
                count = 1;
                prevCharacter = currentChar;
            }
        }

        stringBuilder.append(count).append(prevCharacter);
        return stringBuilder.toString();

    }
}
