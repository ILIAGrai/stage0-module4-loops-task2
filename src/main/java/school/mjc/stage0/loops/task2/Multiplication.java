package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else {
            if (multiplyByAndToInclusive < 0) {
                for (int i = 0; i >= multiplyByAndToInclusive; i--) {
                    int n = 0;
                    n = multiplyByAndToInclusive * i*-1;
                    System.out.println(n);
                }


            } else {
                for (int i = 0; i <= multiplyByAndToInclusive; i++) {
                    int n = 0;
                    n = multiplyByAndToInclusive * i;
                    System.out.println(n);

                }
            }

        }
    }
}
