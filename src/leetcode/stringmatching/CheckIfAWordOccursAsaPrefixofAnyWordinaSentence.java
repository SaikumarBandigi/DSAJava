package leetcode.stringmatching;

public class CheckIfAWordOccursAsaPrefixofAnyWordinaSentence {

    public static void main(String[] args) {

        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println(new CheckIfAWordOccursAsaPrefixofAnyWordinaSentence().isPrefixOfWord(sentence, searchWord));

    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }


}
