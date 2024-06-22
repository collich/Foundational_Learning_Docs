import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] listOfMarks = {};

    public Student(String name, int... listOfMarks){
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public int getNumberOfMarks(){
        return this.listOfMarks.length;
    }

    public int getTotalSumOfMarks(){
        int total = 0;
        for (int number : listOfMarks){
            total += number;
        }
        return total;
    }

    public int getMaximumMark(){
        int max = Integer.MIN_VALUE;
        for (int number: this.listOfMarks){
            max = Integer.max(max, number);
        }
        return max;
    }

    public int getMinimumMark(){
        int min = Integer.MAX_VALUE;
        for (int number: this.listOfMarks){
            min = Integer.min(min, number);
        }
        return min;
    }

    public BigDecimal getAverageMarks(){
        BigDecimal total = new BigDecimal(getTotalSumOfMarks());
        BigDecimal number = new BigDecimal(getNumberOfMarks());

        return total.divide(number, 3, RoundingMode.UP);
    }
}
