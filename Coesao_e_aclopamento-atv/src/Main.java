public class Main {
    public static void main(String[] args) {

        // Injeção de dependências manual (poderia ser via Spring, Guice, etc.)
        PaymentMethod greenCard = new GreenCardPayment();
        EmailService emailService = new EmailService();

        PaymentProcessor processor = new PaymentProcessor(greenCard, emailService);
        processor.executePayment(250.00, "cliente@exemplo.com");

        System.out.println();

        // Mudando o método de pagamento — sem alterar PaymentProcessor
        PaymentMethod payPay = new PayPayPayment();
        PaymentProcessor processor2 = new PaymentProcessor(payPay, emailService);
        processor2.executePayment(500.00, "usuario@exemplo.com");
    }
}
