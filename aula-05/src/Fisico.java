public class Fisico extends Livro {
    private double taxaImpressao;

    Fisico(Autor autor) {
        super(autor);

    }

    @Override
    public void mostrarDetalhes() {
        String mensagem = "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Valor Taxa de impressao" + getTaxaImpressao());
        System.out.println("------------");


        if (temAutor()) {
            getAutor().mostrarDetalhesAutor();
        }

        System.out.println("-----------");

    }

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 10) {
            System.out.println("Desconto não pode ser maior que 15%");
            return false;
        }
        return super.aplicarDesconto(porcentagem);
    }
    public double getTaxaImpressao() {
        return this.getValor() * 5 / 100;
    }

    public void setTaxaImpressao(double taxaImpressao) {
        this.taxaImpressao = taxaImpressao;
    }
}
