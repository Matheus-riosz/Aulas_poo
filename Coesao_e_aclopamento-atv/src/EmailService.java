public class EmailService {

    public void sendPaymentConfirmation(String recipient, double amount) {
        System.out.println("Enviando e-mail para " + recipient +
                ": Pagamento de R$ " + amount + " confirmado!");
    }
}
