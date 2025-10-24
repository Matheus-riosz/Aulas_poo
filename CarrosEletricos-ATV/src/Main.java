public class Main {
    public static void main(String[] args) {

        Recarregavel recarregavel = carro;
        Autonomo autonomo = carro;


        System.out.println("Tempo máximo para recarga: " + Recarregavel.TEMPO_MAXIMO + " minutos");
        System.out.println("Suporte GPS: " + Autonomo.SUPORTE_GPS);
    }
}
