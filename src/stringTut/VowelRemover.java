package stringTut;

public class VowelRemover {
    public static void main(String[] args) {
        String input = "OpenAI";
        String result = vowelRemoveFunction(input);
        System.out.println(result);
    }

    private static String vowelRemoveFunction(String input) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!isCharacterIsVowel(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isCharacterIsVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}
