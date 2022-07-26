public class CreditPaymentService {

    public double calculate(int creditAmount, double monthRate, int months) {

        double sum = 1 + monthRate;

        return creditAmount * ((monthRate * Math.pow(sum, months)) / (Math.pow(sum, months) - 1));

    }
}
