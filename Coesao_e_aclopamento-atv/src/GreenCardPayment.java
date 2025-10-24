public class GreenCardPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        System.out.println("Processando pagamento de R$ " + amount + " via Green Card...");
        // Lógica específica do Green Card poderia estar aqui
    }
}

