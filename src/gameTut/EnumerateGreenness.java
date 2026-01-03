package gameTut;

import java.util.Scanner;

public class EnumerateGreenness {
    public static void main(String[] args) {
        String[] lines = getStdin();

        // Parse input
        int n = Integer.parseInt(lines[0]);
        int[] gardens = new int[n];
        String[] gardenStrings = lines[1].split(" ");
        for (int i = 0; i < n; i++) {
            gardens[i] = Integer.parseInt(gardenStrings[i]);
        }

        // Calculate and print the "greenness on the other side" for each garden
        for (int i = 0; i < n; i++) {
            int leftGreenness = findLeftGreenness(gardens, i);
            int rightGreenness = findRightGreenness(gardens, i);

            // The greenness on the other side is the maximum of left and right greenness
            int otherSideGreenness = Math.max(leftGreenness, rightGreenness);

            System.out.println(otherSideGreenness);
        }
    }

    private static int findLeftGreenness(int[] gardens, int index) {
        int maxGreenness = Integer.MIN_VALUE;
        for (int i = index - 1; i >= 0; i--) {
            maxGreenness = Math.max(maxGreenness, gardens[i]);
        }
        return maxGreenness;
    }

    private static int findRightGreenness(int[] gardens, int index) {
        int maxGreenness = Integer.MIN_VALUE;
        for (int i = index + 1; i < gardens.length; i++) {
            maxGreenness = Math.max(maxGreenness, gardens[i]);
        }
        return maxGreenness;
    }

    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine()).append("\n");
        }

        scanner.close();
        return input.toString().trim().split("\n");
    }
}
/*

They say that the grass is always greener on the other side. This means that other people always seem to be doing better than you. Since we are programmers, we can quantify the greenness of all the "other sides" by writing some code!

阻

There are n gardens in a row. The gardens are numbered 1 to n and the i-th garden has a greenness of a[i], with higher numbers representing greener gardens. Let us define the "greenness on the other side" for the owner of the i-th garden as the greenest garden besides the i-th garden.

Create a program to enumerate all of the "greenness on the other side" for every garden in a row.

Given the greenness of n gardens, please calculate the "greenness on the other side" for each garden.

Implementation details
CLI

Please implement a CLI application that takes the input value as an argument and outputs the result to standard output. For details, see the "CLI application template" section at the bottom of this page.

Input rules

./enumerate-greenness <input.in

input.in

[1] [2]... a[n]

2≤ n ≤ 100000, Integer

-1,000,000,000 ≤ ali≤ 1,000,000,000, Integer

Output rule

Print n lines. On the i-th line, print the "greenness on the other side" for the i-th garden owner.
Output rule

• Print n lines. On the i-th line, print the "greenness on the other side" for the i-th garden owner.

1/0 examples

Example 1 - input

2

13

i

田-阻

3

3

Example 1 output

1

There are only 2 gardens, so the greenness of the other garden is the "greenness on the other side" for each garden.

Example 2-input

-10 2 100000

Tes

x
each garden.

Example 2-input

3

-10 2 100000

阻

Example 2-output

100000

100000

2

The 3-rd garden is very green but people are not good at seeing how green their own garden is. Therefore, the owner of the 3-rd garden believes that the 2-nd garden is greener than his, even though it only has a greenness of 2.

You can find expected pairs of input and output in the test/basic_testcases.json directory. Please refer to this directory when implementing.
Command line application template for Java

Implement CLI application by editing App.java

1

You may add new files to keep your code clean, if it is allowed in your challenge.

How to get stdin lines

You can get stdin lines by getStdin() function.

public static void main(String[] args) {

String[] lines = getStdin();

// code to run

}

How to output result

You can use Sytem.out.println method to output you result in stdout.

System.out.println(args);    Memory Limit(MB): 512, Execution Timeout(ms): 6000

along with this what should i give command
 */