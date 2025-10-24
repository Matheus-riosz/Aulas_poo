public class CarroTesla extends CarroEletrico {

    public CarroTesla(String modelo, String destino, int minutos) {
        super(modelo, destino, minutos);
    }

    @Override
    public void recarregar() {
        System.out.println(getModelo() + " está recarregando...");
    }

    @Override
    public void dirigindoAutonomo() {
        System.out.println(getModelo() + " está dirigindo sozinho até " + getDestino() + "!");
    }
}
