public class Atleta extends Pessoa {
    private String esportePraticado;

    Atleta(String n, double p, double a, String esportePraticado) {
        super(n, p, a);
        this.esportePraticado = esportePraticado;
    }


    @Override
    public double calcularIMC() {
        double imcBase = super.calcularIMC();
        return imcBase * 0.95;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("Esporte praticado: " + esportePraticado);
        System.out.println("IMC ajustado Atleta: " + calcularIMC());
        System.out.println("-----------------");
    }


    public String getEsportePraticado() {
        return esportePraticado;
    }
    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
