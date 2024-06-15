package others;

import java.util.ArrayList;

public class PerfectNumber {
    private int number;
    private ArrayList<Integer> listNumber;

    public PerfectNumber(int number){
        this.number = number;
        this.listNumber = new ArrayList<Integer>();
    }

    private void createListOfPerfectNumber(){
        for (int i = 1; i < this.number; i++) {
            if (this.number % i == 0) {
                listNumber.add(i);
            }
        }
    }

    public boolean isPerfectNumber(){
        if (this.listNumber.isEmpty()){
            createListOfPerfectNumber();
        }
        int sumOfNumbers = this.listNumber.stream().mapToInt(i -> i.intValue()).sum();
        if (sumOfNumbers == this.number){
            return true;
        }
        return false;
    }
    
    public void printListOfNumber(){
        if (this.listNumber.isEmpty()){
            createListOfPerfectNumber();
        }
        System.out.println(this.listNumber);
    }


}
