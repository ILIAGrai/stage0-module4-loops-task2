package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
int c1=1;
int c3=1;
System.out.println(1);
while(c1<=printToInclusive){

    c3=c3*c1;
    System.out.println(c3);
    c1++;
}
    }
}
