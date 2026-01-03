package accenture.rotatearr;

public class secondMaxEl {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 9, 3, 5, 8};

        if (array.length < 2) {
            System.out.println("Array has less than two elements. Unable to find the second largest element.");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > firstMax) {
                secondMax = firstMax;
                firstMax = j;
            } else if (j > secondMax && j < firstMax) {
                secondMax = j;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondMax);
        }

    }
}
