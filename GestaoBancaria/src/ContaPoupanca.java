public class ContaPoupanca extends Conta implements OperacoesBancarias {
    private double rendimentoMensal;

    public ContaPoupanca(String titular, int numero, double rendimentoMensal) {
        super(numero, titular);
        this.rendimentoMensal = rendimentoMensal;
    }
    @Override
    public void atualizarSaldo() {
        double rendimento = getSaldo() * (rendimentoMensal / 100);
        depositar(rendimento);
        System.out.println("Rendimento mensal de R$" + rendimento + " aplicado!");
    }



    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferencia de R$" + valor + " concluída com sucesso!");
    }



    @Override
    public void imprimirExtrato() {
        System.out.println("[Extrato da Conta Poupança]");
        exibirInformacoes();
        System.out.println("Rendimento mensal: " + rendimentoMensal + "%");
    }
}