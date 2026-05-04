public class Towers {

    private int numDiscs; // Number of discs

    public Towers(int n) {
        this.numDiscs = n;

        // Start the recursive process
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            // Move n-1 discs to temporary peg
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);

            // Move current disc
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);

            // Move n-1 discs to final peg
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}