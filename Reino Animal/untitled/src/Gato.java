Public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }


    @Override
    public void fazerSom() {
        System.out.println(nome + " faz miau!");
    }
}

