public class CreditPaymentService {

    public double calculate(int creditAmount, double creditRate, int months) {

        double monthRate = creditRate / 12 / 100;

        double sum = 1 + monthRate;

        double creditPayment = creditAmount * ((monthRate * Math.pow(sum, months)) / (Math.pow(sum, months) - 1));

        return creditPayment;

    }
}
