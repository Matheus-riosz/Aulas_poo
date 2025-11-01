   public class BancoSeguro {
        public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria();

            try {
                System.out.println("Tentando sacar R$400...");
                conta.sacar(400);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Operação finalizada.\n");
            }


            try {
                System.out.println("Tentando sacar R$1200.");
                conta.sacar(1200);
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Operação finalizada.\n");
            }
        }
    }
