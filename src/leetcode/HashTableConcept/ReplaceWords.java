package leetcode.HashTableConcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {

        List<String> dictionary = Arrays.asList("catt", "cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";

        System.out.println(new ReplaceWords().replaceWords(dictionary, sentence));
        System.out.println(new ReplaceWords().replaceWordss(dictionary, sentence));
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split("\\s+");  // aadsfasf  absbs  bbab  cadsfafs

        for (int i = 0; i < words.length; i++) {
            String shortestRoot = words[i];
            for (String root : dictionary) {
                if (words[i].startsWith(root)) {
                    if (root.length() < shortestRoot.length()) {
                        shortestRoot = root;
                    }
                }
            }
            words[i] = shortestRoot;
        }

        return String.join(" ", words);
    }

    public String replaceWordss(List<String> dictionary, String sentence) {
        // sort dictionary by length (smallest root first)
        Collections.sort(dictionary, new CustomComparator());

        String[] eachWord = sentence.split("\\s+");

        for (int i = 0; i < eachWord.length; i++) {
            for (String root : dictionary) {
                if (eachWord[i].startsWith(root)) {
                    eachWord[i] = root;
                    break;
                }
            }
        }

        return String.join(" ", eachWord);
    }

}

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}