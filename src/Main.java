import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;

        double creditRate = 9.9;

        int months = 12;

        double creditPayment = service.calculate(creditAmount, creditRate, months);

        System.out.println(service.calculate(1_000_000, 9.9, 12));
        System.out.println(service.calculate(1_000_000, 9.9, 24));
        System.out.println(service.calculate(1_000_000, 9.9, 36));

    }
}
