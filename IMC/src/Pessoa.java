public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    Pessoa(String n, double p, double a){
        nome = n;
        peso = p;
        altura = a;
    }


    public double calcularIMC() {
        return peso / (altura * altura);
    }



    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Altura: " + getAltura());
        System.out.println("IMC: " + calcularIMC());
        System.out.println("-----------------");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }


    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }
}
