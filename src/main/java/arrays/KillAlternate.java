package arrays;

public class KillAlternate {

    public static void main(String[] args) {

        int cellsCount = 100;

        int cells[] = new int[cellsCount];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = i + 1;
        }

        kill(cells);

    }

    private static void kill(int[] cells) {

        for (int i = 0; i < cells.length; i = i + 2) {

            int current = i + 1;

            if (cells[i + 1] >= 0) {
                
            }

        }

    }

}
