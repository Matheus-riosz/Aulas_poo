public abstract class FormaGeometrica {
    protected String cor;

    public FormaGeometrica(String cor){
        this.cor = cor;
    }

    public void exibirCor() {
        System.out.println("A cor da Forma é: "+getCor());
    }
    public abstract double calcularArea();

    public void exibirDetalhes(){
        System.out.println("A cor da forma e: "+cor);
        System.out.println(calcularArea());

    }

    public String getCor() {
        return cor;
    }
}
