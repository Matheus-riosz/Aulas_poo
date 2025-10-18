public class Main {
    public static void main(String[] args) {
        CarroEletrico carro = new CarroEletrico("X");


        Recarregavel recarregavel = carro;
        Autonomo autonomo = carro;

        // Usando métodos via interface
        recarregavel.recarregar(40);

        // Usando constantes das interfaces
        System.out.println("Tempo máximo para recarga: " + Recarregavel.TEMPO_MAXIMO + " minutos");
        System.out.println("Suporte GPS: " + Autonomo.SUPORTE_GPS);
    }
}
