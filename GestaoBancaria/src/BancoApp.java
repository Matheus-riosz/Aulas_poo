public class BancoApp {
    public static void main(String[] args) {
        System.out.println("================= GESTÃO DE CONTAS BANCÁRIAS=============\n");

        try {
            ContaCorrente conta1 = new ContaCorrente("Matheus Lindooo", 0001, 0.5);
            ContaPoupanca conta2 = new ContaPoupanca("Victor Professor", 2222, 0.3);

            System.out.println("===============>Contas criadas com sucesso!\n");
            conta1.exibirInformacoes();
            conta2.exibirInformacoes();

            conta1.depositar(1000.0);
            conta2.depositar(2000.0);

            conta1.exibirInformacoes();
            conta2.exibirInformacoes();

            System.out.println("\n======================>Realizando saque de R$200,00 na conta corrente...");
            conta1.sacar(200.0);
            conta1.exibirInformacoes();
            conta2.exibirInformacoes();

            System.out.println("================>Transferindo R$300,00 da conta poupança para a conta corrente...");
            conta2.transferir(conta1, 300.0);

            conta1.exibirInformacoes();
            conta2.exibirInformacoes();

            System.out.println(">============Atualizando saldos...");
            conta1.atualizarSaldo();
            conta2.atualizarSaldo();






            System.out.println("\n===== =======EXTRATOS FINAIS=== =====");
            conta1.imprimirExtrato();
            conta2.imprimirExtrato();

            System.out.println("\n===========>.TESTE DE EXCEÇÃO: tentando sacar valor maior que o saldo...");
            double valorTentativa = conta1.getSaldo() + 1000.0;
            System.out.println("Tentando sacar R$" + valorTentativa + " da conta corrente......");
            conta1.sacar(valorTentativa);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n===== ================FIM DO PROGRAMA ====================");
    }
}
