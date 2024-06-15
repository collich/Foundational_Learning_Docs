import others.*;

public class App {
    public static void main(String[] args) throws Exception {
        PerfectNumber number = new PerfectNumber(28);
        System.out.println(number.isPerfectNumber());
        number.printListOfNumber();
    }
}
