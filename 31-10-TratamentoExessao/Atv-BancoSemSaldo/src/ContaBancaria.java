public class ContaBancaria {
    private double saldo = 1000.00;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {

            throw new SaldoInsuficienteException(
                    "Saldo insuficiente,vc ta liso! Valor solicitado: R$" + valor + " | Saldo disponível: R$" + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso chefe! Saldo atual: R$" + saldo);
        }
    }
}

