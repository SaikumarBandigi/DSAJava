package leetcode.HashTableConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityFrequencyCharacters {

    public static void main(String[] args) {

        String s = "aaabbbccdddde";
        System.out.println(new MajorityFrequencyCharacters().majorityFrequencyGroup(s));
    }

    public String majorityFrequencyGroup(String s) {

        // Count frequency of each character
        Map<Character, Long> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0L) + 1);
        }

        // Group characters by frequency
        Map<Long, String> freqGroup =
                charFreq.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                                Collectors.mapping(e -> String.valueOf(e.getKey()), Collectors.joining())));

        // Find majority frequency group
        return freqGroup.entrySet()
                .stream()
                .max((a, b) -> {

                    int sizeCompare = Integer.compare(a.getValue().length(), b.getValue().length());

                    // If group sizes equal, compare frequency
                    if (sizeCompare == 0) {
                        return Long.compare(a.getKey(), b.getKey());
                    }

                    return sizeCompare;
                })
                .get()
                .getValue();
    }

}
