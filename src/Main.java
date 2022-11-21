public class Main {
    public static void main(String[] args) {
        double amount = 1_000_000; // Сумма кредита
        double term = 12; //Срок погашения кредита
        double percent = 9.99; // Процентная ставка годовая
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(payment);

        System.out.println(payment);

    }
}