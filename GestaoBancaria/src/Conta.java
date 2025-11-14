public abstract class Conta {
    private int numero;
    private String titular;
    private double saldo;



    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: R$" + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso!");
    }



    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }


    public void exibirInformacoes() {
        System.out.println("Conta nº " + numero + " || Titular: " + titular + " || Saldo: R$" + saldo);
    }
    public abstract void atualizarSaldo();
}