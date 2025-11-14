public class ContaCorrente extends Conta implements OperacoesBancarias {
    private double taxaOperacao;

    public ContaCorrente(String titular, int numero, double taxaOperacao) {
        super(numero, titular);
        this.taxaOperacao = taxaOperacao;
    }
    @Override
    public void atualizarSaldo() {
        double desconto = getSaldo() * (taxaOperacao / 100);
        System.out.println("Taxa de operação aplicada: R$" + desconto);
        try {

            super.sacar(desconto);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente para aplicar taxa.");
        }
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " concluída com sucesso!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("[Extrato Conta Corrente]");
        exibirInformacoes();
        System.out.println("Taxa de operação: " + taxaOperacao + "%");
    }
}