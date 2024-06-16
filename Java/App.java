import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        SimpleInterestFormula calculator = new SimpleInterestFormula("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);
    }
}
