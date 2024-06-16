import java.math.BigDecimal;

public class SimpleInterestFormula {
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal years;

    public SimpleInterestFormula(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }
    public BigDecimal calculateTotalValue(int years){
        this.years = new BigDecimal(years);
        // BigDecimal total = this.principal.add(this.principal.multiply(this.interest.multiply(this.years)));
        BigDecimal total = this.principal.add(
                            this.principal.multiply(this.interest)
                                            .multiply(this.years));
        return total;
    }
}
