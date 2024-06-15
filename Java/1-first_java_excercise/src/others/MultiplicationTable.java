package others;

public class MultiplicationTable {
    public int Multiply(int integer, int exponential){
        return integer * exponential;
    }

    public int Factorial(int integer, int factorialNum){
        int start = 1;

        for (int i = 0; i < factorialNum; i++) {
            start *= integer;
        }

        return start;
    }

    public void print(int table){
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", table, i, table * i);
        }
    }
}
