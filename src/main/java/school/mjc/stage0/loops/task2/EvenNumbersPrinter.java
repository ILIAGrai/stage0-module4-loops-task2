package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int c=0;
        while(c<=printTillInclusive){
            System.out.println(c);
            c+=2;
        }
    }
}
