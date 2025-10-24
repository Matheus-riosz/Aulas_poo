public class Main {
    public static void main(String[] args) {
        CarroEletrico carro = new CarroTesla("Model X", "São Paulo", 25);

        Recarregavel recarregavel = carro;
        Autonomo autonomo = carro;


        recarregavel.recarregar();
        autonomo.dirigindoAutonomo();


        System.out.println("Tempo máximo para recarga: " + Recarregavel.TEMPO_MAXIMO + " minutos");
        System.out.println("Suporte GPS: " + Autonomo.SUPORTE_GPS);
    }
}
