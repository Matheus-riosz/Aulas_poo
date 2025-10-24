public abstract class CarroEletrico implements Recarregavel, Autonomo {
    private String modelo;
    private String destino;
    private int minutos;

    public CarroEletrico(String modelo, String destino, int minutos) {
        this.modelo = modelo;
        this.destino = destino;
        this.minutos = minutos;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDestino() {
        return destino;
    }

    public int getMinutos() {
        return minutos;
    }
}
