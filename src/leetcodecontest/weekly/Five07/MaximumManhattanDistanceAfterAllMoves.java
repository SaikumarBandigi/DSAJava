package leetcodecontest.weekly.Five07;

public class MaximumManhattanDistanceAfterAllMoves {

    public static void main(String[] args) {
        String moves = "L_D_";
        System.out.println(new MaximumManhattanDistanceAfterAllMoves().maxDistance(moves));
    }

    public int maxDistance(String moves) {
        int dx = 0;
        int dy = 0;
        int underscore = 0;

        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U' -> dy++;
                case 'D' -> dy--;
                case 'R' -> dx++;
                case 'L' -> dx--;
                default -> underscore++;
            }
        }

        return Math.abs(dx) + Math.abs(dy) + underscore;
    }

}
