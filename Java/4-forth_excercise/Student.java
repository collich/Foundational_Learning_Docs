import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    // private int[] listOfMarks = {};
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    public Student(String name, int... listOfMarks){
        this.name = name;
        // this.listOfMarks = listOfMarks;
        for (int mark : listOfMarks){
            this.listOfMarks.add(mark);
        }
    }

    public int getNumberOfMarks(){
        return this.listOfMarks.size();
    }

    public int getTotalSumOfMarks(){
        int total = 0;
        for (int number : listOfMarks){
            total += number;
        }
        return total;
    }

    public int getMaximumMark(){
        // int max = Integer.MIN_VALUE;
        // for (int number: this.listOfMarks){
        //     max = Integer.max(max, number);
        // }
        // return max;
        return Collections.max(this.listOfMarks);
    }

    public int getMinimumMark(){
        // int min = Integer.MAX_VALUE;
        // for (int number: this.listOfMarks){
        //     min = Integer.min(min, number);
        // }
        // return min;
        return Collections.min(this.listOfMarks);
    }

    public BigDecimal getAverageMarks(){
        BigDecimal total = new BigDecimal(getTotalSumOfMarks());
        BigDecimal number = new BigDecimal(getNumberOfMarks());

        return total.divide(number, 3, RoundingMode.UP);
    }

    public void addNewMark(int mark){
        this.listOfMarks.add(mark);
    }

    public void removeMarkAtIndex(int index){
        this.listOfMarks.remove(index);
    }
}
