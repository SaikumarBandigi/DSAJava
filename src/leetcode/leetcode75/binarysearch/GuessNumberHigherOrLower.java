package leetcode.leetcode75.binarysearch;

// Base class with the guess API
class GuessGame {
    private int pickedNumber; // The number to guess

    // Constructor to initialize the picked number
    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    // Simulated guess API
    public int guess(int num) {
        if (num > pickedNumber) {
            return -1; // Guess is higher than the picked number
        } else if (num < pickedNumber) {
            return 1; // Guess is lower than the picked number
        } else {
            return 0; // Correct guess
        }
    }

}

public class GuessNumberHigherOrLower extends GuessGame {
    // Constructor to pass the picked number to the base class
    public GuessNumberHigherOrLower(int pickedNumber) {
        super(pickedNumber);
    }

    // Solution class method
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow
            int result = guess(mid);

            if (result == 0) {
                return mid; // Found the number
            } else if (result == -1) {
                end = mid - 1; // The PickedNumber is lower
            } else {
                start = mid + 1; // The PickedNumber is higher
            }
        }

        return -1; // Should never reach here
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 10; // Range of numbers
        int pick = 6; // Number to guess

        GuessNumberHigherOrLower game = new GuessNumberHigherOrLower(pick);
        int result = game.guessNumber(n);

        System.out.println("Picked number is: " + result); // Output should be 6
    }

}
