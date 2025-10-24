public class PayPayPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processando pagamento de R$ " + amount + " via PayPay...");
        // Lógica específica do PayPay poderia estar aqui
    }
}
