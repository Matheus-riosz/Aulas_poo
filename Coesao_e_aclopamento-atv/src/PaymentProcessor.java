public class PaymentProcessor {

    private final PaymentMethod paymentMethod;
    private final EmailService emailService;

    // Injeção de dependências via construtor
    public PaymentProcessor(PaymentMethod paymentMethod, EmailService emailService) {
        this.paymentMethod = paymentMethod;
        this.emailService = emailService;
    }

    public void executePayment(double amount, String email) {
        paymentMethod.process(amount);
        emailService.sendPaymentConfirmation(email, amount);
    }
}
