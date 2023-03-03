public class CreditPaymentService {
    public int calculate(double loanAmount, double loanTerm, double interestRate) {

        double interestRateMec = interestRate / 12 / 100;
        double ratio = (interestRateMec * Math.pow(1 + interestRateMec, loanTerm)) / (Math.pow(1 + interestRateMec, loanTerm) - 1);
        double payment = ratio * loanAmount;

        return (int) payment;
    }
}