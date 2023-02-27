public class CreditPaymentService {
    public int calculate(double loanAmount, double loanTerm, double interestRate){
        double interestRateMec = interestRate / 12 / 100;
        double koff = (interestRateMec * Math.pow(1 + interestRateMec, loanTerm)) / (Math.pow(1 + interestRateMec, loanTerm) - 1);
        double payment = koff * loanAmount;
        //double payment = loanAmount * interestRateMec * Math.pow(1 + interestRateMec, loanTerm) / (Math.pow(1 + interestRateMec, loanTerm) - 1);
        return(int) payment;
        }
    }