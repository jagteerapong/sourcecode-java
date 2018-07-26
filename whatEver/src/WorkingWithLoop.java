
public class WorkingWithLoop {

    public static void main(String[] args) {
//        int number = 1;
//        int sum = sumData(number);
//        System.out.println(sum);

        WorkingWithLoop workingWithLoop = new WorkingWithLoop();
        workingWithLoop.pringHeart();
    }

    private static int sumData(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public void pringHeart() {
        int start = 9;
        // line1
        System.out.println(" **   **  ");
        // line2
        for (int i = 0; i < 9; i++) {
            if (i == start / 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }
        newLine();

        // line3-7
        for (int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
            newLine();
            start = start - 2;
        }

    }

    private void newLine() {
        System.out.println();
    }

    private void generateStar(int start) {
        for (int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private void generateSpace(int round) {
        for (int a = 0; a < round; a++) {
            System.out.print(" ");
        }
    }

}
