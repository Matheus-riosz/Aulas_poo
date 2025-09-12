public class CarrinhoCompras {
    private double valorTotal;

    public void adicionarLivro(Livro livro) {
        System.out.println("Livro adicionado ao carrinho bb =)" + livro);
        livro.aplicarDesconto(5);
        valorTotal += livro.getValor();

    }
    public double getValorTotal() {
        return valorTotal;
    }
}
