public class Main {
    public static void main(String[] args) {
        int teste = 2;
        Autor autor1 = new Autor();
        autor1.setEmailAutor("joãocleber@gmail.com");
        autor1.setCPFAutor("043.321.233-32");
        autor1.setNomeAutor("João Cleber");

        Livro livro1 = new Livro(autor1);
        livro1.mostrarDetalhes();
        Livro livro2 = new Livro(autor1);
        livro2.mostrarDetalhes();

        Ebook ebook1 = new Ebook(autor1);
        ebook1.setNome("Herança em Java");
        ebook1.getNome();
        ebook1.mostrarDetalhes();


        Fisico fisico = new Fisico(autor1);
        fisico.mostrarDetalhes();
        fisico.setNome("Herança em java ");
        fisico.setValor(400);
        //fisico.setIsbn();
        fisico.mostrarDetalhes();


        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarLivro(fisico);
        carrinhoCompras.adicionarLivro(ebook1);
        System.out.println("Valor total: " + carrinhoCompras.getValorTotal());
    }
}