public class Ebook extends Livro {
    private String watermark;

    // Constructors
    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double porcentagem){
        if(porcentagem > 15){
            System.out.println("Desconto não pode ser maior que 15%");
            return false;
        }
        double desconto = this.getValor() * porcentagem / 100;
        this.setValor(this.getValor() - desconto);
        return super.aplicarDesconto(porcentagem);

    }

    @Override
    public void mostrarDetalhes() {
        String mensagem = "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Watermark: " + getWatermark());
        System.out.println("------------");
    }

    // Getters and Setters
    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}