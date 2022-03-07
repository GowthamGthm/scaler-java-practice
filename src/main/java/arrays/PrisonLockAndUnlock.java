package arrays;

public class PrisonLockAndUnlock {

    /**
     * Solution - perfect squares will always be open
     * 
     */

    public static void main(String[] args) {

        int cellsCount = 500;
        int cells[] = new int[cellsCount];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = 1;
        }

        solvePrisonProblem(cells);
//        solvePrisonProblemWithFormula(cells);

    }

    private static void solvePrisonProblem(int[] cells) {

        for (int i = 1; i < cells.length; i++) {

            int currentJumpingNumber = i + 1;

            for (int j = i; j < cells.length; j++) {
                int currentCell = j + 1;
                if (currentCell % currentJumpingNumber == 0) {
                    if (cells[j] == 0) {
                        cells[j] = 1;
                    } else {
                        cells[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == 1) {
                System.out.println(i + 1 + "   " + cells[i]);
            }
        }
    }

    private static void solvePrisonProblemWithFormula(int[] cells) {

        for (int i = 0; i < cells.length; i++) {

            int currentJumpingNumber = i + 1;
            int square = (currentJumpingNumber * currentJumpingNumber);

            if (square <= 100) {
                System.out.println(square);
            }
        }
    }

}
