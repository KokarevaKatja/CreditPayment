public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1_000_000, 0.8325, 12));
        System.out.println(service.calculate(1_000_000, 0.4163, 24));
        System.out.println(service.calculate(1_000_000, 0.2775, 36));

    }
}
